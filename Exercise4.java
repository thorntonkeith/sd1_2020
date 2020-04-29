//Keith Thornton
//30/03/2020
import java.util.Scanner;
public class Exercise4{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

	int num = 0;
	int counter = 0;

	System.out.print("Enter a number from 1 to 10: ");
	num = input.nextInt();

	while(num < 1 || num > 10){
		System.out.println("Invalid number entered. Please try again.");
		System.out.println();
		System.out.print("Enter a number from 1 to 10: ");
		num = input.nextInt();
		counter++;
	}

	if(num > 0 && num < 11){
		for(int i =1; i <= num; i++){
			System.out.println(i+ ".Keith");
		}
	}

	Index.main(null);









   }
}