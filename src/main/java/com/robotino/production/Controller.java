package com.robotino.production;

import com.robotino.communication.Message.DriveMessage;
import com.robotino.robo.Robo;

/**
 *
 * @author Kevin Zahn
 */

public class Controller {

    Robo r0;
    Robo r1;
    Robo r2;

    public Controller(){}
    public Controller(Robo r0){
        this.r0 = r0;
    }

    public Controller(Robo r0, Robo r1){
        this.r0 = r0;
        this.r1 = r1;
    }

    public Controller(Robo r0, Robo r1, Robo r2){
        this.r0 = r0;
        this.r1 = r1;
        this.r2 = r2;
    }

    public DriveMessage driveRobi(Robo r, int fieldNr, int rotation){

        return r.drive(fieldNr, rotation);
    }

    public DriveMessage driveRobi(Robo r, int [] position){

        return r.drive(position);
    }
}
