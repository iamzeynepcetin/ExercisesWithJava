//Dizinin ilk tek elemanini bulan program
class While4{
	public static void main(String args[])throws Exception{
		int i=0;
		int a[]={4,8,3,1,18,9,21,20,5,17};
		while (a[i]%2==0) 
			i++;
		System.out.println("ilk tek= "+a[i]);
	}
}