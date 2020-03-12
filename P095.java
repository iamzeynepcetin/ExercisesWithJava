//birim matrise donusturen program
class Matris15{
	public static void main(String args[]){
		int m[][] = new int[5][5];
		int i,k;
		
		for(i=0;i<5;i++)
			for(k=0;k<5;k++)
				if(i==k)
					m[i][k]=1;
		for(i=0;i<5;i++){
			for(k=0;k<5;k++)
				System.out.print(m[i][k] + " ");
			System.out.println();
		}
	}
}