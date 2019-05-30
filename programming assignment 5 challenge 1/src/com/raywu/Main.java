package com.raywu;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.print("Add all the flight numbers for the day ");

        Scanner scan = new Scanner(System.in);
        System.out.println();
        int one = scan.nextInt(); // adding flight numbers
        int two = scan.nextInt(); // adding flight numbers
        int three = scan.nextInt(); // adding flight numbers
        int four = scan.nextInt(); // adding flight numbers
        //Creating and populating LinkedList
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.add(one);
        linkedlist.add(two);
        linkedlist.add(three);
        linkedlist.add(four);

        //Converting LinkedList to Array
        Integer[] array = linkedlist.toArray(new Integer[linkedlist.size()]);

        //Displaying Array content
        //System.out.println("Array Elements:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("flight for each day will be printed one after another ");
            System.out.println("flight number " + array[i]);

            Stack flight = new Stack();
            flight.push(i);

            System.out.println("removed object is: " + flight.pop());
            {System.out.println("flight number removed : " + i);}

        }
    }
}