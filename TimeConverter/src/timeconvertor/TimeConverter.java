package timeconvertor;
/**
 * NYIT Spring 2017,
 * Team Leader: John Paul Cantalino
 * Author: ID: 1076589 Ray Wu
 *
 */
import javax.swing.*;

public class TimeConverter {

    public static void main(String[] args) {

                String userInput;
                String result;
                int keepGoing=0;
                Object[] options = {"Yes","No"};
                TimeConverter demo = new TimeConverter();
                try{
                    while(keepGoing==0)
                    {
                        userInput = JOptionPane.showInputDialog(null, "Enter time value in 24hr format"
                                +"\n to be converted into 12hr format");

                        result =demo.convertTime(userInput);
                        JOptionPane.showMessageDialog(null, result);
                        keepGoing=JOptionPane.showOptionDialog(null, "Continue?", "Message", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,options[0]);

                    }
                    JOptionPane.showMessageDialog(null,"Closing Program");
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"Closing Program");
                }
            }

    public class TimeFormatException extends Exception
    {
        public TimeFormatException()
        {
            super("Invalid Format Exception");
        }
        public TimeFormatException(String message)
        {
            super(message);
        }

    }

            public String convertTime(String input)
            {

                String Initial = input;
                int thingPosition;//position of the :
                int stringLength = Initial.length();
                int FirstPart;
                int SecondPart;
                String SecondPartString;
                String AmOrPm="AM";
                String answer;

                try
                {

                    if(Initial.indexOf(':')==-1)
                    {

                        throw new TimeFormatException();
                    }
                    else
                    {

                        thingPosition = Initial.indexOf(':');

                        //using a try block incase they entered it in the wrong format
                        FirstPart=Integer.parseInt(Initial.substring(0, thingPosition));
                        SecondPart=Integer.parseInt(Initial.substring(thingPosition+1,stringLength));
                        SecondPartString=Initial.substring(thingPosition+1,stringLength);
                        //testing if user inputed a value that is too high
                        if((FirstPart>24)||(FirstPart<0)||(SecondPart>60)||(SecondPart<0))
                        {
                            throw new TimeFormatException();
                        }
                        else
                        {   //in here is when it converts from 24 -> 12hr format
                            if(FirstPart==24)
                            {
                                FirstPart-=12;
                                AmOrPm="AM";
                            }
                            else if(FirstPart==12)
                            {
                                AmOrPm="PM";
                            }
                            else if(FirstPart>12)
                            {
                                FirstPart-=12;
                                AmOrPm="PM";
                            }
                            return answer=("The converted time is "+ FirstPart+":"+SecondPartString+AmOrPm);

                        }




                    }
                }
                catch(NumberFormatException a)
                {
                    return answer =("You entered an invalid value");
                }
                catch(TimeFormatException ex)
                {

                    return answer =("You entered incorrect format ex: 4:00 or 15:32");
                }
            }
    }