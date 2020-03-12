//matrise ardisik sayi atama
class Matris2{
	public static void main(String args[]){
		int m[][]=new int[4][3];
		int i,k,row,col,temp;
		row=4;
		col=3;
		temp=1;
		for(i=0;i<row;i++)
			for(k=0;k<col;k++){
				m[i][k]=temp;
				temp++;
			}
		for(i=0;i<row;i++){
			for(k=0;k<col;k++)
				System.out.print(m[i][k]+" ");
			System.out.println();
		}
	}
}
