//her satirin en buyuk elemanini ekrana ayri ayri yazdiran program
class Matris12{
	public static void main(String args[])throws Exception{
		int m[][]={{5,7,3},
			   {15,6,10},
			   {22,9,1},
			   {11,14,18}};
		int i,row,col,k,max;
		row=4;
		col=3;
		for(i=0;i<row;i++){
			max=m[i][0];
			for(k=1;k<col;k++)//kyi 0 degil 1 ata kendisiyle karsilastirmasin
				if(m[i][k]>max)
					max=m[i][k];
			
			System.out.println(i+". satirin en buyuk elemani: "+max);
		}
	}
}

				