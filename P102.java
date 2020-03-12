//Klavyeden surekli sayi giriliyor bu sayilar toplaniyor toplam bini gecince son toplam ekrana yazdiriliyor 
//program sonlaniyor
class While3{
	public static void main(String args[])throws Exception{
		int i=0;
		int sum=0;
		
		while (sum<=1000) {
			System.out.println("sayi giriniz");
			i=Keyboard.readInt();
			sum+=i;
		}
		System.out.println("toplam= "+sum);
	}
}