//Dizinin son n adet elemanini sondan basa dogru yazdiran program

class Dizi3{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int n,i;
	int size=10;
	System.out.println("1 ile 10 arasinda sayi gir");
	n=Keyboard.readInt();
	System.out.println("Dizinin sondan basa son "+n +" elemani: ");
	
	for(i=size-1;i>=size-n;i--)
		System.out.print(a[i]+" ");
	}
}
