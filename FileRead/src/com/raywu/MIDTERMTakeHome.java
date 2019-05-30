package com.raywu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * NYIT Spring 2017 MID_THS_j21,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 * This program reads the information in the CSV file
 */

public class MIDTERMTakeHome {

    public static void main(String[] args){
        CSV ();
    }

    private static void CSV(){

        try{

            File file = new File("haberman.data");
            Scanner file_stream = null;


            file_stream = new Scanner (file);

            int lived = 0;
            int died = 0;

            List nodesInLived = new ArrayList <String>();
            List nodesInDied = new ArrayList <String>();

            while(file_stream.hasNext()){

                String line = file_stream.nextLine();
                String[]data = line.split(",");

                if (data[3].equals("1")) {
                    lived++;
                    nodesInLived.add(data[2]);
                }
                else{
                    died++;
                    nodesInDied.add(data[2]);
                }
            }
            int averageforLived = 0;
            int averageForDied = 0;
            int sum = 0;

            for (Object aNodesInLived : nodesInLived){
                sum += Integer.parseInt(aNodesInLived.toString());
                averageforLived = sum/nodesInLived.size();
            }

            System.out.println("Patients living longer than 5 years: "+ lived);
            for (Object aNodesInDied : nodesInDied){
                sum += Integer.parseInt(aNodesInDied.toString());
                averageForDied = sum/nodesInDied.size();
            }
            System.out.println("Patients living less than 5 years: "+ died);
            System.out.println("Average number of nodes for lived patients:" + averageforLived);
            System.out.println("Average number of nodes for died patients:" + averageForDied);

            file_stream.close();
        }
        catch (FileNotFoundException e) {
            System.out.print("File Not Found");
        }


    }
}

