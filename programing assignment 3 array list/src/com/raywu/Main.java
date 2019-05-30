package com.raywu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader userInput = new BufferedReader
                (new InputStreamReader (System.in));
        ArrayList<String> myArr = new ArrayList<String>();
        myArr.add("Italian Riviera");
        myArr.add("Jersey Shore");
        myArr.add("Puerto Rico");
        myArr.add("Los Cabos Corridor");
        myArr.add("Lubmin");
        myArr.add("Coney Island");
        myArr.add("Karlovy Vary");
        myArr.add("Bourdon- 1 'Archmbault");
        myArr.add("Walt Disney World Resort");
        myArr.add("Barbados");

        System.out.println("vacation Resort Adviser");
        System.out.println("Enter your name:");
        String name = userInput.readLine();
        Integer nameLength = name.length();
        if (nameLength ==0)
        {
            System.out.println("empty name entered");
            return;
        }
        Integer VacationIndex = nameLength % myArr.size();
        System.out.println("\nYour name is "+name+", its length is "+
                nameLength + "characters,\n" +
                "thats's why we suggest you to go to "
                +myArr.get(VacationIndex));
    }
}
