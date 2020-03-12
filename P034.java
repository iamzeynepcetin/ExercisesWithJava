//klavyeden girilen 5 sayiyi toplayan program

class Topla{
	public static void main(String args[]) throws Exception{
		int i,a;
		int toplam=0;
		System.out.println("5 sayi gir");
		for(i=0;i<5;i++){
			a=Keyboard.readInt();
			toplam+=a;
		}
		System.out.println("Toplam "+toplam);
	}
}
