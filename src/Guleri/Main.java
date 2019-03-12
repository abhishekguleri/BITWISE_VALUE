//program to find the value of the bitwise and shift operators using user input number bitwise:
//1. complement 2. and 3. or 4. xor shift: 1. left shift 2. right shift 3. unsigned right shift these are all solved in the program
package guleri;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
		System.out.println("please enter any number:");
		int num=input.nextInt();
				  byte comp= (byte)~num;
		System.out.println("bitwise complement="+comp);
		System.out.println("please enter any two number:")
			int num1=input.nextInt();
		int num2=input.nextInt();
				   byte and=(byte)(num1&num2);
			System.out.println("bitwise AND="+and);
		byte or=(byte)(num1|num2);
	System.out.println("bitwise OR="+or);
		byte xor=(byte)(num1^num2);
	System.out.println("bitwise XOR="+xor);
		byte left=(byte)(num1<<num2);
	System.out.println("Left shift ="+left);
		byte right=(byte)(num1>>num2);
	System.out.println("Right shift="+right);
		byte urs=(byte)(num1>>>num2);
	System.out.println("Unsigned right shift="+urs);}
} 
		
		
		
		
