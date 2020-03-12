//klavyeden girilen sayinin tersinden yeni sayi elde etmek
class While10{
	public static void main (String args[])throws Exception{
		
		int n,digit,newn;
		newn=0;
		System.out.println("sayi gir");
		n=Keyboard.readInt();
	
		while(n!=0){
			digit=n%10;
			newn =newn*10+digit;
			n=n/10;
		}
		
		System.out.println(newn);
	}
}