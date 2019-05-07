package com.dumpkin.avivi;

public class Worker implements Salary {
    String name;
    private int forMonth;
    private int monthCount;

    public void setForMonth(int forMonth) {
        this.forMonth = forMonth;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    @Override
        public long salary() {
            return forMonth*monthCount;
    }
}
