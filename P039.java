//Dizinin elemanlarinin toplamini ve ortalamasini ekrana yazdiran program

class Array5{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i;
		int ortalama,toplam=0;
		
		for(i=0;i<10;i++)
			toplam+=a[i];
		ortalama=toplam/i;
		System.out.println("toplam= "+toplam+" ortalama= "+ortalama);
	}
}
