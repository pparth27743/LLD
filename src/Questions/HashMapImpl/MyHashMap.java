package Questions.HashMapImpl;

import java.util.HashSet;
import java.util.Set;

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


    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K,V>> set = new HashSet<>();

        for(int i=0; i<hashTable.length; i++) {
            if(hashTable[i] != null) {
                Entry<K,V> curr = hashTable[i];
                while(curr != null) {
                    set.add(curr);
                    curr = curr.next;
                }
            }
        }
        return set;
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
        if(needToExpand()) {
            expand();
        }
    }

    private boolean needToExpand() {
        return (((float)currentSize)/hashTable.length) > DEFAULT_LOAD_FACTOR;
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

    /*
    - double the hashtable size
    - iterate over old hashTable and add (K,V) in new hashTable
     */
    private void expand() {
        if(2*hashTable.length > MAXIMUM_CAPACITY) {
            System.out.println("Capacity Can't further be expanded");
            return;
        }

        Entry[] newHashTable = new Entry[2*hashTable.length];
        for(int i=0; i<hashTable.length; i++) {
            Entry curr = hashTable[i];
            while(curr != null) {
                putToNewHashTable((K)curr.key, (V)curr.value, newHashTable);
                curr = curr.next;
            }
        }
        this.hashTable = newHashTable;
    }

    private void putToNewHashTable(K key, V value, Entry[] hashTable) {
        int hashValue = key.hashCode() % hashTable.length;
        if(hashTable[hashValue] == null) {
            Entry entry = new Entry(key, value);
            hashTable[hashValue] = entry;
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
        }
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
