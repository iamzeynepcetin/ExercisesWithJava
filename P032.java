/* 10dan 90a kadar 4er 4er artarak giden fahrenheit cinsinden isi degerlerinin 
celcius karsiliklarini yazdiran program*/ 

class Celcius{
	public static void main(String args[]) throws Exception{
	int i;
		for(i=10;i<=90;i=i+4){
        		int celcius=(5*(i-32))/9;
			System.out.println("Fahrenheit= "+i+" Celcius= "+celcius);
		}
	}
}
