class NoobPrashant
{
	
			void Noob_Prashant() 
			{
			
				int n=12;
				for(int i=0;i<n;i++)
				{
					
					//N
					for(int j=0;j<n;j++)
					{
						if(j==n/4||j==n-1||i==j&&j>n/4)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//O
					for(int j=0;j<n;j++)
					{
						if(i==0&&j>n/4&&j<(3*n)/4||i==n-1&&j>n/4&&j<(3*n)/4||j==n/4&&i>0&&i<n-1||j==(3*n)/4&&i>0&&i<n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//O
					for(int j=0;j<n;j++)
					{
						if(i==0&&j>n/4&&j<(3*n)/4||i==n-1&&j>n/4&&j<(3*n)/4||j==n/4&&i>0&&i<n-1||j==(3*n)/4&&i>0&&i<n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//B
					for(int j=0;j<n;j++)
					{
						if(i==0&&j<(3*n)/4||j==0||i==n/2&&j<(3*n)/4||i==n-1&&j<(3*n)/4||j==(3*n)/4&&i>0&&i<n-1&&i!=(n)/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					//Underscore
					for(int j=0;j<n;j++)
					{
						if(i==n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					//P
					for(int j=0;j<n;j++)
					{
						if(i==0&&j>n/4&&j<(n*3)/4||i==n/2&&j>n/4&&j<(3*n)/4||j==n/4&&i>0||j==(3*n)/4&&i>0&&i<n/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					//R
					for(int j=0;j<n;j++)
					{
						if(i==0&&j>n/4&&j<(n*3)/4||i==n/2&&j>n/4&&j<(3*n)/4||j==n/4&&i>0||j==(3*n)/4&&i>0&&i<n/2||(i==j)&&i>n/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					//A
					for(int j=0;j<n;j++)
					{
						if(i==0&&j>0&&j<(3*n)/4||j==0&&i>0||i==n/2&&j<=(3*n)/4||j==(3*n)/4&&i!=0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					//S
					for(int j=0;j<n;j++)
					{
						if(j==n/4&&i>0&&i<n/2||j==(3*n)/4&&i>n/2&&i<n-1||i==0&&j>n/4&&j<(n*3)/4||i==n/2&&j>n/4&&j<(n*3)/4||i==n-1&&j>n/4&&j<(n*3)/4)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//H
					for(int j=0;j<n;j++)
					{
						if(j==0||j==(3*n)/4||i==n/2&&j<=(3*n)/4||j==0&&i>n/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//A
					for(int j=0;j<n;j++)
					{
						if(i==0&&j>0&&j<(3*n)/4||j==0&&i>0||i==n/2&&j<=(3*n)/4||j==(3*n)/4&&i!=0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//N
					for(int j=0;j<n;j++)
					{
						if(j==n/4||j==n-1||i==j&&j>n/4)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					//Space
												for(int j=0;j<3;j++)
													{
														if(j==0)
															{
																System.out.print(" ");
															}
														else
															{
																System.out.print(" ");
															}
													}
					
					//T
					for(int j=0;j<n;j++)
					{
						if(i==0&&j<n-1||j==(n-1)/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					
					
					System.out.println();
				}
				
				System.out.println();
				System.out.println();
				System.out.println();
			}
	
	
	
	
}


class Inuron1
{
	
			void Inuron()
			{
				int n=12;
				for(int i=0;i<n;i++)
				{
					
					//I
					for(int j=0;j<n;j++)
					{
						if(i==0&&j<n-1||i==n-1&&j<n-1||j==(n-1)/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//I
					for(int j=0;j<n;j++)
					{
						if(i==n/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					
					//N
					for(int j=0;j<n;j++)
					{
						if(j==n/4||j==n-1||i==j&&j>n/4)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					//U
					for(int j=0;j<n;j++)
					{
						if(i==n-1&&j>n/4&&j<(3*n)/4||j==n/4&&i<n-1||j==(3*n)/4&&i<n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//R
					for(int j=0;j<n;j++)
					{
						if(i==0&&j>n/4&&j<(n*3)/4||i==n/2&&j>n/4&&j<(3*n)/4||j==n/4&&i>0||j==(3*n)/4&&i>0&&i<n/2||(i==j)&&i>n/2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//O
					for(int j=0;j<n;j++)
					{
						if(i==0&&j>n/4&&j<(3*n)/4||i==n-1&&j>n/4&&j<(3*n)/4||j==n/4&&i>0&&i<n-1||j==(3*n)/4&&i>0&&i<n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					//N
					for(int j=0;j<n;j++)
					{
						if(j==n/4||j==n-1||i==j&&j>n/4)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					
					System.out.println();
					
				}
				
				System.out.println();
				System.out.println();
				System.out.println();
				
			}
	
}

class NumberProgram
{

	 void Number()
	{
		
		for (int i=0;i<5;i++)
		{
			
			for (int j=0;j<5;j++)
			{
				System.out.print(i);
				
			}
			
			System.out.println();
			
		}
	System.out.println();
	System.out.println();
	System.out.println();
	}
	 
	 void Hut()
		{
			int n=12;
			
			for (int i=0;i<n;i++)
			{
				
				for (int j=0;j<n;j++)
				{
					
					if(i==0||i+j<=(n-1)/2||j-i>=(n-1)/2||j==0||j==n-1||i==n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
				System.out.println();
				
			}
			
			System.out.print("    ");
		}
	 
	 
	 void Downwords()
		{
			int n=12;
			
			for (int i=0;i<n;i++)
			{
				
				for (int j=0;j<n;j++)
				{
					
					if(i-j>=(n-1)/2||i+j>=(n-1)+(n-1)/2)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
				System.out.println();
				
			}
		
			System.out.println();
			System.out.println();
			
			
		}
	 
	 void LeftSideArro()
		{
			int n=12;
			
			for (int i=0;i<n;i++)
			{
				
				for (int j=0;j<n;j++)
				{
					
					if(i+j<=(n-1)/2||i-j>=(n-1)/2||i==0||i==n-1||j==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
				System.out.println();
				
			}
			
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
	 
	 
	 
}




public class Alphabets
{

		public static void main(String[] args) 
		
	{
					Inuron1 Inu=new Inuron1();
					Inu.Inuron(); 
			
					NoobPrashant Parsu=new NoobPrashant();
					Parsu.Noob_Prashant();
					
					NumberProgram num=new NumberProgram();
					num.Number();
					num.Hut();
					num.Downwords();
					num.LeftSideArro();
			
			
			
			
		int n=12;		
		for(int i=0;i<n;i++)
		{    //A
			for(int j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<(3*n)/4||j==0&&i>0||i==n/2&&j<=(3*n)/4||j==(3*n)/4&&i!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//B
			for(int j=0;j<n;j++)
			{
				if(i==0&&j<(3*n)/4||j==0||i==n/2&&j<(3*n)/4||i==n-1&&j<(3*n)/4||j==(3*n)/4&&i>0&&i<n-1&&i!=(n)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//C
			for(int j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<(3*n)/4||i==n-1&&j>0&&j<(3*n)/4||j==0&&i>0&&i<n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//D
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j<(n*3)/4||i==n-1&&j<(n*3)/4||j==(3*n)/4&&i>0&&i<n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//E
			for(int j=0;j<n;j++)
			{
				if(j==0&&i>0&&i<n-1||i==0&&j>0&&j<(n*3)/4||i==n-1&&j>0&&j<(n*3)/4||i==n/2&&j<(3*n)/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//F
			for(int j=0;j<n;j++)
			{
				if(j==0&&i>0||i==0&&j>0&&j<(n*3)/4||i==n/2&&j<(3*n)/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//G
			for(int j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<(3*n)/4||j==0&&i>0&&i<n-1||i==n-1&&j>0&&j<(3*n)/4||j==(3*n)/4&&i>n/2||i==n/2&&j>0&&j>n/4&&j<n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//H
			for(int j=0;j<n;j++)
			{
				if(j==0||j==(3*n)/4||i==n/2&&j<=(3*n)/4||j==0&&i>n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//I
			for(int j=0;j<n;j++)
			{
				if(i==0&&j<n-1||i==n-1&&j<n-1||j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//J
			for(int j=0;j<n;j++)
			{
				if(i==0&&j<n-1||i==n-1&&j<n/2||j==n/2||j==0&&i>n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//k
			for(int j=0;j<n;j++)
			{
				if(j==0||i+j==(n-1)/2||i-j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//L
			for(int j=0;j<n;j++)
			{
				if(j==0||i==n-1&&j<n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//M
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j&&i<n/2||i+j==n-1&&j>n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//N
			for(int j=0;j<n;j++)
			{
				if(j==n/4||j==n-1||i==j&&j>n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//O
			for(int j=0;j<n;j++)
			{
				if(i==0&&j>n/4&&j<(3*n)/4||i==n-1&&j>n/4&&j<(3*n)/4||j==n/4&&i>0&&i<n-1||j==(3*n)/4&&i>0&&i<n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//P
			for(int j=0;j<n;j++)
			{
				if(i==0&&j>n/4&&j<(n*3)/4||i==n/2&&j>n/4&&j<(3*n)/4||j==n/4&&i>0||j==(3*n)/4&&i>0&&i<n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//Q
			for(int j=0;j<n;j++)
			{
				if(i==0&&j>n/4&&j<(3*n)/4||i==n-1&&j>n/4&&j<(3*n)/4||j==n/4&&i>0&&i<n-1||j==(3*n)/4&&i>0&&i<n-1||(i==j)&&i>n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//R
			for(int j=0;j<n;j++)
			{
				if(i==0&&j>n/4&&j<(n*3)/4||i==n/2&&j>n/4&&j<(3*n)/4||j==n/4&&i>0||j==(3*n)/4&&i>0&&i<n/2||(i==j)&&i>n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//S
			for(int j=0;j<n;j++)
			{
				if(j==n/4&&i>0&&i<n/2||j==(3*n)/4&&i>n/2&&i<n-1||i==0&&j>n/4&&j<(n*3)/4||i==n/2&&j>n/4&&j<(n*3)/4||i==n-1&&j>n/4&&j<(n*3)/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//T
			for(int j=0;j<n;j++)
			{
				if(i==0&&j<n-1||j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//U
			for(int j=0;j<n;j++)
			{
				if(i==n-1&&j>n/4&&j<(3*n)/4||j==n/4&&i<n-1||j==(3*n)/4&&i<n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//V
			for(int j=0;j<n*2;j++)
			{
				if(j == i || j == (n * 2 - i - 1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			// 
						for(int j=0;j<4;j++)
						{
							if(i==j)
							{
								System.out.print(" ");
							}
							else
							{
								System.out.print(" ");
							}
						}
			
			//W
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j&&j>=n/2||i+j==n-1&&i>=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			// 
						for(int j=0;j<4;j++)
						{
							if(i==j)
							{
								System.out.print(" ");
							}
							else
							{
								System.out.print(" ");
							}
						}
			
			//X
			for(int j=0;j<n;j++)
			{
				if(i==j||i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			// 
			for(int j=0;j<4;j++)
			{
				if(i==j)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//Y
			for(int j=0;j<n;j++)
			{
				if(i==j&&i<=n/2||i+j==n-1&&j>=n/2||j==n/2&&i>n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//Z
			for(int j=0;j<n;j++)
			{
				if(i==0&&j!=0||i==n-1||i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
		
			
	}
		
}


