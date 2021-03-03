package spc.javajuniors.myfittimer;

public class Timer {
    
    private int hour = 0, min = 0, sec = 0, milli = 0;
    private String mainDisplay = "", milliDisplay = "", timeDisplay = "";
    
    public Timer() {

    }
    
    // getters & setters
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMilli() {
        return milli;
    }

    public void setMilli(int milli) {
        this.milli = milli;
    }

    public String getMainDisplay() {
        return mainDisplay;
    }

    public void setMainDisplay(String mainDisplay) {
        this.mainDisplay = mainDisplay;
    }

    public String getMilliDisplay() {
        return milliDisplay;
    }

    public void setMilliDisplay(String milliDisplay) {
        this.milliDisplay = milliDisplay;
    }

    public String getTimeDisplay() {
        return timeDisplay;
    }

    public void setTimeDisplay(String timeDisplay) {
        this.timeDisplay = timeDisplay;
    }
    
    // clears the timer displays to 0
    public void clear() {
        hour = 0; min = 0; sec = 0; milli = 0;
        mainDisplay = "00:00:00";
        milliDisplay = "000";
    }
    
    // resets the timer displays to 0 and clears the list
    public void reset() {
        hour = 0; min = 0; sec = 0; milli = 0;
        mainDisplay = "00:00:00";
        milliDisplay = "000";
        timeDisplay = "";
    }

    // sets the main timer display (Hours, Minutes, Seconds)
    public void setMainTimer() {
        mainDisplay = "";
        
        // formats the hours
        if (hour < 10) {
            mainDisplay = "0" + hour;
        } else {
            mainDisplay = "" + hour;
        }
        
        // formats the minutes
        if (min < 10) {
            mainDisplay += ":0" + min;
        } else {
            mainDisplay += ":" + min;
        }
        
        // formats the seconds
        if (sec < 10) {
            mainDisplay += ":0" + sec;
        } else {
            mainDisplay += ":" + sec;
        }
    }
    
    // sets the secondary timer display (Milliseconds)
    public void setSecondaryTimer() {
        milliDisplay = "";
        
        if (milli < 10) {
            milliDisplay = "00" + milli;
        } else if (milli >= 10 && milli < 100) {
            milliDisplay = "0" + milli;
        } else {
            milliDisplay = "" + milli;
        }
    }
}