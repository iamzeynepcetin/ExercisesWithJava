//Diziyi karistiran program 2 random sayi uretip bu indis numarali elemanlari 1000 defa yer degistiren program
class Calisma24{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i,temp;
		for(i=0;i<10;i++)
			System.out.print(a[i]+" ");
		
		int x,y;
		java.util.Random generator = new java.util.Random();
			for(i=0;i<1000;i++){
				x=generator.nextInt(10);
				y=generator.nextInt(10);
				temp=a[x];
				a[x]=a[y];
				a[y]=temp;
			}
		System.out.println();
		for(i=0;i<10;i++)
			System.out.print(a[i]+" ");
	}
}
