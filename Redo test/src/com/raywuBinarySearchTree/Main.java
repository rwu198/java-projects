package com.raywuBinarySearchTree;
import java.util.*;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
//creating a hash table
        Hashtable<String,String> states = new Hashtable<>();

        states.put("AR", "Arkansas");
        states.put("UT", "Utah");
        states.put("VT", "Vermont");
        states.put("AL", "Alabama");

        for(Map.Entry i:states.entrySet()) {
            System.out.println(i.getKey() + "   " + i.getValue());

            System.out.println(states);
        }
    }
}

