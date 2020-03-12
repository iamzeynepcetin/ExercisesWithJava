//klavyeden surekli sayi giriliyor 0 girildiginde programdan cikiliyor
class While2{
	public static void main(String args[])throws Exception{
		int i=1;
		
		
		while (i!=0) {
			System.out.println("sayi giriniz");
			i=Keyboard.readInt();
		}
	}
}