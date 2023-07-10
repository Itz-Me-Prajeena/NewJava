class AddNumEx
{
	int a,b,sum=0;
	AddNumEx(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("num 1 = "+a);
		System.out.println("num 2 = "+b);
	}
	public int sumFn()
	{
		
		sum=a+b;
		System.out.println("Sum = "+sum);
		return sum;
	}
	public static void main(String args[])
	{
		AddNumEx num=new AddNumEx(5,7);
		num.sumFn();
	}
}