import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		for (int i=0;i<5 ;i++ )
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println("enter the number to search :");
		int ser=sc.nextInt();
		
		for(int i=0;i<5;i++)
		{
		   if (arr[i] ==ser)
		   {
		       System.out.println("found at index "+i);
		   }
		}
		
		
		
	}
}
