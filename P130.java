//Klavyeden girilen nye gore belirtilen serinin toplamini ekrana yazdiran program
class Calisma18{
	public static void main(String args[])throws Exception{
	int n;
	System.out.println("sayi gir");
	n=Keyboard.readInt();
	double sum=0;
	System.out.print(sum+" ");
	double i;
	for(i=1;i<=n;i++){
		sum+=i/((i+1)*(i+1));
		System.out.print(sum+" ");
	}
	}
}