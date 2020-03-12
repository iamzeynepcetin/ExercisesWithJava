//Klavyeden girilen sayiya gore verilen denklemin sonucunu ekrana yazdiran program

 class Denklem{
	public static void main(String args[]) throws Exception
	{
		int x,y,z;
		System.out.println("sayi giriniz");
		x=Keyboard.readInt();
		 
     if(x<0){
			  y=x*x+2*x;
			  z=3*x;
		  }
		  else{
			  y=x;
			  z=x*x+10;
		}
		System.out.println("y= "+y+"\nz= "+z);
		
	}
}
