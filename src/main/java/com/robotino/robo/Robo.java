package com.robotino.robo;

import com.robotino.communication.Message.DriveMessage;

/**
 *
 * Alle Positionen sind relativ zum Roboter der Insanziert wrid auser die Konvertierten Positionen
 * in der drive Methode
 *
 * @author Kevin Zahn
 * @date 2022
 * @description Aufgaben der Klasse:
 *  -Ausgeben der aktuelle Position
 *  -Ausgeben der Startposition
 *  -Startposition subtrahieren oder addieren zu der gewünschten Anfahr-Postion, sodass das Koordinaten system von
 *  jedem Roboter immer an der Gleichen Stelle ist
 *  -Robo bekommt immer die Nachricht wo er gerade steht vom Robotion view
 *  -Fahr Positonen werden über das Objekt sendMessage versendet
 */

/** TO DO
 * - Error meldung in drive(int fieldNr) falls string Aufsplittung nicht funktioniert
 */

public class Robo {

    DriveMessage driveMessage;

    // Need Variables
    private int roboNr; // Erster Roboter 0 zweiter 1 dritter 2 braucht es um in der Message zu wissen um welcher Roboter es get
    private int startField;
    private int [] startPosition; // x y a
    private int startRotation; // in Grad

    private int currentField;
    private int [] currentPosition; // x y a
    private int currentRotation; // in Grad

    // Options Variables
    private int speed;

    public Robo(int roboNr, int startField, int startRotation) {
        this.roboNr = roboNr;
        this.startField= startField;
        this.startRotation = startRotation;
        this.startPosition = convertFieldNrtoPosition(startField, startRotation);
    }

    public Robo(int roboNr, int [] startPosition) {
        this.roboNr = roboNr;
        this.startPosition = startPosition;
        this.startRotation = startPosition[2];
        this.startField = convertPositionToField(startPosition);
    }


    public DriveMessage drive(int fieldNr, int rotation){
        int [] position = convertFieldNrtoPosition(fieldNr, rotation);
        position = convertOriginalPositionToRoboPosition(position);

        // Jede Nachricht die versendet wird weis um welchen Roboter es handelt
        driveMessage = new DriveMessage(roboNr, position);
        return driveMessage;
    }

    public DriveMessage drive(int [] position){ // x y a
        position = convertOriginalPositionToRoboPosition(position);
        driveMessage = new DriveMessage(roboNr, position);

        // Jede Nachricht die versendet wird weis um welchen Roboter es handelt
        driveMessage = new DriveMessage(roboNr, position);
        return driveMessage;
    }

    public DriveMessage driveOriginPosition(int [] position){
        driveMessage = new DriveMessage(roboNr, position);
        return driveMessage;

    }

    //---------------------------Private Methods---------------------------

    private int [] convertOriginalPositionToRoboPosition(int [] position){
        for (int i = 0; i < position.length - 1; i++) { // -1 da Rotation nicht umgewandelt werden muss
            position[i] = position[i] - this.startPosition[i];
        }

        return position;
    }

    private int [] convertFieldNrtoPosition(int fieldNr, int rotation){
        int [] position = new int[3];
        String fieldNrStr = String.valueOf(fieldNr);
        String [] number = fieldNrStr.split("", 2);

        for (int i = 0; i < number.length; i++){
            position[i] = Integer.parseInt(number[i]); // String to Int
            position[i] = (position[i] - 1) * 1000; // Convert Number to Position
        }
        position[2] = rotation;

        for (int c : position){
            System.out.println(c);
        }

        return position;
    }

    private int convertPositionToField(int [] position){
        int firstNumber = (position[0] / 1000) + 1;
        int lastNumber = (position[1] / 1000) + 1;
        String firstNumberStr = String.valueOf(firstNumber);
        String lastNumberStr = String.valueOf(lastNumber);
        String fieldNrStr = firstNumberStr + lastNumberStr;

        return Integer.parseInt(fieldNrStr);
    }



}
