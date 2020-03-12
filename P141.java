//Tombala simulasyonu 1den 90a kadar 3 farkli sayi cekiliyor toplamlari<=101 ise kazaniyor. 
//Oyuncunun kazanma olasiligini hesaplayan kod
class Calisma29	{
	public static void main(String args[]) throws Exception{
		int a[]={0,0,0};
		int i,k,size,count,n,flag,total;
		size=3;
		double win=0;
		total=1000000;
		double kazanmaolasiligi=0.0;
		java.util.Random generator = new java.util.Random();
		for(k=1;k<1000000;k++){
			count=0;
			while(count!=size){
				n=generator.nextInt(90)+1;
				flag=0;
				
				for(i=0;i<count;i++)
					if(n==a[i])
						flag=1;
				if(flag==0){
					a[count]=n;
					count++;
				}
			}
		if(a[0]+a[1]+a[2]<=101)
			win++;
		}
		kazanmaolasiligi=win/total;
		System.out.println("kazanma olasiligi: "+kazanmaolasiligi);
	}
}