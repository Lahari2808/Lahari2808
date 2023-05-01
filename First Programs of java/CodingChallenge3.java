import java.util.Scanner;

public class CodingChallenge3
{
public static void main(String[] args)
{
System.out.println("Calculator Menu");
System.out.println("1 -> Addition");
System.out.println("2 -> Subtraction");
System.out.println("3 -> Multiplication");
System.out.println("4 -> Division");
System.out.println("Select from the Calculator Menu you want to do");
int i,j,k;
Scanner in = new Scanner(System.in);
i = in.nextInt();
System.out.println("Enter the two numbers for the operation");
Scanner scan1 = new Scanner(System.in);
j = scan1.nextInt();
k = scan1.nextInt();
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
if(k==0)
{
System.out.println("Cannot be divided");
}
else 
{
int l =j/k;
System.out.println("Division of 2 numbers is: "+l);
break;
}
}

}



}


}