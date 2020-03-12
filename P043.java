//Klavyeden girilen sayidan kucuk dizi elemanlarini ekrana yazdiran program

class Array9{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int i;
	int size=10;
	int x;	
	System.out.println("sayi giriniz");
	x=Keyboard.readInt();
	
	for(i=0;i<size;i++)
		if(a[i]<x)
			System.out.println("girilen sayidan kucuk dizi elemanlari= "+a[i]);
	}
}
