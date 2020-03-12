//yazi tura simulasyonu
class Calisma26{
	public static void main(String args[]) throws Exception{
		int i,n,yazicount,turacount;
		java.util.Random generator = new java.util.Random();
		yazicount=0;
		turacount=0;
		for(i=0;i<1000000;i++){
			n=generator.nextInt(2);
			yazicount=yazicount+n;
		}
		turacount=1000000-yazicount;
		System.out.print("yazisayisi: "+yazicount+" tura sayisi: "+turacount);	
	}

}
