//Dizinin ortalamasina en yakin dizi elemanini bulan program

class Calisma13{
	public static void main(String args[])throws Exception{
	
	int a[]={4,8,3,1,18,9,21,20,5,17};
	int size=10;
	int sum,i,avg,minDif,n,tempDif;
	sum=0;
	avg=0;
	n=a[0];
	
	for(i=0;i<size;i++)
		sum+=a[i];
	avg=sum/size;
	minDif=avg-n;
	System.out.println("ortalama: "+avg);
	for(i=0;i<size;i++){
		tempDif=avg-a[i];
		if(tempDif<0)
			tempDif=-1*tempDif;
		if(tempDif<minDif){
			n=a[i];
			minDif=tempDif; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		}	
	}
	System.out.println("ortalamaya en yakin: "+n);
	}
}