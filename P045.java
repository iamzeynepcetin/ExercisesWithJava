//klavyeden girilen sayidan kucuk tek ve cift dizi elemanlarinin toplamlarini ve adetlerini ekrana ayri yazdiran program

class Array11{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int size=10;
		int x,i;
		int tekcount=0;
		int tektoplam=0;
		int ciftcount=0;
		int cifttoplam=0;
		
		System.out.println("sayi gir");
		x=Keyboard.readInt();
		
		for(i=0;i<10;i++)
			if(a[i]<x)
				if(a[i]%2==0){
					cifttoplam+=a[i];
					ciftcount++;
				}
				else{
					tektoplam+=a[i];
					tekcount++;
				}
		System.out.println("ciftlerin toplami= "+cifttoplam+" sayidan kucuk cift sayi sayisi= "+ciftcount);
		System.out.println("teklerin toplami= "+tektoplam+" sayidan kucuk tek sayi sayisi= "+tekcount);
	}
}
