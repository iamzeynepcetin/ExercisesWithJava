//1den 20ye kadar olan sayilarin karelerini ve kuplerini ekrana yazdiran program

class Kup{
	public static void main(String args[]) throws Exception{
    for(int i=1;i<=20;i++){
		  int kare=i*i;
		  int kup=i*i*i;
		  System.out.println(i+" karesi "+kare+" kubu "+kup);
		}
	}
}
