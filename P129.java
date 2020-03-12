//Fibonacci 0 1 1 2 3 5 8 13 21...
//Klavyeden girilen nye gore fibonacci sayi serisini ekrana yazdiran program
class Calisma17{
	public static void main(String args[])throws Exception{
	int n;
	System.out.println("sayi gir");
	n=Keyboard.readInt();
	int i;
	int a[]=new int[n+1];
	a[0]=0;
	a[1]=1;

	for(i=2;i<n;i++)
		a[i]=a[i-1]+a[i-2];
	for(i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
}



/*klavyeden girilen n kadar fibonacci sayı serisini ekrana yazdıran program
class Calisma18{
	public static void main(String args[]) throws Exception
	{
		int temp = 0;
		System.out.print("n : ");
		int n = Keyboard.readInt();
		int temp1 = 0;
		int temp2 = 1;
		while(n != 0){
			System.out.print(temp1 + " ");
			temp = temp2;
			temp2 = temp1;
			temp1 = temp + temp2;
			n--;			
		}
	}
}

*/
		