//Dizinin son cift elemanini bulan program
class While5{
	public static void main(String args[])throws Exception{
		int i=9;
		int a[]={4,8,3,1,18,9,21,20,5,17};
		while (a[i]%2!=0) 
			i--;
		System.out.println("son cift = "+a[i]);
	}
}