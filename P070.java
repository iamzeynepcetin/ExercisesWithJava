//dizinin her elemanini bes defa yazdiran program

class Array32{
	public static void main(String args[]){
		int a[] = {4,8,3,1,18,9,21,20,5,17};
		int size=10;
		int i,k;
		
		for(i=0;i<size;i++){
			for(k=0;k<5;k++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
	}
}
