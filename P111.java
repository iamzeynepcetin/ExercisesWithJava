//basamaklarinin kuplerinin toplami kendine esit olan 3 basamakli sayilari bulan program
class While13{
	public static void main (String args[]) throws Exception{
		int x,i;
		for(i=100;i<=999;i++){
			int sum=0;
			x=i;
			while(x>0){
				sum+=(x%10)*(x%10)*(x%10);
				x=x/10;
			}
			if(i==sum)
				System.out.println("aranan sayi: "+i);
			}
	}
}