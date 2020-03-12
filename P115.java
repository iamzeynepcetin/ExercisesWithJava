//dizideki her elemanin kendinden once olup olmadigini ekrana yazdiran program

class Calisma3{
	public static void main(String args[]) throws Exception{
	
	int a[]={5,5,3,7,8,5,7,7,7,3,8,9,8,9,8,8,15,5,8,4};
	int i,size,k,flag;
	size=20;
	flag=0;
	
	for(i=0;i<size;i++){
		flag=0;
		for(k=0;k<i;k++)
			if(a[i]==a[k])
				flag=1;
		if(flag==1)
				System.out.println(a[k]+"kendinden once var");		
			else
				System.out.println(a[k]+"kendinden once yok");
	}
	}
}