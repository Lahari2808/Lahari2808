import java.util.Scanner;

public class ifelsedemo
{
public static void main(String[] args)
{

Scanner lahari = new Scanner(System.in);

System.out.println("Please enter your age: ");

int age = lahari.nextInt();

if(age>=60)
{

System.out.println("You are a senior citizen");

}

else if(age>=18)
{

System.out.println("You are eligible to vote");

}

else 
{

System.out.println("You are not eligible to vote");

}


}

}