package com.raywu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 * NYIT Spring 2017,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 */
public class UndergradGradDemo implements ActionListener
{
    private final int lim = 100;//limit number of students
    private int UGSsize =0;//counter for how many ungrad students inputed
    private int GSsize =0;//counter for how many grad students inputed
    private final UnderGrad [] UGS = new UnderGrad[lim];
    private final Grad [] GS = new Grad[lim];
    private JButton addStudent;
    private JButton showResults;
    private JLabel GradOrUngrad;
    private JLabel stdName;
    private JLabel stdNumber;
    private JLabel stdLevel;
    private JTextArea display;
    private JTextField GradOrUngradVal;
    private JTextField stdNameVal;
    private JTextField stdNumberVal;
    private JTextField stdLevelVal;
    private JTextArea outPut;
    private JFrame Jresults;
    private JFrame f;
    public static void main(String[]args)
    {
        UndergradGradDemo demo = new UndergradGradDemo();
        demo.init();
    }
    public void init()
    {
        f = new JFrame();
        Jresults = new JFrame();
        Jresults.setSize(600,500);
        f.setSize(600,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jresults.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jpan = new JPanel();
        JPanel jpanResults = new JPanel();
/*GridBagConstraints g = new GridBagConstraints();
g.insets = new Insets(1,1,1,1);
*/
//initialize the components
        addStudent = new JButton("Add Student");
        showResults = new JButton("Press to show student data");
        GradOrUngrad = new JLabel("Enter U for undergrad and G for grad student");
        stdName = new JLabel("Enter the student name");
        stdNumber = new JLabel("Enter 7 digit student id");
        stdLevel = new JLabel("Enter student level: 1, 2, 3, or 4");
        display = new JTextArea();//don't need to set the measurements for the Jtextarea
        GradOrUngradVal = new JTextField();//and Jtextfield because the layoutmanager
        stdNameVal = new JTextField();//deals with it
        stdNumberVal = new JTextField();
        stdLevelVal = new JTextField();
        outPut = new JTextArea();
//action listener added
        addStudent.addActionListener(this);
        showResults.addActionListener(this);

//add components to panel
        jpanResults.add(outPut);
        jpan.add(GradOrUngrad);
        jpan.add(GradOrUngradVal);
        jpan.add(stdLevel);
        jpan.add(stdLevelVal);
        jpan.add(stdName);
        jpan.add(stdNameVal);
        jpan.add(stdNumber);
        jpan.add(stdNumberVal);
        jpan.add(addStudent);
        jpan.add(showResults);
        jpan.add(display);
        display.setText("Enter the information of the student then \nClick ADD STUDENT"
                +"\nwhen you're finished click SHOW RESULTS"
                +"\n to output all the data for the students");
        f.add(jpan);
        Jresults.add(jpanResults);
        jpan.setLayout( new  GridLayout(6,2));//set the layout manager to how the GUI looks like
        f.setVisible(true);

    }
    @Override
    public void actionPerformed ( ActionEvent e)
    {
        String z = e.getActionCommand();
        String statusGoUg = GradOrUngradVal.getText();
        String stdname;
        int id = 0;//compiler suggested to set values for id & lvl
        int lvl = 0;//but try and catch would have prevented the code from executing,if a value wasn't set for either
        boolean allGood1=true;
        boolean allGood2=true;
        boolean allGood3=true;

        if(z.equals("Add Student"))
        {       try//test whether or not the inputted value is an integer if it isn't the program won't add the person
        {
            id = Integer.parseInt(stdNumberVal.getText());
        }
        catch( NumberFormatException a)//this will catch if the inputted value isn't a int
        {
            JOptionPane.showMessageDialog(null, "Enter valid ID value!");
            allGood1=false;

        }
            try //same thing as previous string except test the inputted value for the level
            {
                lvl = Integer.parseInt(stdLevelVal.getText());
            }
            catch(NumberFormatException a)
            {
                JOptionPane.showMessageDialog(null, "Enter valid level value!");
                allGood2=false;
            }
            for(int q =0;q<UGSsize;q++)//test to make sure 2 students don't share the same id
            {
                if(id==UGS[q].getStudentNumber())
                {
                    JOptionPane.showMessageDialog(null, "This ID is already in use!");
                    allGood3=false;
                }
            }
            for(int q=0;q<GSsize;q++)//test to make sure 2 students don't share the same id
            {
                if(id==GS[q].getStudentNumber())
                {
                    JOptionPane.showMessageDialog(null, "This ID is already in use!");
                    allGood3=false;
                }
            }
            if(allGood1 && allGood2 && allGood3)//will only execute if the inputted level & id value are valid
            {

                switch (statusGoUg)
                {
                    case "U":
                        stdname = "U " + stdNameVal.getText();
                        UGS[UGSsize]= new UnderGrad();//creates a new undergrad object
                        UGS[UGSsize].setName(stdname);//below begins to set the values for the new person
                        if(UGS[UGSsize].testLevel(lvl))//test to see if its a valid lvl
                        {
                            UGS[UGSsize].setLevel(lvl);
                            if(UGS[UGSsize].testID(id))//test if the id is valid
                            {
                                UGS[UGSsize].setStudentNumber(id);
                                System.out.println("Testing if UGS is getting added "+ UGSsize);
                                UGS[UGSsize].writeOutput();
                                display.setText("You entered an UnderGraduate"
                                        +"\n Student Name:" + stdname
                                        +"\n Student id:"+ UGS[UGSsize].getStudentNumber()
                                        +"\n Student level:"+ UGS[UGSsize].getLevel());
                                UGSsize++;
                                stdLevelVal.setText("");
                                stdNumberVal.setText("");
                                stdNameVal.setText("");
                                GradOrUngradVal.setText("");

                            }
                        }
                        break;
                    case "G":
                        stdname ="G "+ stdNameVal.getText();
                        GS[ GSsize]= new Grad();
                        GS[ GSsize].setName(stdname);
                        if(GS[ GSsize].testLevel(lvl))//test to see if its a valid lvl
                        {
                            GS[ GSsize].setLevel(lvl);
                            if(GS[ GSsize].testID(id))
                            {
                                System.out.println(GS[ GSsize].testID(id));
                                GS[ GSsize].setStudentNumber(id);
                                System.out.println("Testing if GS is getting added "+ GSsize);
                                GS[ GSsize].writeOutput();
                                GSsize++;
                                stdLevelVal.setText("");
                                stdNumberVal.setText("");
                                stdNameVal.setText("");
                                GradOrUngradVal.setText("");
                            }

                        }

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Enter Valid Status!");
                        break;
                }

            }

        }
        else if(z.equals("Press to show student data"))
        {
            f.setVisible(false);
            Jresults.setVisible(true);
            for(int x=0; x<UGSsize;x++)
            {
                String previousText = outPut.getText();
                outPut.setText(previousText + "\n" + UGS[x].strWriteOutput());

            }
            for(int y=0; y<GSsize;y++)
            {
                String previousText = outPut.getText();
                outPut.setText(previousText + "\n" + GS[y].strWriteOutput());
            }
        }


    }
}
