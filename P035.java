//5 elemanli dizinin tum elemanlarina 7 atayan ve diziyi ekrana yazdiran program

class Array1{
	public static void main(String args[]) throws Exception{
		int a[] = new int[5];
		int i;
			
		for(i=0;i<5;i=i+1)
			a[i]=7;
		
		for(i=0;i<5;i++)
			System.out.println(a[i]);	
	}
}
