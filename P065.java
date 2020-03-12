//dizinin en buyuk elemanini ve indis numarasini bulan program

class Array27{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int size,i,max,indisno;
		size=10;
		max=a[0];
		indisno=0;
		for(i=0;i<size;i++)
			if(a[i]>max){
				max=a[i];
				indisno=i;
			}
		System.out.println("en buyuk eleman "+max+" indis nosu: "+indisno);
	}
}
		
		
