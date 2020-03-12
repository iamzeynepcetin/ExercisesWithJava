//Kullanicidan yukseklik genislik degerlerini alip alan hesabi yapan kod

class AreaRect{
	public static void main(String args[]) throws Exception
	{
		int height, width, area;
		System.out.print("yukseklik giriniz: ");
		height=Keyboard.readInt();
		System.out.print("genislik giriniz: ");
		width=Keyboard.readInt();
		
		area=height*width;
		System.out.println("Alan = "+area);
	}
}    

/*Keyboard.class dosyasini ayni klasore kopyalamaniz yeterli. 
Eger isterseniz Javanin kendi sinifi olan scanner sinifi ile de islem yapabilirsiniz.*/
/*Keyboard dosyasını kullanmadan klavyeden veri girişi
Java’nın 1.8 versiyonunda Scanner sınıfını kullanarak klavyeden veri girişini aşağıdaki gibi yapabilirsiniz:*/

class AreaRect {
	public static void main(String args[]) throws Exception
	{
		java.util.Scanner kyb = new java.util.Scanner(System.in);
		int height, width, area;

		System.out.print(“Yuksekligi giriniz : “);
		height = kyb.nextInt();
		System.out.print(“Genisligi giriniz : “);
		width = kyb.nextInt();
		
		area = height * width;
		System.out.println(“Dikdortgenin alani : ” + area);
	}
}

/*Buna göre klavyeden veri girişi yapacağınız her programda 
		java.util.Scanner kyb = new Java.util.Scanner(System.in);

tanımlaması olmalı ve Keyboard yerine kyb’yi, readInt yerine de nextInt’ti kullanmalısınız.*/

   


