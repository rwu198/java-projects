package com.raywu;


public class Person
{
    private String id;
    //default constructor
    public Patient()
    {
        super();
        id="None";
    }
    public Patient(String newName, String newId)
    {
        super(newName);
        id= newId;
    }
    //returns the patient id
    public String getID()
    {
        return id;
    }
    //sets a patients id
    public void setID(String newID)
    {
        id=newID;
    }
    //resets a patients parameters
    public void resetPatient(String newName, String newID)
    {
        setName(newName);
        id=newID;
    }
    public boolean equalsPatient(Patient otherPatient)
    {
        return this.equals(otherPatient);
    }

}
