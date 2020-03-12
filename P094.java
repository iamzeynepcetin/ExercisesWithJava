//a matrisinin transpozunu b matrisine atayan program
class Matris14{
	public static void main(String args[])throws Exception{
		int ma[][]={{5,7,3},
			   {15,6,10},
			   {22,9,1},
			   {11,14,18}};
		int mb[][]=new int[3][4];
		int i,k,row,col;
		row=4;
		col=3;
		
		for(i=0;i<row;i++)
			for(k=0;k<col;k++)
				mb[k][i]=ma[i][k];
		
		for(i=0;i<col;i++){
			for(k=0;k<row;k++)
				System.out.print(mb[i][k]+" ");
			System.out.println();
		}
	}	
}
