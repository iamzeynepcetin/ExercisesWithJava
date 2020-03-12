//Klavyeden girilen nye gore belirtilen serinin toplamini ekrana yazdiran program
class Calisma19{
	public static void main(String args[])throws Exception{
		int n;
		System.out.println("sayi gir");
		n=Keyboard.readInt();
	
		
		double faktoriyel=1;
		double deger=1;
		int i;
		for(i=1;i<=n;i++){
			System.out.print(deger+" ");
			faktoriyel*=i;
			deger+=1/faktoriyel;
			
		}
	}
}
		