//klavyeden girilen indis nolu elemanindan kendinden once olup olmadigini yazdiran program

class Calisma2{
	public static void main(String args[]) throws Exception{
	
	int a[]={5,5,3,7,8,5,7,7,7,3,8,9,8,9,8,8,15,5,8,4};
	int i,size,x,flag;
	size=20;
	flag=0;
	
	System.out.println("indis nosunu gir");
	x=Keyboard.readInt();
	
	for(i=0;i<x;i++)
		if(a[x]==a[i])
			flag=1;

	if (flag==0)
		System.out.println( a[x]+" dizide yok");
	else
		System.out.println( a[x]+" dizide var");
	}
}