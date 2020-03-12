/*n in klavyeden tek girildigini kabul ediyorum. + yapan program
  +
  +
+++++
  +
  +
*/
class Array41{
	public static void main(String args[]) throws Exception{
		int n,i,k;
		System.out.println("ni giriniz");
		n=Keyboard.readInt();
		
		for(i=1;i<=n;i++){
			if(i==(n+1)/2){
				for(k=1;k<=n;k++)
					System.out.print("+");
			}
			else{
				for(k=1;k<=(n-1)/2;k++)
					System.out.print(" ");
					
				System.out.print("+");
			}
				System.out.println();
		}
	}
}
