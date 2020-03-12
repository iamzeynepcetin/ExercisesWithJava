//a dizisi icerisinde tekleri basa ciftleri sona atayan program
//ikinci bir dizi yok

class Array24{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i,size,p,temp;
		p=0;
		size=10;
		for(i=0;i<size;i++)
			if(a[i]%2!=0){
			temp=a[i];
			a[i]=a[p];
			a[p]=temp;
			p++;
			}
			
	for(i=0;i<size;i++)
		System.out.println(a[i]);
	}
}
