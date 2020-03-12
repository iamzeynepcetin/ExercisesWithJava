//dizinin her elemanini kendisi kadar yazdiran program

class Array33{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int size=10;
		int i,k;
		
		for(i=0;i<10;i++){
			for(k=0;k<a[i];k++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
	}
}
