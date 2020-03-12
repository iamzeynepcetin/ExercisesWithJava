//matrise sutun olarak ardisik deger atayan program

class Matris3{
	public static void main(String args[]){
		int m[][]=new int[4][3];
		int i,k,row,col,count;
		row=4;
		col=3;
		count=0;
		
		for(i=0;i<col;i++)
			for(k=0;k<row;k++){
				count++;
				m[k][i]=count;
			}
		
		for(i=0;i<row;i++){
			for(k=0;k<col;k++)
				System.out.print(m[i][k]+" ");
			System.out.println();
		}
	}
}
			
