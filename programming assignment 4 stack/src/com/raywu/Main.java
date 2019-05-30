package com.raywu;
import java.util.*;
public class Main {

    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            int mem = scan.nextInt();
            int q = scan.nextInt();
            int y = scan.nextInt();

            Stack rt = new Stack();


            rt.push(mem);
            rt.push(q);
            rt.push(y);



            System.out.println("removed object is: " + rt.pop());
            System.out.println("Elements after remove: " + rt);

    }
}