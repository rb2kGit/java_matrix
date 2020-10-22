package ashpiragu_assignment2;
import java.util.ArrayList;
import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Hello! Welcome to the sort ArrayList Program.");
		
		int i = 0;
		int value;
		
		for(i = 0; i < 5; i++)
		{
			System.out.println("Please enter a number into index " + i + ":");
			value = input.nextInt();
			list.add(value);
		}
		
		System.out.println("List before sorting:");
		for(i = 0; i < 5; i++)
		{
			System.out.println("Index " + i + ": " + list.get(i));
		}
		
		sort(list);
		
		System.out.println();
		System.out.println("List after sorting");
		for(i = 0; i < 5; i++)
		{
			System.out.println("Index " + i + ": " + list.get(i));
		}
		

	}
	
	public static void sort(ArrayList<Integer> list) {
		int i = 0;
		int check = 0;
		
		for(i = 0; i < list.size() - 1; i++ )
		{
			for(int j = 0; j < list.size() - i -1; j++)
			{
				if(list.get(j) > list.get(j + 1))
				{
					check = list.get(j);
					list.remove(j);
					list.add(j + 1, check);
				}
			}
		}
			
	}
}
