*/ 4x3 luk matriste her satira satirin sayisini yazan program

   1 1 1
   2 2 2
   3 3 3
   4 4 4

*/

class Matris5{
	public static void main(String args[]){
		int m[][]=new int[4][3];
		int i,k,row,col,count;
		row=4;
		col=3;
		count=0;
		for(i=0;i<row;i++){
			count++;
			for(k=0;k<col;k++)
				m[i][k]=count;
			
		}
	
		for(i=0;i<row;i++){
			for(k=0;k<col;k++)
				System.out.print(m[i][k]+" ");
			System.out.println();
		}
	}
}

		
		