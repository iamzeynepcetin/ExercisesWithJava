//klavyeden girilen sayidan dizide kac tane oldugunu ekrana yazdiran program
class Calisma{
	public static void main(String args[]) throws Exception{
	
	int a[]={5,5,3,7,8,5,7,7,7,3,8,9,8,9,8,8,15,5,8,4};
	int i,size,x,counter;
	size=19;
	counter=0;
	
	System.out.println("bir sayi gir");
	x=Keyboard.readInt();
	
	for(i=0;i<size;i++)
		if(x==a[i])
			counter++;
		
	System.out.println("Dizideki "+x+" sayisi= "+counter);
	}
}