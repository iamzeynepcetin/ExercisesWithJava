//10dan kucuk 1000 adet rastgele sayinin kacinin tek kacinin cift oldugunu ekrana yazdiran program
class Calisma23{
	public static void main(String args[]) throws Exception{
		
		int i,n;
		int tekcount=0;
		int ciftcount=0;
		for(i=0;i<1000;i++){
		java.util.Random generator = new java.util.Random();
		n=generator.nextInt(10);
			tekcount=tekcount+n%2;
		}
			ciftcount=1000-tekcount;
		System.out.print("teklerin sayisi: "+tekcount+" ciftlerin sayisi: "+ciftcount);
	}
}
		