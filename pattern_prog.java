
public class pattern_prog {

	public static void main(String[] args) {
		int n=9;
		for(int i=0; i<n; i++)
		{
//			printing I
			for(int j=0; j<n; j++)
			{  
				if (j==(n-1)/2 && i!=1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
//			printing N
			for(int j=0; j<n; j++)
			{  
				if (j==(n-1)|| j==0|| i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
//			printing E
			for(int j=0; j<n; j++)
			{  
				if (i==0 && j<8|| j==0|| i==(n-1)/2 && j<(n-1)/2||i==n-1 && j<8 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
//			printing U
			for(int j=0; j<n; j++)
			{  
				if (j==0  && i<n-1||j==n-1  &&i<n-1||i==n-1 && j>0 &&j<n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
//			printing R
			for(int j=0; j<n; j++)
			{  
				if (j==0 && i!=0 || i==0  && j<(n)/2 &&j!=0|| j==(n)/2 && i>0 && i<(n-1)/2 ||i==(n-1)/2&& j<(n)/2|| i-j==(n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			//			printing O
			for(int j=0; j<n; j++)
			{  
				if (j==0 && i>0 && i<n-1||j==n-1  &&i<n-1  && i>0||i==n-1 && j>0 &&j<n-1|| i==0 &&j>0 && j<n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
//			printing N
			for(int j=0; j<n; j++)
			{  
				if (j==(n-1)|| j==0|| i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			
			
			
			System.out.println();
		}
		
		
	}
	

}
