//matrise satir satir erisilecek ve count kullanilacak

class Matris4{
	public static void main(String args[]){
		int m[][]=new int[4][3];
		int i,k,row,col,count;
		row=4;
		col=3;

		for(i=0;i<row;i++){
			//bu nokta matrise satis satir erisiyorsak satirin
			//sutun sutun erisiyorsak sutunun giris noktasidir.
			count=1;
			for(k=0;k<col;k++){
				m[i][k]=count;
				count++;
			}
		}
		
		for(i=0;i<row;i++){
			for(k=0;k<col;k++)
				System.out.print(m[i][k]+" ");
			System.out.println();
		}
	}
}
		

			
