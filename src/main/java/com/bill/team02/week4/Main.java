package com.bill.team02.week4;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        AppController appController = new AppController();
        appController.run("input_PersonalInfo.txt");
    }
 
}