package com.bill.team02.week4;

public class Main {

    private Main() {
        // Intentionally Empty
    }

    public static void main(String[] args) {
        AppController appController = new AppController();
        appController.run("input_PersonalInfo.txt");
    }
 
}