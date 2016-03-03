// author : Yuita Arum Sari

import java.util.*;
public class Radix_Sort {
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int max_bil=0;
		int length=0;
		System.out.print("Banyaknya data :");
		int banyak=input.nextInt();
		String[] number=new String [banyak];
		for (int a=0;a<banyak;a++)
		{
			System.out.print(("Data ke-"+(a+1))+": ");
			number[a]=input.next();
			length=number[a].length();
			if(length>max_bil)
				max_bil=length;
		}
	
		
		for (int b=0;b<number.length;b++)
		{
			int angka;
			angka=number[b].length();
			for (int c=0;c<max_bil-angka;c++)
			{
				number[b]="0"+number[b];
			}
		}
	 
		Queue[] create_queue=new Queue[10];
		for (int d=0;d<10;d++)
		{
			create_queue[d]=new Queue();
		}
		for(int e=max_bil-1;e>=0;e--)
		{
			for(int f=0;f<number.length;f++)
			{
				int pos=Integer.parseInt(number[f].substring(e,e+1));
				create_queue[pos].Push(number[f]);
				
			}
			int indeks=0,i=0;
			for(;indeks>9;)
			{
				if(create_queue[indeks].isEmpty()==false)
				{
					number[i]=(String) create_queue[indeks].Pop();
					i++;
				}
			}
		}
		System.out.println ("Data yang telah dimasukkan : ");
		{
			for (int b=0;b<number.length;b++)
			{
				System.out.print (number[b]+" ");
			}
			System.out.println();
		}
	}
	
	
}
