// copyright : Yuita Arum Sari

import java.util.*;
public class TestSingleLinkedList {
	public static void main (String args[])
	{	Scanner input=new Scanner(System.in);
		int option=0;
		SingleLinkedList L=new SingleLinkedList();
		do
		{
			System.out.println();
			System.out.println ("\t===========SINGLE LINKED LIST==========");
			String[] pilihan={"\t1. Memasukkan data di posisi awal",
								"\t2. Memasukkan data di posisi akhir",
								"\t3. Menampilkan data",
								"\t4. Hapus data di posisi awal",
								"\t5. Hapus data di posisi tengah",
								"\t6. Hapus data di posisi akhir"};
			for (int i=0;i<pilihan.length;i++)
				System.out.println (pilihan[i]);
				System.out.println (">>>>>>  Ketik 0 untuk mengakhiri program");
			for (int a=1;a<=50;a++)
					System.out.print("=");
				System.out.println ();
				System.out.print ("Pilihan anda adalah : ");
				option=input.nextInt();
		
				switch(option)
				{
				case 1:
					System.out.print("Memasukkan data di posisi awal :");
					int first_data=input.nextInt();
					L.InsertFirst(first_data);
					break;
				case 2:
					System.out.print("Memasukkan data di posisi akhir :");
					int last_data=input.nextInt();
					L.InsertFirst(last_data);
					break;
				case 3 :
					System.out.print("Menampilkan Data : ");
					L.print();
					System.out.println(); 
					break;
				case 4:
					System.out.print("Menghapus data di posisi awal : ");
					L.DeleteFirstNode();
					L.print();
					System.out.println();
					break;
				case 5:
					System.out.print("Menghapus data di posisi tengah : ");
					L.DeleteMiddleNode();
					L.print();
					System.out.println();
					break;
				case 6:
					System.out.print("Menghapus data di posisi akhir : ");
					L.DeleteLastNode();
					L.print();
					System.out.println();
					break;	
				case 0: System.exit(0);
				}
			}
		while(option!=0);
	}

}
