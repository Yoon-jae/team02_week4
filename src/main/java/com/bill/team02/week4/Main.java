package com.bill.team02.week4;

import org.junit.Test;

public class Main {

    public Main() {
        // Intentionally Empty
    }

    public static void main(String[] args) {
        AppController appController = new AppController();
        appController.run("input_PersonalInfo.txt");
    }
 
}