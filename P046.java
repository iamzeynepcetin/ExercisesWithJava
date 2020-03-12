//Klavyeden x ve y giriliyor x yden kucuk xten buyuk yden kucuk dizi elemanlarini ekrana yazdiran program

class Array12{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i;
		int size=10;
		int x,y;
		System.out.println("x ve y gir");
		x=Keyboard.readInt();
		y=Keyboard.readInt();
		
		for(i=0;i<size;i++)
			if(a[i]>x)
				if(a[i]<y)
			System.out.println("Xten buyuk Yden kucuk dizi elemanlari = "+a[i]);
	}
}
