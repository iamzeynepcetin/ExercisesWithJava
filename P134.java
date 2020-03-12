//10dan kucuk 1000 adet rastgele sayi ureten ve bunlari ekrana yan yana yazan program
class Calisma22{
	public static void main(String args[]) throws Exception{
		int n[]=new int[1000];
		int i;
		for(i=0;i<1000;i++){
		java.util.Random generator = new java.util.Random();
		n[i]=generator.nextInt(10);
		}
		for(i=0;i<1000;i++)
			System.out.print(n[i]+" ");
	}
}