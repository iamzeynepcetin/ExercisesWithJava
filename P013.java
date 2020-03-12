//y=kx+t klavyeden girilen x e gore y yi ekrana yazdiran program

class Denklem2{
	public static void main(String args[]) throws Exception{
		int x,y,k,t;	
		System.out.println("sayi gir");
		x=Keyboard.readInt();
		if(x<0){
			k=2;
			t=0;
		}
		else
			if(x<=5){	
				k=-1;
				t=10;
			}
			else{
				k=3;			
				t=-20;	

			}
		y=k*x+t;
		System.out.println("y = "+y);
	}
}
