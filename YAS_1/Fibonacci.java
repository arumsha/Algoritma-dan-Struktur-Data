//copyright : Yuita Arum Sari
import java.util.*;
public class Fibonacci {
	public static int fibonaci (int banyak)
	{ 
		if ((banyak==0)||(banyak==1))
			return 1;
		else 
			return fibonaci(banyak-2)+fibonaci(banyak-1);
	}
	public static void display(int n)
	{
		for (int i=0;i<n;i++)
			System.out.println (fibonaci(i)+"  ");
	}
	public static void main (String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("******FIBONACCI******");
		int bilangan;
		System.out.print ("Masukkan banyaknya bilangan : ");
		bilangan=input.nextInt();
		display(bilangan);
		System.out.println();
	}
	
}
