//kucukten buyuge sirali a ve b dizisini c dizisinde sirali birlestiren program
class Calisma15{
	public static void main(String args[])throws Exception{
	
	int a[]={-1,4,6,7,12,15,16,26,27,34};
	int b[]={3,5,9,20,23,30,37,39,41,45};
	int c[] = new int[20];
	
	int i,sizeab,sizec,pa,pb,pc;
	sizeab=10;
	sizec=20;
	pa=0;
	pb=0;
	pc=0;
	
	while(pc!=sizec)
		if(a[pa]<b[pb]){
			c[pc]=a[pa];
			pa++;
			pc++;
			if(pa==sizeab)
				for(i=pb;i<sizeab;i++){
					c[pc]=b[i];
					pc++;
				}
		}else{
			c[pc]=b[pb];
			pb++;
			pc++;
			if(pb==sizeab)
				for(i=pa;i<sizeab;i++){
					c[pc]=a[i];
					pc++;
				}
		}
		for(i=0;i<sizec;i++)
			System.out.print(c[i]+" ");
	}
}
			
			
					