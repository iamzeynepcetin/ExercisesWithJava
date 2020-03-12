/*
0 0 0 0 1
0 0 0 2 3
0 0 4 5 6
0 7 8 9 10
11 12 13 14 15

*/
class Matris19{
	public static void main(String args[])throws Exception{
		int m[][]=new int[5][5];
		int i,k;
		int row=5;
		int col=5;
		int count=1;
		for(i=0;i<row;i++)
			for(k=row-i-1;k<row;k++){
				m[i][k]=count;
				count++;
			}
				
		for(i=0;i<row;i++){
			for(k=0;k<col;k++)
				System.out.print(m[i][k]+ " ");
			System.out.println();
		}
	}
}