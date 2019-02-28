public class Time {
    private int hour = 0;
    private int minute = 0;
    private int seconds = 0;

    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }


    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setTime(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public String toString() {
        if (hour < 10 & minute < 10 & seconds < 10) {
            return "Time[" + 0 + getHour() + ":" + 0 + getMinute() + ":" + 0 + getSeconds() + "]";

        }
        if (hour < 10 & minute < 10) {
            return "Time[" + 0 + getHour() + ":" + 0 + getMinute() + ":" + getSeconds() + "]";
        }

        if (hour < 10 & seconds < 10) {
            return "Time[" + 0 + getHour() + ":" + getMinute() + ":" + 0 + getSeconds() + "]";
        }

        if (minute < 10 & seconds < 10) {
            return "Time[" + getHour() + ":" + 0 + getMinute() + ":" + 0 + getSeconds() + "]";
        }
        if(hour<10){
            return "Time[" +0+ getHour() + ":" + getMinute() + ":" + getSeconds() + "]";
        }
        if(minute<10){
            return "Time[" + getHour() + ":" +0+ getMinute() + ":" + getSeconds() + "]";
        }
        if(seconds<10){
            return "Time[" + getHour() + ":" + getMinute() + ":" +0+ getSeconds() + "]";
        }
        return "Time[" + getHour() + ":" + getMinute() + ":" + getSeconds() + "]";
    }


    public void nextSecond() {
        seconds++;
        if (seconds == 60) {
            if (minute != 60) {
                minute++;
                seconds = 0;
            }
            if (minute == 60) {
                hour++;
                minute = 0;
                seconds = 0;
            }
            if (hour == 24) {
                hour = 0;
                minute = 0;
                seconds = 0;
            }
        }


    }

    public void previousSecond() {
        seconds--;
        if (seconds < 0) {
            if (minute != 0) {
                minute--;
                seconds = 59;
            }
            if (minute == 0) {
                if (hour != 0) {
                    hour--;
                    minute = 59;
                    seconds = 59;
                }
            }

            if (hour == 0) {
                hour=23;
                minute = 59;
                seconds = 59;
            }

        }
    }
}
