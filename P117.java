//bdeki her elemanin a da olup olmadigini ekrana yazdiran program

class Calisma5{
	public static void main(String args[]) throws Exception{
	
	int a[]={5,5,3,7,8,5,7,7,7,3,8,9,8,9,8,8,15,5,8,4};
	int b[]={7,25,30,8,23};
	int i,sizea,sizeb,k,flag;
	sizea=20;
	sizeb=5;
	flag=0;
	
	for(i=0;i<sizeb;i++){
		flag=0;
		for(k=0;k<sizea;k++)
			if(b[i]==a[k])
				flag=1;
		if(flag==1)
			System.out.println(b[i]+" a dizisinde var");
	}
	}
}