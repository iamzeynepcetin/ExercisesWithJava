//katlar programinin sayi tekrari olmayan hali

class Katlar2{
	public static void main(String args[]) throws Exception{
		int i;
		for(i=1;i<=100;i++)
		  if(i%3==0)
			  System.out.println(i);
		  else if(i%4==0)
			  System.out.println(i);
		  else if(i%5==0)
			  System.out.println(i);
	}
}
	
