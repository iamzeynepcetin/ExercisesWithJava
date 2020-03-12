//Iki dizinin birlesimini ekrana yazdiran program

class Calisma8{
	public static void main(String args[]) throws Exception{
	
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int b[]={8,13,6,12,4,5,19,1,14,25};
	int i,size,k,flag;
	size=10;
	flag=0;
	System.out.println("Birlesimi : ");
	
	for(i=0;i<size;i++)
		System.out.print(a[i]+" ");

	for(i=0;i<size;i++){
		flag=0;
		for(k=0;k<size;k++)
			if(b[i]==a[k])
				flag=1;
		if(flag==0)
			System.out.print(b[i]+" ");
			
		
	}
	}
}