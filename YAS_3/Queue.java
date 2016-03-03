// author : Yuita Arum Sari

public class Queue {
	private DoubleCircularList Q;
	public Queue()
	{
		Q =new DoubleCircularList();
	}
	public void Push(Object o)
	{
		Q.InsertLast(o);
	}
	public Object Pop()
	{
		Object o=Q.GetFirst();
		Q.DeleteFirst();
		return o;
	}
	public Object Peek()
	{
		Object o=Q.GetFirst();
		return o;
	}
	public boolean isEmpty()
	{
		return Q.IsEmpty();
	}
	public int size()
	{
		return Q.size();
	}
	public void print(String str)
	{
		Q.print(str);
	}
	public static void main (String args[])
	{
		
		Queue q=new Queue();
		q.Push(1);
		q.Push(9);
		q.Pop();
		q.size();
		q.print(" ");
		
	}

}
