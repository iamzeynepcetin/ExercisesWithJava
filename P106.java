//klavyeden girilen sayiyi basamaklarina ayiran program 7235 ise 5 3 2 7 yazsin
class While8{
	public static void main (String args[])throws Exception{
	
	int n ,digit;
	System.out.println("bir sayi gir");
	n=Keyboard.readInt();
	
		while(n!=0){
			digit=n%10;
			System.out.println(digit);
			n=n/10;
		}
	}
}