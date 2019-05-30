package com.raywu;



public class Billing
{
    private String Billname;
    private String docName;
    private String patientName;
    private String patID;
    private Double docFee;
    private Double balance=0.0;
    //default constructor
    public Billing()
    {
        Billname="none";
        docName="Not Assigned";
        patientName="Not Assigned";
        patID="Not Assigned";
        docFee=0.0;
    }
    public Billing(String newBillName, Patient thePatient, Doc theDoc)
    {
        Billname= newBillName;
        docName = theDoc.getName();
        patientName = thePatient.getName();
        patID= thePatient.getID();
        docFee = theDoc.getVisitFee();
    }
    //sets the Bills name
    public void setBillName(String newBillName)
    {
        Billname=newBillName;
    }
    //sets the docotor, so sets the doc's name and fee
    public void setDoc(Doc theDoc)
    {
        docName = theDoc.getName();
        docFee = theDoc.getVisitFee();
        balance+=docFee;
    }
    //sets the patient and their variables, ID, and Name
    public void setPatient(Patient thePatient)
    {
        patientName = thePatient.getName();
        patID = thePatient.getID();
    }
    //return the billname
    public String getBillName()
    {
        return Billname;
    }
    //return whose the doctor
    public String getDocName()
    {
        return docName;
    }
    //return whose the patient
    public String getPatientName()
    {
        return patientName;
    }
    //return how much the bill is
    public Double getBalance()
    {
        return balance;
    }
    //returns the patient ID
    public String getPatientID()
    {
        return patID;
    }
    public void adjustBill(int newIncrement)
    {
        balance+=newIncrement;
    }
}

