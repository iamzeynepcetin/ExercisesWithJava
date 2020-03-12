//n klavyeden girilen 1 ile 10 arasinda sayidir. dizinin ilk n adet elemanini ekrana yazdiran program

class Dizi1{
	public static void main(String args[]) throws Exception{
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int n,i;
	System.out.println("1 ile 10 arasinda sayi gir");
	n=Keyboard.readInt();
	System.out.println("Dizinin ilk "+n +" elemani: ");
	
  for(i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
}
