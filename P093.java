//her satirin en buyuk elemanini ekrana ayri ayri yazdiran program
class Matris13{
	public static void main(String args[])throws Exception{
		int m[][]={{5,7,3},
			   {15,6,10},
			   {22,9,1},
			   {11,14,18}};
		int i,row,col,k,max;
		row=4;
		col=3;
		for(i=0;i<col;i++){
			max=m[0][i];
			for(k=1;k<row;k++)
				if(m[k][i]>max)
					max=m[k][i];
			
			System.out.println(k+". sutunun en buyuk elemani: "+max);
		}
	}
}

				