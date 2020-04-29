//Keith Thornton
//03/04/2020
import java.util.Scanner;
import java.util.Random;
public class Exercise7{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  Random rnd = new Random();


	int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	System.out.println("First value: " +x[0]);
	System.out.println("Last value: " +x[9]);
	System.out.println();
	System.out.println("Reorganised array: ");
	System.out.println();


	for(int i = x.length - 1; i >= 0; i--){
	int index = rnd.nextInt(i + 1);
	int a = x[index];
	x[index] = x[i];
	x[i] = a;
	}

	for(int z =0; z < x.length; z++){
	System.out.println(x[z]);
	}

	Index.main(null);

}
}



