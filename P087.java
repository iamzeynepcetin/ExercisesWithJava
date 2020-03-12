//her satirin toplamini ve ortalamasini ekrana ayri ayri yazdiran program
class Matris7{
	public static void main(String args[])throws Exception{
		int m[][]={{5,7,3},
			   {15,6,10},
			   {22,9,1},
			   {11,14,18}};
		int i,row,col,k,size,sum,avg;
		row=4;
		col=3;
		size=row*col;
		for(i=0;i<row;i++){
			sum=0;
			for(k=0;k<col;k++)
				sum+=m[i][k];
			avg=sum/col;
			System.out.println(i+ ". satirin toplami: "+sum+" "+i+". satirin ortalamasi: "+avg);
		}
	}
}
		

		
