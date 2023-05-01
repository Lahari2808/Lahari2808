import java.util.Scanner;

public class CodingChallenge
{
public static void main(String[] args)
{

Scanner scan1 = new Scanner(System.in);
System.out.println("Enter the two numbers for the operation");

int j = scan1.nextInt();
int k = scan1.nextInt();
System.out.println("Calculator Menu");
System.out.println("1 -> Addition");
System.out.println("2 -> Subtraction");
System.out.println("3 -> Multiplication");
System.out.println("4 -> Division");
System.out.println("Select from the Calculator Menu you want to do");
//System.out.Print("Enter the two numbers for the operation");
//Scanner in = new Scanner(System.in);
int i = scan1.nextInt();
//int j = in.nextInt();
//int k = in.nextInt();

switch(i)
{
case 1 : 
{
int l =j+k;
System.out.println("Addition of 2 numbers is: "+l);
break;
}
case 2 : 
{
int l =j-k;
System.out.println("Subtraction of 2 numbers is: "+l);
break;
}
case 3 : 
{
int l =j*k;
System.out.println("Multiplication of 2 numbers is: "+l);
break;
}
case 4 : 
{
int l =j/k;
System.out.println("Division of 2 numbers is: "+l);
break;
}
default : 
{
System.out.println("Cannot be divided");
}
}

}



}


