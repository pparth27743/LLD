package DesignPattern.ChainOfResponsibilty;

public class ChainOfResponsibilityMain {

    public static void main(String args[]) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "Error Sucks");
        logProcessor.log(LogProcessor.INFO, "Info is good");
        logProcessor.log(LogProcessor.DEBUG, "Debug is just finneeee");
    }

}

