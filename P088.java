//her sutunun toplamini ve ortalamasini ekrana ayri ayri yazdiran program
class Matris8{
	public static void main(String args[])throws Exception{
		int m[][]={{5,7,3},
			   {15,6,10},
			   {22,9,1},
			   {11,14,18}};
		int i,row,col,k,size,sum,avg;
		row=4;
		col=3;
		size=row*col;
		for(i=0;i<col;i++){
			sum=0;
			for(k=0;k<row;k++)
				sum+=m[k][i];
			avg=sum/col;
			System.out.println(i+ ". satirin toplami: "+sum+" "+i+". satirin ortalamasi: "+avg);
		}
	}
}