
public class Question_4 {

	public static void main(String[] args) {
		int n=12;
		for(int i=0; i<=n; i++)
		{
			for (int j=0; j<=n; j++)
			{
				if ((j==0 && i>(n)/2||i==n||j==n && i>(n)/2)|| (i-j>=(n-1)/2||j+i>=((n-1)/2)+n))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
