//matrise deger atayan ve matrisi yazdiran program

class Matris1{
	public static void main(String args[]){
		int m[][] = new int[4][3];
		int i, k, row ,col;
		row=4;
		col=3;
	
		for(i=0;i<row;i++)
			for(k=0;k<col;k++)
				m[i][k]=7;
		
		for(i=0;i<row;i++){
			for(k=0;k<col;k++)
				System.out.print(m[i][k]+" ");
			System.out.println();
		}
	}
}
			
