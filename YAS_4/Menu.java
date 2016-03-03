// author : Yuita Arum Sari

import java.util.*;
public class Menu {
	public static void main (String args[])
	{
		BinaryTree BT= new BinaryTree();
		int pilih=0;
		do
		{
			Scanner input=new Scanner(System.in);
			System.out.println ("\t   === TREE ===");
			String[] pilihan={"\t1.Memasukkan Data ","\t2.Menampilkan Data","\t3.Mencari Data"};
			for (int i=0;i<pilihan.length;i++)
				System.out.println (pilihan[i]);
				System.out.println ("Ketik 0 untuk mengakhiri program");
				System.out.println ();
				System.out.print ("Pilihan anda adalah : ");
				pilih=input.nextInt();
				
				switch(pilih)
				{
				case 1:
					System.out.println("****** INSERT DATA ******");
					BT.Input();
					System.out.println();
					break;
				case 2:
					System.out.println("****** MENAMPILKAN DATA ******");
					System.out.print ("1. Pre Order Transversal : ");
					BT.PreOrderDLR(BT.root);
					System.out.println();
					System.out.print ("2. In Order Transversal : ");
					BT.InOrderLDR(BT.root);
					System.out.println();
					System.out.print ("3. Post Order Transversal : ");
					BT.PostOrderLRD(BT.root);
					System.out.println();
					System.out.println();
					break;
				case 3 :
					System.out.println("****** MENCARI DATA ******");
					BT.CekSearch();
					System.out.println();
					break;
				case 0: System.exit(0);
				}
			}
		while(pilih!=0);
	}
}