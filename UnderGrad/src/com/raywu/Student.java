package com.raywu;
/**
 * NYIT Spring 2017,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 */
import javax.swing.JOptionPane;
public class Student extends Person
{
    private int studentNumber;
    public Student()
    {	super();
        studentNumber = 0;		// Indicating no number yet
    }
    public Student (String initialName, int initialStudentnumber)
    {	super (initialName);
        studentNumber = initialStudentnumber;
    }
    public void reset (String newName, int newStudentNumber)
    {	setName (newName);
        studentNumber = newStudentNumber;
    }
    public int getStudentNumber()
    {
        return studentNumber;
    }
    //studentNumber is assumed to not start with 0
    public void setStudentNumber (int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }
    public boolean testID(int newStudentNumber)
    {

        if(newStudentNumber>=1000000 && newStudentNumber<10000000)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter Valid 7-digit id!!!!");
            return false;
        }
    }

    public void writeOutput()
    {
        System.out.println("Name:" + getName() + " Student number: " + studentNumber);
    }
}


