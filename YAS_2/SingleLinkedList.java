class Node {//dimisalkan sebuah kotak-->yang isinya data,kemudian Node next
	Object data;//merupakan data
	Node next;//variabel instant Node untuk referensi Node selanjutnya
}

// copyright : Yuita Arum Sari

public class SingleLinkedList
{
	Node head; //Node dengan nama head yaitu sebagai awal
	public SingleLinkedList()//konstruktor
	{
		head=null;// node awal mulanya diisi kosong
	}
	public int countNode()//method digunakan untuk menghitung jumlah Node
	{
		int count=1;//penghitungan dimulai dari 1 sebagai pembanding
		Node n=head;
		if (n!=null) //jika node awal ada
		{
			while (n.next!=null)//selama node-node itu ada atau belum ketemu node null
			{
				n=n.next;//node berisi data
				count++;//node-node dihitung
			}
		}
		return count;//nilai dikembalikan pada count awal
	}
	public Node FindLastNode()//method untuk menemukan Node terakhir
	{
		Node n=head;//mendiskripsikan node awal
		if (n!=null)
		{
			while(n.next!=null)
			{
				n=n.next;
			}
		}
		return n;//nilai kembalian dikembalikan pada node awal
	}
	public Node FindBeforeLastNode()//method untuk menemukan node sebelum node terakhir
	{
		Node n=head;
		if (n!=null)
		{
			while(n.next.next!=null)//selama node sebelum node terkhir itu ada
			{
				n=n.next;//node yang berisi data akan bergerak sebelum bertemu node terakhir
			}
		}
		return n;//nilai kembalian dikembalikan 
	}
	public void InsertFirst(Object o)//method yang digunakan untuk menyisipkan data di awal
	{
		Node nn=new Node();//nn didefinsikan sebagai node
		nn.data=o;//nn berisi data yang diinputkan oleh parameter o dengan tipe data int
		nn.next=head;
		//nn.next=null;
		//nn=head;
		head=nn;// data nn menjadi awal node
	}
	public void InsertLast (Object o)//method untuk menyisipkan node ang terletak di akhir
	{
		if (head==null)//jika awal node tidak ada
		{
			InsertFirst(o);//menyisipkan node di posisi awal
		}
		else //jika tidak
		{
			Node n=FindLastNode();// n merupakan variabel untuk menemukan Last Node
			Node new_n=new Node();//new_n--> node baru yang akan disisipkan
			new_n.data=o;//new_n--diisi dengan inputan o
			
			new_n.next=null;
			n.next=new_n;//data terkahkir sebelum node disisipkan
		}
	}
	public void DeleteFirstNode()//method untuk menghapus data awal
	{
		head=head.next;//awal node refers to data setelah head
	}
	public Node FindNode(int position)//untuk menemukan posisi data
	{	
		int start=1;//nilai awal adalah 1
		Node n=head;
		if (n.next!=null)
			while(position!=start)//selama nilai awal tidak sama dengan parameter inputan
			{
				n=n.next;
				start++;
			}
		return n;//nilai dikembalikan ke n
	}
	public void DeleteMiddleNode()//method untuk menghapus data yang di tengah
	{
		int count=countNode();
		int midlle=count/2;//membagi data menjadi dua untuk dicari data tengahnya
		if(count%2==0)//jika data genap
			midlle--;//bergerak mundur
		Node mid=FindNode(midlle);//menemukan data tengahnya
		Node first=mid.next.next;
		mid.next=first;//data tengah tergantikan karena .next dua kali
	}
	
	public void DeleteLastNode()//method untuk menghapus data terakhir
	{
		Node del_last= FindBeforeLastNode();//menggunakan method menemukan data sebelum terakhir
		del_last.next=null;//data sebelum null terhapus
	}
	public void print()//method untuk mencetak hasil linked list
	{
		Node n=head;
		while (n!=null)
		{
			System.out.print (n.data + " ");
			n=n.next;
		}
	}
}
