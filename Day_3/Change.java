import java.util.Scanner;
public class Change
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 3
// Change in Notes and Coins

// variables

int nFifties, nTwenties, nTens, nFives;
int cTwos, cOnes, cFifties, cTwenties, cTens, cFives, cTwoPs, cOnePs;
double cost, paid, change;
String str;

// Intro and user input request

System.out.println("***\tDay 3, Exercise 3 \t\t***");
System.out.println("***\tYOUR CHANGE, PLEASE \t\t***");
System.out.println();
System.out.println("This program will read in the cost of purchase and amount paid");
System.out.println("and return the change due in notes and coins. Please enter the");
System.out.println("the cost and amount paid at the prompts below.");
System.out.print(">> Cost: ");
str = System.console().readLine();	// receive user input
cost = Double.parseDouble(str);
System.out.println();
System.out.print(">> Paid: ");
str = System.console().readLine();	// receive user input
paid = Double.parseDouble(str);
change = paid - cost;

System.out.println("Total Change = " + change);

// Notes

nFifties = (int)change / 50;
System.out.println("You are owed " + nFifties + " 50 note(s) ");
change -= (50.0 * (double)nFifties);

nTwenties = (int)change / 20;
System.out.println("You are owed " + nTwenties + " 20 note(s) ");
change -= (20.0 * (double)nTwenties);

nTens = (int)change / 10;
System.out.println("You are owed " + nTens + " 10 note(s) ");
change -= (10.0 * (double)nTens);

nFives = (int)change / 5;
System.out.println("You are owed " + nFives + " 5 note(s) ");
change -= (5.0 * (double)nFives);

// Coins

cTwos = (int)change / 2;
System.out.println("You are owed " + cTwos + " 2 pound coin(s) ");
change -= (2.0 * (double)cTwos);

cOnes = (int)change / 1;
System.out.println("You are owed " + cOnes + " 1 pound coin(s) ");
change -= (1.0 * (double)cOnes);

cFifties = (int)(change * 100) / (int)(0.5 * 100);
System.out.println("You are owed " + cFifties + " 50p coin(s) ");
change -= (0.5 * (double)cFifties);

cTwenties = (int)(change * 100) / (int)(0.2 * 100);
System.out.println("You are owed " + cTwenties + " 20p coin(s)");
change -= (0.2 * (double)cTwenties);

cTens = (int)(change * 100) / (int)(0.1 * 100);
System.out.println("You are owed " + cTens + " 10p coins(s)");
change -= (0.1 * (double)cTens);

cFives = (int)(change * 100) / (int)(0.05 * 100);
System.out.println("You are owed " + cFives + " 5p coin(s)");
change -= (0.05 * (double)cFives);

cTwoPs = (int)(change * 100) / (int)(0.02 * 100);
System.out.println("You are owed " + cTwoPs + " 2p coin(s)");
change -= (0.02 * (double)cTwoPs);

cOnePs = (int)(change * 100) / (int)(0.01 * 100);
System.out.println("You are owed " + cOnePs + " 1p coin(s)");
change -= (0.01 * (double)cOnePs);

System.out.println();
System.out.println("End of Program");
}}

