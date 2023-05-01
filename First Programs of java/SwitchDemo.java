import java.util.Scanner;

public class SwitchDemo
{

public static void main(String[] args)

{

Scanner in = new Scanner(System.in);

System.out.println("Select the number you want: ");

int a = in.nextInt();

switch(a)

{

case 1 : 

System.out.println("neither prime nor composite");
break;

case 2 : 

System.out.println("prime no");
break;

case 4 : 

System.out.println("Composite no");
break;

default : 

System.out.println("Wrong number selection");

}

}

}