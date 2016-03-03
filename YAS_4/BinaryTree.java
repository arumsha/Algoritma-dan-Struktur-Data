// author : Yuita Arum Sari

import java.util.*;
class Node {
	int data;
	Node leftchild;
	Node rightchild;
}
public class BinaryTree {
	static Node root;
	static Scanner input=new Scanner(System.in);
	public BinaryTree()
	{
		root=null;//inisialisasi bahwa isi root adalah null
	}
	public static void InsertNode (Node node,int angka)//method insert
	{
		if (root== null)//jika root tidak ada
		{
			root=new Node();//membuat node dengan nama root
			root.data=angka;//root diisi data
			root.leftchild=null;//inisialisasi pointer root ke sebelah kiri adalah null
			root.rightchild=null;//inisialisasi pointer root ke sebelah kanan adalah null
		}
		else //jika root ada datanya
		{
			if (angka<node.data) //jika inputan angka lebih kecil dari data yang ada
			{
				if(node.leftchild==null) // jika pointer ke kiri node tidak ada
				{
					Node newNode=new Node();//membuat node baru
					newNode.data=angka;//node baru diisi data
					newNode.leftchild=null;//mengarahkan pointer ke sebelah kiri dengan inisialisasi null
					newNode.rightchild=null;//mengarahkan pointer ke sebelah kanan dengan inisialisasi null
					node.leftchild=newNode;//node baru diletakkan di sebelah kiri
				}
				else // jika terdapat pointer untuk menuju kiri node
					InsertNode(node.leftchild,angka); //melakukan pengecekan ke anak kiri node secara recursive
			}
			else //jika inputan angka lebih besar dari data yang ada
			{
				if (node.rightchild==null) // jika pointer ke kanan node tidak ada
				{
					Node newNode=new Node(); //membuat node baru
					newNode.data=angka; //node baru diisi data
					newNode.leftchild=null; //mengarahkan pointer ke sebelah kiri dengan inisialisasi null
					newNode.rightchild=null; //mengarahkan pointer ke sebelah kanan dengan inisialisasi null
					node.rightchild=newNode; //node baru diletakkan di sebelah kanan
				}
				else //jika terdapat pointer untuk menuju kanan node
					InsertNode(node.rightchild,angka); // melakukan pengecekan ke anak kanan node secara recursive
			}
		}
	}
	public static void PreOrderDLR(Node nod) //method untuk mencetak secara preorder DLR
	{
		//root-anak kiri-anak kanan
		System.out.print (nod.data+" ");//dibaca dari root dulu
		if (nod.leftchild!=null)//jika anak kiri node ada
		{
			PreOrderDLR(nod.leftchild);//pembacaan ke anak kiri node secara recursive
		}
		if (nod.rightchild!=null)//jika anak kanan node ada
		{
			PreOrderDLR (nod.rightchild);//pembacaan ke anak kanan node secara recursive
		}
	}
	public static void InOrderLDR(Node nod) //method untuk mencetak secara inorder DLR
	{
		//anak kiri-root-anak kanan
		if (nod.leftchild!=null)//jika anak kiri node ada
		{
			InOrderLDR(nod.leftchild);//pembacaan ke anak kiri node secara recursive
		}
		System.out.print (nod.data+" ");//root dibaca
		if (nod.rightchild!=null)//jika anak kanan node ada
		{
			InOrderLDR(nod.rightchild);//pembacaan ke anak kanan node secara recursive
		}
	}
	public static void PostOrderLRD(Node nod) //method untuk mencetak secara postorder DLR
	{
		//anak kiri-anak kanan-root
		if (nod.leftchild!=null)//jika anak kiri node ada
		{
			PostOrderLRD(nod.leftchild);//pembacaan ke anak kiri node secara recursive
		}
		if (nod.rightchild!=null)//jika anak kanan node ada
		{
			PostOrderLRD(nod.rightchild);//pembacaan ke anak kanan node secara recursive
		}
		System.out.print (nod.data+" ");//root dibaca
	}
	public static Node find(int meet)//method untuk mencari data     
	{                         
		Node current = root;//dibaca mulai root          
		while(current.data!= meet) //selama data dari root tidak sama dengan data yang diinputkan      
		{//data dicari
			if(meet < current.data)//jika inputan yang dicari lebih kecil dari data root        
				current = current.leftchild;//pencarian dilakukan ke anak kiri dari root
			else//jika inputan yang dicari lebih besar dari data root                          
				current = current.rightchild;//pencarian dilakukan ke anak kanan dari root
			if(current == null) //jika root kosong            
				return null;  //nilai kembalian adalah null               
		}
		return current; //nilai kembalian ke node root                 
	}
	
	public static void Input()//method untuk memasukkan data
	{
		System.out.print("Masukkan banyaknya data :");
		int data=input.nextInt();
		for (int i=0;i<data;i++)
		{
			System.out.print ("Data ke-"+(i+1)+" : ");//input data
			int inputan=input.nextInt();
			InsertNode(root, inputan);//menampilkan data yang telah dimasukkan
		}
	}
	public static void CekSearch()//method untuk melakukan pencarian
	{
		System.out.print("Masukkan data yang ingin dicari : ");
		int searching=input.nextInt();
		Node found=find(searching);//menggunakan  method find untuk melakukan pencarian
		if (found !=null)//jika data inputan yang telah diproses pada method find ada
		{
			System.out.println("YES KETEMU !!!!");//data ditemukan
		}
		else//jika data inputan yang telah diproses pada method find tidak ada
			System.out.println ("LHO GAK ADA TU....");//data tidak ditemukan
	}
}
