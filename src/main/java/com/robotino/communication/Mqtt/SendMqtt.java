package com.robotino.communication.Mqtt;


import java.util.concurrent.Callable;

import com.robotino.communication.Message.DriveMessage;
import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;


/**
 *
 * @author Kevin Zahn
 */

public class SendMqtt implements Callable<Void> {

    IMqttClient client;
    String topic;
    DriveMessage sendMessage;

    public SendMqtt(DriveMessage sendMessage, IMqttClient client, String topicToSend){
        this.client = client;
        this.topic = topicToSend;
        this.sendMessage = sendMessage;
    }

    @Override
    public Void call() throws Exception {
        if (!client.isConnected()) {
            System.err.println("Error Client is not connected for sending data");
            return null;
        }
        byte[] payload = sendMessage.getPayload();

        MqttMessage msg = new MqttMessage(payload);
        msg.setQos(0);
        msg.setRetained(true);

        String s = new String(payload);
        System.out.println("publish: " + s);

        client.publish(topic, msg);
        return null;
    }

}
