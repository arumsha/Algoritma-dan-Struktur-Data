// copyright : Yuita Arum Sari

class InsertionSort extends Common{
	public static void insertionSort(int[] a,int last)
	{
		int first=1;
		if (first<last)
		{
			insertionSort(a,last-1);
			InsertionSort(a,last+1);
			display();
		}
	}
	public static void InsertionSort(int[] array1, int length) {
		int temp;              
		int pos=0;                  
		for (int i = 1; i <length-1; i++)   
		{                                        
			temp = array1[i];                        
			pos = i - 1;                            
			while ((pos >= 0) && (temp < array1 [pos]))      
			{
				array1[pos + 1] = array1[pos];            
				pos--;
			}
			array1[pos + 1] = temp;
		}	
	}
}


