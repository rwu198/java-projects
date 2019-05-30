package com.raywu;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 * NYIT Spring 2017,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 */
public class UnderGrad extends Student
{
    private int level;		//1 for freshman, 2 for sophomore, 3 for junior, or 4 for senior.
    String title = "\nNYIT CSCI Java2 program" + "\n\n";

    public UnderGrad()
    {
        super( ); 	level = 1;
    }

    public UnderGrad(String initName, int initStID, int initLevel)
    {
        super(initName, initStID);
        setLevel(initLevel);
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

    public void setLevel (int newLevel)
    {

        level = newLevel;
    }
    public boolean testLevel(int newLevel)
    {
        if(( 1 <= newLevel ) && (newLevel <= 4))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter Valid level");
            return false;
        }
    }
    @Override
    public void writeOutput()
    {	Date date = new Date();	super.writeOutput();
        JOptionPane.showMessageDialog(null, date + title +
                "Name: " + getName() + "\nStudent level: " + level+ "\nStudent id: "+  getStudentNumber());
    }

    public String strWriteOutput()
    {	Date date = new Date();	super.writeOutput();

        return("Name: " + getName() + " Student level: " + level + " Student id: "+  getStudentNumber());
    }

    public boolean equals(UnderGrad otherUndergraduate)
    {
        return equals (( Student)otherUndergraduate) && (this.level == otherUndergraduate.level);
    }
}

