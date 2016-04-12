package com.bill.team02.week4;

public class Main {

    private Main() {
        // This is blank constructor.
    }

    /*public static void main(String[] args) {
        AppController appController = new AppController();
        appController.run("input_PersonalInfo.txt");
    }*/
    
    public static void main(String inputFile){
        AppController appController = new AppController();
        appController.run(inputFile);
    }
}