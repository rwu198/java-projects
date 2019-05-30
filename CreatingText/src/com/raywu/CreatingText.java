package com.raywu;
/**
 * NYIT Spring 2017,
 * Author: ID: 1076589 Ray Wu
 */
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
public class CreatingText {

    public static void main(String[] args) {
        {
            String s;        // variable s => sentence, to accept sentence typed  O/P to a text file.
            boolean more = true;
            JOptionPane.showMessageDialog(null, "Create Text file using PrintWriter class ");
            String fileName = JOptionPane.showInputDialog("Type text file name to be created:");
            try {
                PrintWriter outputStream = new PrintWriter(fileName);
                while (more) {
                    s = JOptionPane.showInputDialog("Type a sentence (type DONE to stop)");
                    if (s.equals("DONE")) {
                        outputStream.close();
                        System.exit(0);
                    } else outputStream.println(s);
                }
            } catch (IOException e) {
                JOptionPane.showInputDialog(null, "Exception message:" + e);
                System.exit(0);
            }
        }
    }
}