import java.util.*;
import java.io.*;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		double b;
		double sum;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Please enter the 1st Number");
		a = read.nextDouble();
		System.out.println("Please enter the 1st Number");
		b = read.nextDouble();
		
		read.close();
		
		System.out.println("the 1st Num is" + a);
		System.out.println("the 1st Num is" + b);
		
		sum = a+b;
		System.out.println("the sum of the number is" + sum);
	}

}
