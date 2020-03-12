//a yi ilk haline gelene kadar karistir kac defa karistirdin say
class Calisma25{
	public static void main(String args[]) throws Exception{
		int a[]={4,8,3,1,18,9,21,20,5,17};
		int b[]={4,8,3,1,18,9,21,20,5,17};
		int i,temp,count,j;
		count=0;
		i=0;
		int x,y;
		java.util.Random generator = new java.util.Random();
			while(count!=10){
				count=0;
				x=generator.nextInt(10);
				y=generator.nextInt(10);
				temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				i++;
				for(j=0;j<10;j++)
					if(a[j]==b[j])
						count++;
			}
		System.out.println(i);
			
		
	}

}
