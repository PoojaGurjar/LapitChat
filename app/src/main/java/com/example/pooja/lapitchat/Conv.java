package com.example.pooja.lapitchat;

/**
 * Created by pooja on 26/10/18.
 */

public class Conv {

    public boolean seen;
    public long timestamp;
    public String date;

    public Conv(){

    }

    public boolean isSeen() {
        return seen;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Conv(boolean seen, long timestamp) {
        this.seen = seen;
        this.timestamp = timestamp;
    }
}
