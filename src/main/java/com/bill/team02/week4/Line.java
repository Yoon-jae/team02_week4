package com.bill.team02.week4;

public class Line {

    private double usedMinutes;
    private String lineUserName;

    public Line(String lineUserName) {
        this.lineUserName = lineUserName;
    }

    public void setUsedMinutes(double usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    public double getUsedMinutes() {
        return usedMinutes;
    }

    public String getLineUserName() {
        return lineUserName;
    }

}
