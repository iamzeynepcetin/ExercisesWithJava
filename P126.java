//Dizinin en buyuk 2. elemanini 1 dongu deyimi kullanarak bulan program

class Calisma14{
	public static void main(String args[])throws Exception{
	
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int size=10;
	int i,max1,max2;
	max1=a[0];
	max2=a[1];

	for(i=1;i<size;i++)
		if(a[i]>max1){
			max2=max1;
			max1=a[i];
		}
		else if(a[i]>max2)
			max2=a[i];
	System.out.println("max 2. sayi: "+max2);
	}
}

			
		
		
		


		
		
					

		