//Dizinin son n adet elemanini yazdiran program

class Dizi2{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int n,i;
	int size=10;
	System.out.println("1 ile 10 arasinda sayi gir");
	n=Keyboard.readInt();
	System.out.println("Dizinin son "+ n +" elemani: ");
	
  for(i=size-n;i<size;i++)
		System.out.print(a[i]+" ");
	}
}
