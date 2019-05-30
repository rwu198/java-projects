package com.raywu;
/**
 * NYIT Spring 2017,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 */
    public interface Bicycle {
        void changeCadence(int newValue);
        void changeGear(int newValue);
        void accelerate(int increment);
        void decelerate(int decrement);
    }

