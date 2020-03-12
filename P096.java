/*
  0 0 0 0 1
  0 0 0 1 0
  0 0 1 0 0
  0 1 0 0 0
  1 0 0 0 0
*/
class Matris16{
	public static void main(String args[])throws Exception{
		int m[][]=new int[5][5];
		int i,k;
		int row=5;
		int col=5;
		
		for(i=0;i<5;i++)
			m[i][col-i-1]=1;
		
		for(i=0;i<5;i++){
			for(k=0;k<5;k++)
				System.out.print(m[i][k]+ " ");
			System.out.println();
		}
	}
}