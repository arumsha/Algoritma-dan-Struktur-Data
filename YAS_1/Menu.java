// copyright : Yuita Arum Sari

import java.util.*;
public class Menu {
	public static void main (String args[])
	{
		Scanner input=new Scanner(System.in);
		int pilih=0;
		do
		{
			System.out.println ("===FIBONACCI,SELECTION SORT,DAN INSERTION SORT===");
			String[] pilihan={"\t1. Fibonacci","\t2. Selection Sort","\t3. Insertion Sort"};
			for (int i=0;i<pilihan.length;i++)
				System.out.println (pilihan[i]);
				System.out.println ("Ketik 0 untuk mengakhiri program");
				System.out.println ();
				System.out.print ("Pilihan anda adalah : ");
				pilih=input.nextInt();
		
				switch(pilih)
				{
				case 1:
					System.out.println("******FIBONACCI******");
					Fibonacci fibo=new Fibonacci();
					int bilangan;
					System.out.print ("Masukkan banyaknya bilangan : ");
					bilangan=input.nextInt();
					fibo.display(bilangan);
					System.out.println();
					break;
				case 2:
					System.out.println ("SELECTION SORT");
					SelectionSort select=new SelectionSort();
					select.random();
					System.out.print ("Data sebelum diurutkan : ");
					select.display();
					System.out.println ("Prosesnya adalah : ");
					select.SelectionSort(select.data,0);
					System.out.print ("Data setelah diurutkan : ");
					select.display();
					System.out.println();
					break;
				case 3 :
					System.out.println ("INSERTION SORT");
					InsertionSort insert=new InsertionSort();
					insert.random();
					System.out.print ("Data sebelum diurutkan : ");
					insert.display();
					System.out.println ("Prosesnya adalah : ");
					insert.insertionSort(insert.data,10);
					System.out.print ("Data setelah diurutkan : ");
					insert.display();
					System.out.println();
					break;
				case 0: System.exit(0);
				}
			}
		while(pilih!=0);
	}
}