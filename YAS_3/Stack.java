// author : Yuita Arum Sari

public class Stack {
	private DoubleCircularList S;
	public Stack()
	{
		S=new DoubleCircularList();
	}
	public void Push(Object o)
	{
		S.InsertFirst(o);
	}
	public Object Pop()
	{
		Object o=S.GetFirst();
		S.DeleteFirst();
		return o;
	}
	public void print (String str)
	{
		S.print(str);
	}
	public static void main (String[]args)
	{
		Stack S=new Stack();
		S.Push(1);
		S.Push(2);
		S.Push(3);
		S.Push("empat");
		S.print("Stack Asal");
		Object o=S.Pop();
		S.print("Stack setelah di Pop");
		System.out.println ("Object yang di pop : "+o);
	}

}
