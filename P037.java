//Dizinin elemanlarinin toplamini ekrana yazan program
\
class Array3{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i;
		int toplam=0;
		
		for(i=0;i<10;i++)
			toplam+=a[i];

		System.out.println("Toplam= "+toplam);
	}
}
