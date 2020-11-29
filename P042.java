//Dizideki tek sayilari tek sayilarin adedini, toplamini ve ortalamasini ekrana yazdiran program

class Array8{
	public static void main(String args[]){
		int a[] = {4,8,3,1,18,9,21,20,5,17};
		int i,size;
		size=10;
		int toplam=0;
		int ortalama=0;
		int counter=0;
		
		for(i=0;i<size;i++)
			if(a[i]%2!=0){
				System.out.println(a[i]);
				toplam+=a[i];	
				counter++;
		}	
		System.out.println("tek sayilarin sayisi= "+counter+" toplami= "+toplam+" ortalamasi= "+(toplam/counter));
	}
}
