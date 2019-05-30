package com.raywu;

public class Doc
{
    private String Speciality;
    private double visitFee;
    //default constructor
    public Doc()
    {
        super();
        Speciality = "None";
        visitFee=0;
    }
    //
    public Doc(String newName, String newSpeciality, Double newVisitFee)
    {
        super(newName);
        Speciality = newSpeciality;
        visitFee= newVisitFee;
    }
    //returns what the doc's speciality is
    public String getSpeciality()
    {
        return Speciality;
    }
    //returns what the doc's visit fee is
    public Double getVisitFee()
    {
        return visitFee;
    }
    //reassigns the doc's speciality
    public void setSpeciality(String newSpeciality)
    {
        Speciality = newSpeciality;
    }
    //reassigns the doc's visiting fees
    public void setVisitFee(Double newVisitFee)
    {
        visitFee = newVisitFee;
    }
    public void resetDoc(String newName,String newSpeciality ,Double newVisitFee)
    {
        setName(newName);
        setSpeciality(newSpeciality);
        setVisitFee(newVisitFee);
    }
    public void writeOutput()
    {
        System.out.println("Name:" + getName() + " Doctor's Speciality:"+ Speciality+ " Docter's visiting fee:" +visitFee );
    }
    public boolean docEquals(Doc otherDoc)
    {
        return this.equals(otherDoc);
    }

}