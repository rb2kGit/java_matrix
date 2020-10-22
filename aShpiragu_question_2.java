package ashpiragu_assignment2;
import java.util.ArrayList;
import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.println("Hello! Welcome to the sum ArrayList Program.");
		
		int i = 0;
		double value;
		
		for(i = 0; i < 5; i++)
		{
			System.out.println("Please enter a number into index " + i + ":");
			value = input.nextInt();
			list.add(value);
		}
		
		System.out.println("The contents of your ArrayList is:");
		for(i = 0; i < 5; i++)
		{
			System.out.println("Index " + i + ": " + list.get(i));
		}
		
		System.out.println("The sum of your ArrayList is " + sum(list));

	}
	
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		
		for(int i = 0; i < 5; i++)
		{
			sum = sum + list.get(i);
		}
		
		return sum;
	}

}
