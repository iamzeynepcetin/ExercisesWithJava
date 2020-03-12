//Dizinin ortalamasindan kucuk dizi elemanlarini ekrana yazdiran program

class Array15{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i;
		int size=10;
		int avg=0;
		int toplam=0;
		
    for(i=0;i<10;i++)
			toplam+=a[i];
		avg=toplam/size;
		System.out.println("ortalama= "+avg);
		
    for(i=0;i<size;i++)
			if(a[i]<avg)
				System.out.print(a[i]+" ");
	}
}
