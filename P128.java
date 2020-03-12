//girilen paradaki banknotlari bulan program
class Calisma16{
	public static void main(String args[])throws Exception{
		int a[]={200,100,50,20,10,5};
		int i,n,money;
		System.out.println("para gir");
		money=Keyboard.readInt();
		
		i=0;
		while(money!=0){
		n=money/a[i];
		if(n>0){
			System.out.println(n+"*"+a[i]);
			money=money%a[i];
		}
		i++;
		}
	}
}