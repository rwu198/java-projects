package com.raywuBinarySearchTree;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("enter 1 to start the program");
        int k = 0;
        while (k < 2) {
            Scanner Option = new Scanner(System.in);
            int first = Option.nextInt();
            switch (first) {
                case 0:
                    return;
                case 1: {
                    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
                    int fram, pt = 0, ht = 0, fault = 0, reference_length = 20;
                    boolean isFull = false;
                    char buff[];
                    char refer[];

                    System.out.println("Enter a reference string:\n7 0 1 2 0 3 0 4 2 3 0 3 2 1 2 0 1 7 0 1 ");
                    System.out.print("Enter the # of frames: ");
                    fram = Integer.parseInt(BR.readLine());
                    System.out.print("Running Simulaion:\n\nStart"
                            + " Memory is:");
                    for (int i = 0; i < fram; i++)
                        System.out.print(" * ");
                    System.out.println(" ");
                    refer = new char[]{'7', '0', '1', '2', '0', '3', '0', '4', '2', '3', '0', '3', '2', '1', '2', '0', '1', '7', '0', '1'};
                    buff = new char[fram];
                    for (int x = 0; x < fram; x++)
                        buff[x] = '*';

                    for (int y = 0; y < reference_length; y++) {
                        int lookup = -1;
                        for (int x = 0; x < fram; x++) {
                            if (buff[x] == refer[y]) {
                                lookup = x;
                                ht++;
                                System.out.print(refer[y] + ": Memory is:");
                                for (int v = 0; v < fram; v++) {
                                    System.out.printf("%3c ", buff[v]);
                                }
                                System.out.println("Hit: (Number of Page Faults: " + fault + ")");
                                break;
                            }
                        }
                        if (lookup == -1) {
                            if (isFull) {
                                int index[] = new int[fram];
                                boolean index_tag[] = new boolean[fram];
                                for (int j = y + 1; j < reference_length; j++) {
                                    for (int a = 0; a < fram; a++) {
                                        if ((refer[j] == buff[a]) && (index_tag[a] == false)) {
                                            index[a] = j;
                                            index_tag[a] = true;
                                            break;
                                        }
                                    }
                                }
                                int maximum = index[0];
                                pt = 0; // pointer
                                if (maximum == 0)
                                    maximum = 100;
                                for (int n = 0; n < fram; n++) {
                                    if (index[n] == 0)
                                        index[n] = 200;
                                    if (index[n] > maximum) {
                                        maximum = index[n];
                                        pt = n;
                                    }
                                }
                            }
                            buff[pt] = refer[y];
                            fault++;
                            System.out.print(refer[y] + ": Memory is:");
                            for (int m = 0; m < fram; m++) {
                                System.out.printf("%3c ", buff[m]);
                            }
                            System.out.println("Page Fault: (Number of Page Faults: " + fault + ")");
                            if (!isFull) {
                                pt++;
                                if (pt == fram) {
                                    pt = 0;
                                    isFull = true;
                                }
                            }
                        }
                    }
                    System.out.println("Total Number of Page Faults: " + fault);
                    System.out.println("Total Number of Page Hits: " + ht);
                }
                System.out.println("enter 1 to re run the program or enter 0 to end");
            }
        }
    }
}