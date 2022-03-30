package com.robotino.communication.Mqtt;


import java.util.UUID;

import com.robotino.communication.Message.DriveMessage;
import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 *
 * @author Kevin Zahn
 */

/** TO DO
 *  Abfagne der Error's und evtl. in Log Dateien Schreiben
 */

public class MainMqtt {
    String topicToSend = "robotino/fromJava";
    String topicToReceive = "robotino/kevin";

    IMqttClient client;

    public MainMqtt(){
        setupMqtt();
    }

    public MainMqtt(String topicToSend, String topicToReceive){
        this.topicToSend = topicToSend;
        this.topicToReceive = topicToReceive;

        setupMqtt();
    }

    private void setupMqtt(){
        String publisherId = UUID.randomUUID().toString();
        try {
            client = new MqttClient("tcp://broker.hivemq.com:1883",publisherId);
        } catch (MqttException e) {
            System.out.println("Error Instanzieren von MqttClient");
            e.printStackTrace();
        }

        try {
            client.connect();
        } catch (MqttException e) {
            System.out.println("Error To Connetct Broker");
            e.printStackTrace();
        }
    }

    public void sendMsg(DriveMessage sendMessage){
        SendMqtt sendMqtt = new SendMqtt(sendMessage, client, topicToSend);
        try {
            sendMqtt.call(); // Sending data
        } catch (Exception e) {
            System.out.println("Error can't send Msg");
            e.printStackTrace();
        }
    }

    public void receiveMsg(){
        ReceivedMqtt receiveMqtt = new ReceivedMqtt(client, topicToReceive);

    }

}
