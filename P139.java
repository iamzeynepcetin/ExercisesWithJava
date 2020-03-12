//10dan kucuk 6 farkli rastgele sayi ureten program
class Calisma27	{
	public static void main(String args[]) throws Exception{
		int i,count,flag,x;
		int n[]=new int[6];
		java.util.Random generator = new java.util.Random();
		count=0;
		while(count!=6){
			flag=0;//!!!!!!!!!!!!!!!
			x=generator.nextInt(10);
			for(i=0;i<count;i++)
				if(n[i]==x)
					flag=1;
			if(flag!=1){
				n[count]=x;
				count++;
			}
		}
		for(i=0;i<count;i++)
			System.out.print(n[i]+" ");
	}	
}	
			
			
