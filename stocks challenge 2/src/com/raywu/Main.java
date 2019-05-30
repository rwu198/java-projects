package com.raywu;

import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int length;
        Scanner input = new Scanner(System.in);

        System.out.println("How many stocks will you enter");
        length = input.nextInt();

        String[] names = new String[length];

        for (int counter = 0; counter < length; counter++) {
        System.out.println("Enter the stocks " + (counter + 1));
        names[counter] = input.next();
        }

        input.close();

        //System.out.println("Your stocks are");
        for (int counter = 0; counter < length; counter++){
        //System.out.println(names[counter]);

            Stack stock = new Stack();
             stock.push (names[counter]);
             System.out.println("Your stocks are" + stock);

            LinkedList<String> lList = new LinkedList<String>();
            lList.add(names[counter]);
            System.out.println("LinkedList contains : " + lList);

            List<String> myStocks = new ArrayList<String>(lList);

            for (Object alObject : myStocks)
                System.out.println(alObject);

            //System.out.println("ArrayList : " + lList);

            ArrayList listTest = new ArrayList( );
            //listTest.add( lList );
            listTest.add(lList);

            //System.out.println(lList)
            //if (lList.size()< int counter){

            //}
            //listTest.add( 2 );
            //listTest.add( 3 );

            //listTest.add(1);
            //System.out.println("Enter the position of the stock you want to remove ");

            //Scanner in = new Scanner(System.in);
            //int one = in.nextInt(); // adding flight numbers

            listTest.remove(lList);


            System.out.println("Modified ArrayList : " + listTest);



        }
    }
}