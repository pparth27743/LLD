package Questions.TicTaCToe.HashMapImpl;

public class MyHashMap<K, V> {

    class Entry<K,V> { // provide K,V as generic arg in here
        K key;
        V value;
        Entry next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    };

    public static int DEFAULT_CAPACITY = 16;
    public static int MAXIMUM_CAPACITY = 1 << 30;
    public static float DEFAULT_LOAD_FACTOR = 0.75f;

    private int currentSize;
    private Entry[] hashTable;

    MyHashMap() {
        this.hashTable = new Entry[DEFAULT_CAPACITY];
        this.currentSize = 0;
    }

    MyHashMap(int capacity) {
        this.hashTable = new Entry[getTableSize(capacity)];
        this.currentSize = 0;
    }

    /* Notes:
          - calculate the hash
          - check if that key already exists, if yes overwrite it
          - if key doesn't exit
              - if that slot is also null then create first entry in the slot
              - else go to last entry and add the k,v
              - currentSize++;
       */
    public void put(K key, V value) {
        int hashValue = key.hashCode() % hashTable.length;
        if(hashTable[hashValue] == null) {
            Entry entry = new Entry(key, value);
            hashTable[hashValue] = entry;
            this.currentSize++;
        }
        else {
            Entry curr = hashTable[hashValue], prevEntry = null;
            while(curr != null) {
                if(curr.key.equals(key)) {
                    curr.value = value;
                    return;
                }
                prevEntry = curr;
                curr = curr.next;
            }
            prevEntry.next = new Entry(key, value);
            this.currentSize++;
        }
    }

    /*
       - calculate hash
       - if key is not there then return null
        */
    public V getValue(K key) {
        int hashValue = key.hashCode() % hashTable.length;
        if(hashTable[hashValue] == null) {
            return null;
        }
        else {
            Entry curr = hashTable[hashValue];
            while(curr != null) {
                if(curr.key.equals(key))
                    return (V) curr.value;
                else
                    curr = curr.next;
            }
        }
        return null;
    }

    public int size() {
        return this.currentSize;
    }

    /*
    - calculate hashvalue
    - if key present then remove it and do currsize--;
     */
    public V remove(K key) {
        int hashValue = key.hashCode() % hashTable.length;

        Entry curr = hashTable[hashValue];
        Entry pseudoHead = new Entry(-1, null), prev = pseudoHead;
        while(curr != null) {
            if(curr.key.equals(key)){
                prev.next = curr.next;
                currentSize--;
                hashTable[hashValue] = pseudoHead.next;
                return (V)curr.value;
            }
            else {
                prev = curr;
                curr = curr.next;
            }
            
        }
        return null;
    }


    private int getTableSize(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;

        return (n<0) ? 1 : (n>=MAXIMUM_CAPACITY ? MAXIMUM_CAPACITY : n+1);
    }

}