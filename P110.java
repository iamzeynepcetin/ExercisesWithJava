//klavyeden girilen sayiyi kucukten buyuge dizinin uygun indisine yerlestiren program
class While12{
	public static void main(String args[]) throws Exception{
	
		int a[]={1,5,12,15,19,28,35,46,60,0};
		int x,i;
		System.out.println("sayi gir");
		x=Keyboard.readInt();
		int size=10;
		i=0;
		int k=0;
		if(x>a[size-2])
			a[size-1]=x;
		else{
			while(a[i]<x)
				i++;
			
			
			for(k=size-2;k>=i;k--)
				a[k+1]=a[k];
			
			a[i]=x;
		}
		for(k=0;k<size;k++)
			System.out.print(a[k]+" ");
	}
}
		
