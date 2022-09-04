package week1day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fnum=0,snum=1,sum=fnum+snum;
		System.out.print(fnum);
		System.out.print(snum);
		System.out.print(snum);
	 for(int i=1;i<=8;i+=1)
	 {
		 fnum=snum;
		 snum=sum;
		sum=fnum+snum;
	System.out.print(sum); 
	 }
	}

}
