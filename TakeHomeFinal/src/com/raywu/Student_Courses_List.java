package com.raywu;
/*    NYIT Spring 2017 FINAL_THS_j21,
    Your        ID: 1076589 name: Ray Wu
    Group leader    ID: __________________ name: __________________________________

    Student_Courses_List
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.io.FileWriter;
public class Student_Courses_List {

        public static void main(String[] args) {
            try {
                BufferedReader br = new BufferedReader(new

                        InputStreamReader(System.in));

                File fout = new File("StudentEnrollmentList.txt");

                FileWriter writer = new FileWriter("out.txt");

                int n = 4;

                // creating map

                Map<Integer, List<String>> map1 = new

                        HashMap<Integer, List<String>>();

                // create lists to store values

                List<String> studentdata = new

                        ArrayList<String>();

                List<String> studentdata1 = new

                        ArrayList<String>();

                List<String> studentdata2 = new

                        ArrayList<String>();

                List<String> studentdata3 = new

                        ArrayList<String>();

                for (int i = 0; i < n; i++)

                {

                    studentdata.add(br.readLine());

                }

              /*studentdata.add("1 CS100");

              studentdata.add("2 MATH210");

              studentdata.add("2 CS105");

              studentdata.add("1 CS200");*/

                for (int i = 0; i < studentdata.size(); i++) {
                    String cou = studentdata.get(i);
                    String subcode[] = cou.split(" ", 2);
                    String subject1 = subcode[0];
                    int level = Integer.parseInt(subject1);
                    if (level == 1) {
                        studentdata1.add(subcode[1]);
                    }
                    if (level == 2) {
                        studentdata2.add(subcode[1]);
                    }
                    if (level == 3) {
                        studentdata3.add(subcode[1]);
                    }

                }
                map1.put(1, studentdata1);

                map1.put(2, studentdata2);

                map1.put(3, studentdata3);

                // Get a set of the entries
                Set<Entry<Integer, List<String>>> setMap =
                        map1.entrySet();
                // Get an iterator
                Iterator<Entry<Integer, List<String>>>
                        iteratorMap = setMap.iterator();
                while (iteratorMap.hasNext()) {
                    Map.Entry<Integer, List<String>> entry =
                            (Map.Entry<Integer, List<String>>)
                                    iteratorMap.next();
                    int key = entry.getKey();
                    List<String> values =
                            entry.getValue();
                    String strI = Integer.toString(key);
                    writer.write(strI);
                    writer.write(":");
                    for (String str : values) {
                        writer.write(str);

                        writer.write(",");
                    }

                    writer.write("\r\n");
                }

                writer.close();
            } catch (Exception e)

            {

            }

        }

    }
}