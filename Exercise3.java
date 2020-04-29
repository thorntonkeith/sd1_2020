//Keith Thornton
//30/03/2020

import java.util.Scanner;
public class Exercise3{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

    int num = 0;
    int age = 0;

	System.out.print("Enter a number: ");
	num = input.nextInt();
	System.out.print("Enter your age: ");
	age = input.nextInt();

	if(num > age){
		System.out.println("Number entered is greater than your age.");
	}else if(num < age){
		System.out.println("Number entered is less than your age.");
	}else if (num == age){
		System.out.println("Number entered is equal to your age.");
	}else{
		System.out.println("Invalid input.");
	}

	Index.main(null);
}
}

