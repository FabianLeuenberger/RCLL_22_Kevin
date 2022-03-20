/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robotino.rcll;

import com.robotino.Test.TestDrive;
import com.robotino.communication.Message.DriveMessage;
import com.robotino.communication.Mqtt.MainMqtt;
import com.robotino.production.Controller;
import com.robotino.robo.Robo;

/**
 *
 * @author Kevin Zahn
 */
public class Main {

    Controller controller = new Controller();
    Robo r0 = new Robo(0, 31, 0);

    public static void main(String[] args) {
       //TestDrive td = new TestDrive();
       //td.runTest();

        Main main = new Main();
        main.start();


    }

    public void start(){
        MainMqtt mainMqtt = new MainMqtt();

        DriveMessage driveMessage = controller.driveRobi(r0, 33, 0);
        mainMqtt.sendMsg(driveMessage);
    }
    
}
