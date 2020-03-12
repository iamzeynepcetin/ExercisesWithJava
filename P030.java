//1 ile 100 arasindaki 3un 4un ve 5in katlarini ekrana ic ice yazdiran program

class Katlar{
	public static void main(String args[]) throws Exception{
	int i;
		for(i=1;i<=100;i++){
			if(i%3==0)
				System.out.println(i);
			if(i%4==0)
				System.out.println(i);
			if(i%5==0)
				System.out.println(i);
		}
	}
}
			
		
