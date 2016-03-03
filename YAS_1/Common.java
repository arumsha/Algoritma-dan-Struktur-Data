// copyright : Yuita Arum Sari

public class Common {
	static int[] data=new int [10];
	public static void random()
	{
		for (int a=0;a<data.length;a++)
			data[a]=(int)(Math.random()*100);
	}
	public static void display()
	{
		for(int a=0;a<data.length;a++)
		{
			System.out.print (data[a]+" ");
		}	
		System.out.println();
	}
	public static void tukar(int start,int end)
	{
		int temp;
		temp=data[start];
		data[start]=data[end];
		data[end]=temp;
	}
}
