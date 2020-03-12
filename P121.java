//Uc dizinin kesisimini ekrana yazdiran program

class Calisma9{
	public static void main(String args[]) throws Exception{
	
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int b[]={8,13,6,12,4,5,19,1,14,25};
	int c[]={50,13,8,22,5,16,24,4,3,9};
	
	int i,size,k,j,flag;
	size=10;
	flag=0;
	System.out.println("Kesisimi : ");

	for(i=0;i<size;i++){
		flag=0;
		for(k=0;k<size;k++)
			for(j=0;j<size;j++){
				if(a[i]==b[k])
					if(b[k]==c[j])
						flag=1;
			}
	if(flag==1)
	System.out.println(a[i]);
	}
	}
}


