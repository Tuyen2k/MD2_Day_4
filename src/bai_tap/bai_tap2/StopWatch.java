package bai_tap.bai_tap2;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public int getElapsedTime() {
        int milliSecond = ((endTime.getHour() - startTime.getHour()) * 3600
                + (endTime.getMinute() - startTime.getMinute()) * 60
                + (endTime.getSecond() - startTime.getSecond()) * 1000);
        return milliSecond;
    }
}
