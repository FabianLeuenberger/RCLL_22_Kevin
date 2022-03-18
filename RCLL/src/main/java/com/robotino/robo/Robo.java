package com.robotino.robo;

public class Robo {

    // Need Variables
    private int roboNr; // Erster Roboter 0 zweiter 1
    private int startField;
    private  int [] startPosition;

    private int currentField;
    private int [] currentPosition; // x y a

    // Options Variables
    private int speed;

    public Robo(int roboNr, int startField) {
        this.roboNr = roboNr;
        this.startField= startField;
    }

    public Robo(int roboNr, int [] startPosition) {
        this.roboNr = roboNr;
        this.startPosition = startPosition;
    }
}
