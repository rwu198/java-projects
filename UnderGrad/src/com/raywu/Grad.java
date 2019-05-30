package com.raywu;

import java.util.Date;
import javax.swing.JOptionPane;
/**
 * NYIT Spring 2017,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 */
public class Grad extends Student
{
    private int level;		//1 1st year, 2 2nd year
    String title = "\nNYIT CSCI Java2 sample program" + "\n\n";
    public Grad()
    {
        super( ); 	level = 1;
    }

    public Grad(String initName, int initStID, int initLevel)
    {
        super(initName, initStID);	setLevel(initLevel);
    }

    public void reset (String newName, int newStID, int newLevel)
    {
        reset(newName, newStID);
        setLevel (newLevel);
    }

    public int getLevel ()
    {
        return level;
    }
    public boolean testLevel(int newLevel)
    {
        if(( 1 <= newLevel ) && (newLevel <= 2))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter Valid level");
            return false;
        }
    }
    public void setLevel (int newLevel)
    {	if (( 1 <= newLevel ) && (newLevel <= 2))
        level = newLevel;
    else
    {
        System.out.println("Illegal level!");	System.exit(0); }
    }
    @Override
    public void writeOutput()
    {	Date date = new Date();	super.writeOutput();
        JOptionPane.showMessageDialog(null, date + title +
                "Name: " + getName() + "\nStudent level: " + level+ "\nStudent id: "+  getStudentNumber());
    }
    public String strWriteOutput()
    {	Date date = new Date();	super.writeOutput();

        return("Name: " + getName() + " Student level: " + level+ " Student id: "+  getStudentNumber());
    }



    public boolean equals(Grad otherGrad)
    {
        return equals (( Student)otherGrad) && (this.level == otherGrad.level);
    }
}
