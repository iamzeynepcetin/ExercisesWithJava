//a dizisindeki tek sayilari b dizisinin basina cift sayilari b dizisinin sonuna atayan program
//sira onemli degil                                 

class Array23{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int i,size,po,pe;
		size=10;
		int b[]=new int[10];
		po=0;
		pe=size-1;
		for(i=0;i<size;i++)
			if(a[i]%2!=0){
				b[po]=a[i];
				po++;
			}
			else{
			b[pe]=a[i];
				pe--;
			}	
		for(i=0;i<size;i++)
			System.out.println(b[i]);
		
	}
}
