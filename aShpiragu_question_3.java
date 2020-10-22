package ashpiragu_assignment2;
import java.util.ArrayList;
import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Hello! Welcome to the remove duplicate ArrayList program.");
		
		int i = 0;
		
		System.out.println("Please enter 10 integers: ");
		for(i = 0; i < 10; i++)
		{
			list.add(input.nextInt());
		}
		
		System.out.println("The contents of your ArrayList is:");
		for(i = 0; i < 10; i++)
		{
			System.out.println("Index " + i + ": " + list.get(i));
		}
		System.out.println();
		
		removeDuplicate(list);

	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> cleanList = new ArrayList<>();
		int match = 0;
		int i;
		
		for(i = 0 ; i < list.size(); i++)
		{
			for(int j = i + 1; j < list.size(); j++)
			{
				if(list.get(i) == list.get(j))
				{
					match = 1;
				}
			}
			
			if(match == 1)
			{
				match = 0;
			}
			else
			{
				cleanList.add(list.get(i));
			}
		}
		
		System.out.printf("The distince integers are ");
		for(i = 0; i < cleanList.size(); i++)
		{
			System.out.printf(cleanList.get(i) + " ");
		}
	}

}
