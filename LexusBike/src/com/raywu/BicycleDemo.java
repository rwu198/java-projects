package com.raywu;

import javax.swing.JOptionPane;
/**
 * NYIT Spring 2017,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 */
public class BicycleDemo {
    public static void main(String[] args) {
        renderOptions();
    }

    private static void renderOptions(){
        String[] options = new String[] {"Cadence", "Gear", "Accelerate", "Decelerate"};

        //renders an option pane with four buttons.
        int selectedOption = JOptionPane.showOptionDialog(null,
                "Select an option below to change it.",
                "Bicycle",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        renderInput(selectedOption);
    }

    //render an input pane to allow change of value in bike.
    private static void renderInput(int selectedOption){
        LexusBicycle bike = new LexusBicycle();

        String inputMessage = "";

        switch (selectedOption){
            case 0: inputMessage = "Enter desired cadence in pedal cranks per minute.";
                break;
            case 1: inputMessage = "Enter desired gear to change to. This is a 21-speed bike.";
                break;
            case 2: inputMessage = "Enter desired increment to accelerate by.";
                break;
            case 3: inputMessage = "Enter desired decrement to decelerate by.";
        }

        //after setting appropriate input message, allow user to input.
        String userInputAsString = JOptionPane.showInputDialog(null, inputMessage);
        int userInput = Integer.parseInt(userInputAsString);

        //depending on which option the user previously selected,
        // change the appropriate value to the user's input.
        switch (selectedOption){
            case 0: bike.changeCadence(userInput);
                break;
            case 1: bike.changeGear(userInput);
                break;
            case 2: bike.accelerate(userInput);
                break;
            case 3: bike.decelerate(userInput);
        }

        //repeat the entire process.
        String finalMessage = "Would you like to change another value?";
        Object[] options = {"Yes", "No"};

        int repeat = JOptionPane.showOptionDialog(null, finalMessage, "Bicycle",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (repeat==0){
            renderOptions();


        }
    }
}
