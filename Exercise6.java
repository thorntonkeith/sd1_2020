//Keith Thornton
//03/04/2020

import java.util.Scanner;
public class Exercise6{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);


	int column = 1;
	int row = 1;
	int c = 0;
	int r = 0;
	String symb1 = "";

	System.out.print("Enter a symbol: ");
    symb1 = input.next();
	char symb2 = symb1.charAt(0);
	System.out.print("Enter number of rows: ");
	r = input.nextInt();
	System.out.print("Enter number of columns: ");
	c = input.nextInt();



	while(row <= r){
	while(column <= c){
		System.out.print(symb2+ " ");
	column++;
	}

	column = 1;
	System.out.println();
	row++;
	}

	Index.main(null);




}
}
