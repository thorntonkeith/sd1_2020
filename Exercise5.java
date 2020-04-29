//Keith Thornton
//30/03/2020

import java.util.Scanner;
public class Exercise5{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);



		int[] x = {20, 30, 40, 50};
		int sum = 0;
		int product = 1;
		int average = 0;

	  	for(int i = 0; i < x.length; i++){
			sum = sum + x[i];
			product = product * x[i];
			average = sum / x.length;


		}

  		System.out.println("Sum total of all array values is: " +sum);
  		System.out.println("Product of all array values is: " +product);
  		System.out.println("Average of all array values is: " +average);

  		Index.main(null);









}
}
