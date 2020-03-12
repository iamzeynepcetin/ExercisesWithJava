//matrisin en buyuk ve en kucuk elemanini ekrana yazdiran program
class Matris10{
	public static void main(String args[])throws Exception{
		int m[][]={{5,7,3},
			   {15,6,10},
			   {22,9,1},
			   {11,14,18}};
		int i,row,col,k,max,min;
		row=4;
		col=3;
		min=m[0][0];
		max=m[0][0];//0 atamak dogru yaklasim degil atlama!!!!!!!!!!!!
		for(i=0;i<row;i++)
			for(k=0;k<col;k++)
				if(m[i][k]>max)
					max=m[i][k];
				else if(m[i][k]<min)
					min=m[i][k];
		System.out.println("en buyuk eleman: "+max+ " en kucuk eleman: "+min);
	}
}
				