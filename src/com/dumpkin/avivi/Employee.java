package com.dumpkin.avivi;

public class Employee implements Salary{

    String name;
   private int forHour;
   private int timeCount;

    public void timeCount(int timeCount) {
        this.timeCount = timeCount;
    }

    public void setForHour(int forHour) {
        this.forHour = forHour;
    }

    @Override
    public long salary() {
        return forHour*timeCount;
    }
}
