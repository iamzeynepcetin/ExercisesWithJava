//diziyi her sayidan 1 tane kalacak sekilde duzenleyen bu sayilari dizinin basinda biriktiren
// ve geri kalan elemanlari sifirlayan program
class Calisma10{
	public static void main(String args[]){
	
	int a[]={1,1,1,3,5,5,8,9,17,17,17,17,20,24,24};
	int size=15;
	int i,p;
	
	p=1;
	
	for(i=1;i<size;i++)
		if(a[i]!=a[i-1]){
			a[p]=a[i];
			p++;
		}
	
	for(i=p;i<size;i++)
		a[i]=0;
	
	for(i=0;i<size;i++)
		System.out.print(a[i]+" ");
	}
}
		
			
			
		
		
		
		
