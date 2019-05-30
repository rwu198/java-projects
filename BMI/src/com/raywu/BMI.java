package com.raywu;
/**
 * NYIT Spring 2017,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 */
import javax.swing.*;
public class BMI {

    private static String s2 = "Enter name of the person";
    private static String s3 = "Enter weight in pounds";
    private static String s4 = "Enter height in inches";
    private static String personName;
    private static String strW;
    private static String strH;
    private static int w;        //weight in pounds
    private static int h;        //height in inches
    private static double BMI;    //BMI=(w*702)/(h*h)

    private static String[] names = new String[10];
    private static int[] weights = new int[10];
    private static int[] heights = new int[10];
    private static double[] bmi = new double[10];
    private static String[] bmiClass = new String[10];
    private static Object[][] collectedData = new Object[10][5];

            public static void main(String[] args) {

                String s1 = "Accumulate BMI values for 10 people\n"
                        + "enter person's name, weight, height";
                JOptionPane.showMessageDialog(null, s1);
                collectData();
            }

            //begin collecting data
            private static Object collectData(){

                //repeat info entry until index reaches our limit of 10:
                for (int index = 0; index < 10; index++) {

                    personName = JOptionPane.showInputDialog(s2);
                    strW = JOptionPane.showInputDialog(s3);
                    w = Integer.parseInt(strW);

                    //check weight Weight in pounds.
                    if(w>400 || w<50){
                        JOptionPane.showMessageDialog(null,
                                "You entered: " + w + " as a weight. Double-check this value.",
                                "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    strH = JOptionPane.showInputDialog(s4);
                    h = Integer.parseInt(strH);

                    //check Height in inches.
                    if(h>84||h<20){
                        JOptionPane.showMessageDialog(null,
                                "You entered: " + h + " as a height. Double-check this value.",
                                "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    BMI = (w * 702) / (h * h);

                    //store user's input into lists.
                    names[index] = personName;
                    weights[index] = w;
                    heights[index] = h;
                    bmi[index] = BMI;

                    //calculate BMI classification.
                    if (bmi[index] < 18.5) {
                        bmiClass[index] = "Underweight";
                    } else if (bmi[index] < 25) {
                        bmiClass[index] = "Healthy Weight";
                    } else if (bmi[index] < 30) {
                        bmiClass[index] = "Overweight";
                    } else if (bmi[index] < 35) {
                        bmiClass[index] = "Obese";
                    } else if (bmi[index] < 40) {
                        bmiClass[index] = "Severely Obese";
                    } else if (bmi[index] >= 40) {
                        bmiClass[index] = "Morbidly Obese";
                    }

                    //populate multidimensional array to match person with their data for table.
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 5; j++) {
                            collectedData[i][0] = names[i];
                            collectedData[i][1] = weights[i];
                            collectedData[i][2] = heights[i];
                            collectedData[i][3] = bmi[i];
                            collectedData[i][4] = bmiClass[i];
                        }
                    }
                }
                viewOption();
                return collectedData;
            }

            //render option to see table or search for a patient.
            private static void viewOption(){

                Object[] options = {"Table", "Singular"};
                int choice = JOptionPane.showOptionDialog(null,
                        "Choose to view data as a table\n" +
                                "or retrieve a certain patient.",
                        "BMI",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]
                );
                //check user data.
                if (choice == 0){
                    renderTable();
                }
                else{
                    renderRetrieval();
                }
            }

            //render all data as a table.
            private static void renderTable() {

                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                String[] columnNames = {"Name", "Weight", "Height", "BMI", "BMI Classification"};
                JTable table = new JTable(collectedData, columnNames);

                JScrollPane scrollPane = new JScrollPane(table);
                frame.add(scrollPane);
                frame.setSize(700, 500);
                frame.setVisible(true);

            }

            //render data after user searches by name.
            private static void renderRetrieval(){
                String patient = (String) JOptionPane.showInputDialog(null,
                        "Select a Patient",
                        "Retrieval",
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        names,
                        names[0]
                );

                Object[][] patientData = new Object[1][5];

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (patient == collectedData[i][0]){
                            patientData[0][0] = collectedData[i][0];
                            patientData[0][1] = collectedData[i][1];
                            patientData[0][2] = collectedData[i][2];
                            patientData[0][3] = collectedData[i][3];
                            patientData[0][4] = collectedData[i][4];
                        }
                    }
                }
                JOptionPane.showMessageDialog(null,
                        "Patient: " + patientData[0][0] +
                                " Weight: " + patientData[0][1] +
                                " Height: " + patientData[0][2] +
                                " BMI: " + patientData[0][3] +
                                " BMI Class: " + patientData[0][4],
                        "Patient Data",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }