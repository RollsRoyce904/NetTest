/*
 * Author: Royce Rhoden
 * Course: COP 3538
 * Project: 
 * Title:
 * Due Date:
 */

package nettest;

import java.util.Scanner;

/**
 *
 * @author slip4
 */
public class NetMenu 
{
    public String optionOne = "Host Current Date and Time";
    public String optionTwo = "Host UpTime";
    public String optionThree = "Host Memory Usage";
    public String optionFour = "Host NetStat";
    public String optionFive = "Host Current Users";
    public String optionSix = "Host Running Processes";
    public String optionSeven = "Quit";
    
    public String[] menuOptions = {optionOne, optionTwo, optionThree, optionFour, optionFive, optionSix, optionSeven};
    
    public NetMenu()
    {
        Scanner userScanner  = new Scanner(System.in);
        
        for(int i = 0; i < menuOptions.length ; i++)
        {
            int number = i + 1;
            System.out.printf("%d: %s%n", number, menuOptions[i]);
        }
        
        int userInput = userScanner.nextInt();
        
        switch (userInput)
        {
            case 1: //
                break;
            case 2: //
                break;
            case 3:
                break;
            case 4:
                break;
            case 5: //
                break;
            case 6: //
                break;
            case 7: //
                break;
            default: //
                break;
        }
    }
}
