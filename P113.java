//klavyeden girilen sayidan dizide var olup olmadigini yazan program
class Calisma1{
	public static void main(String args[]) throws Exception{
	
	int a[]={5,5,3,7,8,5,7,7,7,3,8,9,8,9,8,8,15,5,8,4};
	int i,size,x,flag;
	size=20;
	flag=0;
	
	System.out.println("bir sayi gir");
	x=Keyboard.readInt();
	
	for(i=0;i<size;i++)
		if(x==a[i])
			flag=1;

	if (flag==0)
		System.out.println( x +" dizide yok");
	else
		System.out.println( x +" dizide var");
	}
}