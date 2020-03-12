//Klavyeden girilen sayidan kucuk ve tek olan dizi elemanlarini ekrana yazdiran program

class Array10{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int i;
	int x;
	int size=10;
	
	System.out.println("sayi girin");
	x=Keyboard.readInt();
	
		for(i=0;i<10;i++)
			if(a[i]<x)
				if(a[i]%2!=0)
					System.out.println("girilen degerden kucuk ve tek sayilar = "+a[i]);
	}
}
