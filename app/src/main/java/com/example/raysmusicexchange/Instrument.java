package com.example.raysmusicexchange;

/**
 * Created by allysonwilson on 9/8/17.
 */

public abstract class Instrument implements Playable {
        public String color;
        public String type;


    public Instrument(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }
}

