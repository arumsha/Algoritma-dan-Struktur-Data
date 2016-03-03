// author : Yuita Arum Sari

class Node {
	Object data;
	Node next;
	Node prev;
}
public class DoubleCircularList {
	Node head;
	
	public DoubleCircularList()
	{
		head=null;
	}
	
	public boolean IsEmpty()
	{
		return(head==null);
	}
	public Object GetFirst()
	{
		return head.data;
	}
	public boolean IsNotEmpty()
	{
		return (head!=null);
	}
	public int size()
	{
		int size_data=0;
		Node n=head;
		if (IsNotEmpty())
			do
			{
				n=n.next;
				size_data++;
			}
			while (n!=head) ;
		return size_data;
	}
	public void InsertLast (Object o)
	{
		Node new_n=new Node();
		new_n.data=o;
		if (IsEmpty())
		{
			head=new_n;
			new_n.next=head;
			new_n.prev=head;
		}
		else
		{
			new_n.next=head;
			new_n.prev=head.prev;
			head.prev.next=new_n;
			head.prev=new_n;
		}
	}
	public void InsertFirst(Object o)
	{
		InsertLast(o);
		head=head.prev;
	}
	public void print (String str)
	{
		System.out.println (str);
		Node n=head;
		if (IsNotEmpty())
		{
			do
			{
				System.out.println (n.data);
				n=n.next;
			}
			while (n!=head);
		}
		else
		{
			System.out.println ("List Kosong");
		}
	}
	public Node FindLastNode()
	{
		Node n=head;
		if (n!=null)
		{
			while(n.next!=null)
			{
				n=n.next;
			}
		}
		return n;
	}
	public void DeleteFirst()
	{
		/*head.prev.next=head.next;
		head.next.prev=head.prev;
		head=head.next;*/
		Node nod=head;
		nod.data=null;
		nod.next.prev=nod.prev;
		nod.prev.next=nod.next;
		head=nod.next;
	}
	public void DeleteNode(Node Pdel)
	{
		Node del = new Node();
		Node curr=head;
		while( curr.next!=head)
		{
			if (curr.data==Pdel.data)
			{
				del=curr;
			}
			curr=curr.next;
		}
		del.prev.next=del.next;
		del.next.prev=del.prev;
		
	}
	public static void main (String args[])
	{
		
		DoubleCircularList dcl=new DoubleCircularList();
		dcl.InsertFirst(10);
		dcl.DeleteFirst();
	//	dcl.InsertFirst(20);
	//	dcl.InsertFirst(30);
		//dcl.InsertLast(40);
	//	dcl.DeleteFirst();
		//Node a=new Node();
		////a.data=20;
		//dcl.DeleteNode(a);
		
		dcl.print("Cetak hasil : ");
		System.out.print(dcl.size());
	}
}
