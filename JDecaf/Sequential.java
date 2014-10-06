import java.util.Scanner;
public class Sequential
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Find sequential numbers

int i = 0, j = 0, prev = 0, up = 0;
boolean seq = true, startSet = false, dir = true;
String str;

System.out.println("Enter a sequences of numbers terminated by a -1.");

while (i != -1) {

    j++;
    
    System.out.print(j + ": ");
    str = System.console().readLine();
    i = Integer.parseInt(str);
    
    if (i == -1) { break; }
    
    if (startSet) {
        
        if (seq) {
            dir = (i > prev) ? true : false;
            up = (dir) ? 1 : -1;
            seq = (i - prev == up) ? true : false;
        } else {
            //pass
        }
        
        prev = i;
        
    } else {
        prev = i;
        startSet = true;
    }

}

System.out.println("The sequence was sequential: " + seq);
}}

