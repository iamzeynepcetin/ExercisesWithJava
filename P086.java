//matrisin elemanlarinin toplamini ve ortalamasini ekrana yazdiran program
class Matris6{
	public static void main(String args[])throws Exception{
		int m[][]={{5,7,3},
			   {15,6,10},
			   {22,9,1},
			   {11,14,18}};
		int i,row,col,k,size,sum,avg;
		row=4;
		col=3;
		size=row*col;
		sum=0;
		avg=0;
		for(i=0;i<row;i++)
			for(k=0;k<col;k++)
				sum+=m[i][k];
		avg=sum/size;	
		System.out.println("toplam: "+ sum + " ortalama: "+avg);
	}
}