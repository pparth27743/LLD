package DesignPattern.ChainOfResponsibilty;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {

        if(logLevel == INFO) {
            System.out.println("INFO Printer: " + message);
        }
        else {
            super.log(logLevel, message);
        }

    }
}
