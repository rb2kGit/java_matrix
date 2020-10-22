package ashpiragu_assignment2;
import java.util.Scanner;

public class question_4_Location {
	public int row;
	public int column;
	public double maxValue;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello and welcome to the matrix program!");
		System.out.println("Please enter the number of rows in the matrix: ");
		int maxRows = input.nextInt();
		System.out.println("Great, now please enter the number of columns for this matrix: ");
		int maxCols = input.nextInt();
		
		double[][] matrix = new double[maxRows][maxCols];
		
		System.out.println("Awesome! Now please enter values into your matrix: ");
		for(int i = 0; i < maxRows; i++)
		{
			for(int j = 0; j < maxCols; j++)
			{
				matrix[i][j] = input.nextDouble();
			}
		}
		
		question_4_Location obj = locateLargest(matrix);
		
		System.out.println("The largest number is " + obj.maxValue + " and it is located at (" + obj.row + ", " + obj.column + ")");

	}
	
	public static question_4_Location locateLargest(double[][] a)
	{	
		question_4_Location obj = new question_4_Location();
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				if(obj.maxValue < a[i][j])
				{
					obj.maxValue = a[i][j];
					obj.row = i;
					obj.column = j;
				}
			}
		}
		return obj;
	}

}
