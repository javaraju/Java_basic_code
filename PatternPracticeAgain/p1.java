package PatternPracticeAgain;

public class p1 {

	public static void main(String[] args) {
	int n=5;
	char z='A';
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j>=i)
			{
				System.out.print(z++);
			}
			else
			{
				System.out.print(" ");
			}
		}
		z='A';
		System.out.println();
	}

	}

}
