/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robotino.mqtttest;

import java.time.LocalTime;
import java.util.ArrayList;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 *
 * @author Kevin Zahn
 */
public class MyMessage {
    
    public static ArrayList<MyMessage> msgs = new ArrayList<>();
    

    private String msg;
    private LocalTime time;
    
    public MyMessage(byte [] msg){
       this.msg = new String(msg);
       this.time = LocalTime.now();
    }
    
    public static void addMsg(MyMessage msgObj){
        msgs.add(msgObj);
    }
    
    public static void print(){
        System.out.println(msgs);
    }

    @Override
    public String toString() {
        return "MyMessage{" + "msg=" + msg + ", time=" + time + '}';
    } 
}
