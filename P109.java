//klavyeden girilen sayinin basamaklarindan elde edilebilecek en buyuk sayiyi bulan program
class While11{
	public static void main (String args[])throws Exception{
		
		int n,digit,newn;
		newn=0;
		System.out.println("sayi gir");
		n=Keyboard.readInt();
		int a[]=new int[10];
		int size=0;
		int i,k,temp;
		i=0;
		while(n!=0){
			digit=n%10;
			a[size]=digit;
			size++;
			n=n/10;
		}
		
		
		for(k=0;k<size-1;k++)
			for(i=0;i<size-1-k;i++)
				if(a[i]>a[i+1]){
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
		int carpan=1;
		for(i=0;i<size;i++){
			newn+=a[i]*carpan;
			carpan=carpan*10;
		}

		
		
		System.out.println(newn);
	}
}