// dizinin en küçük elemanını dizinin ilk elemanı ile yer değiştiren program

class Dizi26{
	public static void main(String args[]) throws Exception
	{
		int a[] = {4,8,3,1,18,9,21,20,5,17};
		int size = 10;
		int min = a[0];
		int index = 0;
		for(int i=1;i<size;i++)
			if(a[i]<min){
				min = a[i];
				index = i;
			}
		a[index] = a[0];
		a[0] = min;
		for(int i=0;i<size;i++)
			System.out.println(i + " => " + a[i]);
	}
}
		
				
