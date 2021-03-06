import java.util.Scanner;
public class PiCalc2
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 2 - Exercise 18
// Calculate Pi using series approximation
// Calculate number of terms required for
// a. 3.14
// b. 3.14159265358

// variables

int k = 0, n; // n = number of terms
double s = 0.0, delta = 1000.0; // s = summation
boolean b = true;
String str, sstr;

// Intro and user input request

System.out.println("***\tDay 2, Exercise 18 \t\t***");
System.out.println("***\tPI	\t\t\t***");
System.out.println();
System.out.println("This program will approximate pi using series approximation");
System.out.println("First it will output the number of terms required to get an");
System.out.println("accuracy of 2dp. Then, it will out the number of terms required");
System.out.println("to get an accuracy of 10dp.");
System.out.println("Press and key to continue...");
System.console().readLine();
System.out.println();

while (b) {

    s += (Math.pow((double)-1,(double)k) / ((2 * (double)k) + 1));
	
	//delta = Math.abs(3.14 - (4 * s));
	
	//println("Counter: " + k);
	//println("Term: " + (Math.pow((double)-1,(double)k) / ((2 * (double)k) + 1)));
	//println("Sum: " + 4 * s);
	//println("Diff: " + delta);
	
	str = "" + 4 * s + "0000000000";
	sstr = str.substring(0,12);
	
	//println(sstr);
	
	b = (sstr.equals("3.14")) ? false : true;
	//b = (sstr.equals("3.1414159265")) ? false : true;
	
	k++;

	//System.console().readLine();
	
}

System.out.println("Pi Approximated: " + 4 * s + " in " + k + " many steps.");
}}

