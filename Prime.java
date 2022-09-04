package week1day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=24;
		int count=0;
		for (int i=2;i<n;i+=1)
		{
			if(n%i==0) {
				count=count+1;
			}
		}
		if(count!=0)
			System.out.println("Not a prime number");
		else
			System.out.println("Prime number");
	}

}
