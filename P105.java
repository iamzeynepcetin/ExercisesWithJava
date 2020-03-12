//dizinin en buyuk negatif elemanini yazdiran program
class While7{
	public static void main(String args[])throws Exception{
		int i=0;
		int size=10;
		int a[]={4,8,-3,-1,18,9,-21,20,5,-17};
		
		while(a[i]>=0)
			i++;

		int max=a[i];

		while (i<size){ 
			if(a[i]<0)
				if(a[i]>max)
					max=a[i];
			i++;
		}		
		System.out.println("en buyuk negatif sayi= "+max);
		
	}
}