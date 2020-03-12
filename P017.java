//klavyeden girilen 3 sayinin ortancasini bulan program

class Ortanca{
	public static void main(String args[]) throws Exception{
		System.out.println("3 sayi giriniz");
		int a,b,c;
		a=Keyboard.readInt();
		b=Keyboard.readInt();
		c=Keyboard.readInt();
	
		if(a>b)
			if(b>c)
				System.out.println("ortanca"+b);
			else
				if(a>c)
					System.out.println("ortanca"+c);
				else
					System.out.println("ortanca"+a);
		else
			if(a>c)					
				System.out.println("ortanca"+a);
			else
				if(b>c)
					System.out.println("ortanca"+c);
			        else
					System.out.println("ortanca"+b);
	}
}
	
