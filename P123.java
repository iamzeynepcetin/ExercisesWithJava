//Dizide ayni eleman varsa o elemani 0 yapan ve kalan elemanlari dizinin basina toplayan program
class Calisma11{
	public static void main(String args[]){
	
	int a[]= {17,1,1,5,8,3,1,17,24,5,9,24,20,17,17};
	int i,size,p,k,flag;
	size=15;
	p=1;
	flag=0;
	
	for(i=1;i<size;i++){
		flag=0;
		for(k=0;k<i;k++)
			if(a[i]==a[k])
				flag=1;
			if(flag==0){
				a[p]=a[i];
				p++;
			}
	}
	for(i=p;i<size;i++)
		a[i]=0;
	
	for(i=0;i<size;i++)
		System.out.print(a[i]+" ");
	}
}

		
	