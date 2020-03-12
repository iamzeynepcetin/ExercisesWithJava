//Tombala simulasyonu 1den 90a kadar 3 farkli sayi cekiliyor toplamlari<=101 ise kazaniyor. oyuncunun kazanma olsigini 
//hesaplayan kod
class Calisma28	{
	public static void main(String args[]) throws Exception{
		int i,count,flag,x,sum,kazanmasayisi,j,k;
		int n[]=new int[3];
		java.util.Random generator = new java.util.Random();
		
		kazanmasayisi=0;
		for(i=0;i<100;i++){
			sum=0;
			count=0;
			for(j=0;j<3;j++)
				n[j]=0;
			while(count!=3){
				flag=0;
				x=generator.nextInt(89)+1;
				for(k=0;k<3;k++)
					if(n[k]==x)
						flag=1;
				if(flag!=1){
					n[count]=x;
					sum+=x;
					count++;
				}
			}
				if(sum<=101)
					kazanmasayisi++;
		}

		System.out.println("kazanma olasiligi: "+kazanmasayisi);
		
	}	
}	
			
			
