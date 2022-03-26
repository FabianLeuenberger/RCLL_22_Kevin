package com.robotino.communication.Message;


import org.json.JSONObject;

/**
 *
 * @author Kevin Zahn
 * @date 2022
 * @description Aufgaben der Klasse:
 *  Erzeugt die Nachrichten, die über die Klasse SendMqtt versendet wird
 *  - Nachrichten für das Robotion View Drive
 *  - Nachrichten für das Codesys starten des Greifer Prozess
 */

public class DriveMessage {

    int roboNr;
    int [] position;
    byte [] payload;

    public DriveMessage(int roboNr, int [] position){
        this.roboNr = roboNr;
        this.position = position;
        driveCommand();

    }

    private void driveCommand(){ // x y r
        byte [] payload;

        JSONObject robo = new JSONObject();
        robo.put("xPos", position[0]);
        robo.put("yPos", position[1]);
        robo.put("rPos", position[2]);

        JSONObject mainObj = new JSONObject();
        mainObj.put("robo" + this.roboNr, robo);

        payload = mainObj.toString().getBytes();

        System.out.println(payload);
        this.payload = payload;
    }

    public byte[] getPayload() {
        return payload;
    }
}
