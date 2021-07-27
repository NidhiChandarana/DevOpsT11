import java.util.Scanner;
class AddArray
{
	public static void main(String[] args)
	{
		int i,j,k,l;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns for your matrix: ");
		i = sc.nextInt();
		j = sc.nextInt();
		
		int first[][] = new int[i][j];
		int second[][] = new int[i][j];
		int sum [][] = new int[i][j];
		
		System.out.println("Enter elements for Matrix 1: ");
		
		for(k=0; k<i; k++)
		{
			for(l=0; l<j; l++)
			{
				first[k][l] = sc.nextInt();
			}
		}
		
		System.out.println("Enter elements for Matrix 2: ");
		for(k=0; k<i; k++)
		{
			for(l=0; l<j; l++)
			{
				second[k][l] = sc.nextInt();
			}
		}
		
		for(k=0; k<i; k++)
		{
			for(l=0; l<j; l++)
			{
				sum[k][l] = first[k][l] + second[k][l];
			}
        }
		
		System.out.println("Sum of Matrices is : ");
		for(k=0; k<i; k++)
		{
			for(l=0; l<j; l++)
			{
				System.out.println(sum[k][l] + "\t");
			}
		 System.out.println();
		}
	}
	
}
		
		
		
		
		
			
				