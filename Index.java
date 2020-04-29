//Keith Thornton
//03/04/2020
import java.util.Scanner;
public class Index{
  public static void main(String[] args){
  	Scanner input = new Scanner(System.in);
	int choice = 0;

	System.out.println("Select an option (1-8):");
	System.out.println();
	System.out.println("1. Exercise 1");
	System.out.println("2. Exercise 2");
	System.out.println("3. Exercise 3");
	System.out.println("4. Exercise 4");
	System.out.println("5. Exercise 5");
	System.out.println("6. Exercise 6");
	System.out.println("7. Exercise 7");
	System.out.println("8. Exit");

	System.out.println();

	System.out.print("Choice: ");
	choice = input.nextInt();
	System.out.println();


	if(choice == 1){
		System.out.println("Exercise 1");
		System.out.println();
		Exercise1.main(null);
	}else if(choice == 2){
		System.out.println("Exercise 2");
		System.out.println();
		Exercise2.main(null);
	}else if(choice == 3){
		System.out.println("Exercise 3");
		System.out.println();
		Exercise3.main(null);
	}else if(choice == 4){
		System.out.println("Exercise 4");
		System.out.println();
		Exercise4.main(null);
	}else if(choice == 5){
		System.out.println("Exercise 5");
		System.out.println();
		Exercise5.main(null);
	}else if(choice == 6){
		System.out.println("Exercise 6");
		System.out.println();
		Exercise6.main(null);
	}else if(choice == 7){
		System.out.println("Exercise 7");
		System.out.println();
		Exercise7.main(null);
	}else if(choice == 8){
		System.out.println("Exit");
		System.out.println();
	}else{
		System.out.println("Invalid number entered");
	}
}
}