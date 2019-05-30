package com.raywu;
/**
 * NYIT Spring 2017,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 */
public class LexusBicycle implements Bicycle {
    private static int cadence=0;
    private static int gear=0;
    private static int speed=0;

    public void changeCadence(int newValue){
        cadence=newValue;
    }
    public void changeGear(int newValue){
        gear=newValue;
    }
    public void accelerate(int increment){
        speed += increment;
    }
    public void decelerate(int decrement){
        speed -= decrement;
    }
}
