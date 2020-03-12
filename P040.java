//Dizideki tek sayilari ekrana yazdiran program

class Array6{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int i;
	int size=10;
	
	for(i=0;i<size;i++)
		if(a[i]%2!=0)
			System.out.println(a[i]);
	}
}
