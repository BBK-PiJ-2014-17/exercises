import java.util.Scanner;
public class LineToColWord
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Read input and write words as rows

String str;
int len, i = 0, idx;
boolean b = true;

System.out.print("Please enter an input string: ");
str = System.console().readLine();

len = str.length();

while (b) {
	
	idx = str.indexOf(" ");
	
	if (idx == -1) {
		System.out.println(str);
		b = false;
		break;
	} else {
	
		System.out.println(str.substring(0, idx));
	
	}
	
	str = str.substring(idx + 1, str.length());
	
}
}}

