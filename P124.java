//dizideki elemanlarin kac adet oldugunu tek tek ekrana yazdiran program
class Calisma12{
	public static void main(String args[]){
	
	int a[]={5,5,3,7,8,5,7,7,7,3,8,9,8,9,8,8,15,5,8,4};
	int size=20;
	int i,k,count;
	int flag=0;
	count=0;
	
	for(i=0;i<size;i++){
		flag=0;
		for(k=0;k<i;k++)
			if(a[i]==a[k])
				flag=1;
		if(flag==0){
			count=1;
			for(k=i+1;k<size;k++)
				if(a[i]==a[k])
					count++;
			System.out.println(a[i]+" : "+count);
		}
	}
	}
}