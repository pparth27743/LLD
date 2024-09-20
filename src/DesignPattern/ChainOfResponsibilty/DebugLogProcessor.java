package DesignPattern.ChainOfResponsibilty;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == DEBUG) {
            System.out.println("DEBUG Printer: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
