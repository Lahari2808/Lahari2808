import java.util.Scanner;

public class InputOutputDemo
{

public static void main(String[] args)

{

int num1;
float num2;
char character;
boolean bool;
String str;
double num3;

Scanner in = new Scanner(System.in);

System.out.println("Enter int value: ");
num1 = in.nextInt();

System.out.println("Enter float value: ");
num2 = in.nextFloat();

System.out.println("Enter Character value: ");
character = in.next().charAt(0);

System.out.println("Enter Boolean value: ");
bool = in.nextBoolean();

System.out.println("Enter String value: ");
str = in.next();

System.out.println("Enter double value: ");
num3 = in.nextDouble();

System.out.println("int ->"+num1);
System.out.println("float ->"+num2);
System.out.println("char ->"+character);
System.out.println("boolean ->"+bool);
System.out.println("String ->"+str);
System.out.println("double ->"+num3);

}
}