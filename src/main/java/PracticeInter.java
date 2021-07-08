
interface A{
	
	void m1();
}

interface B{
	void m1();
}

public class PracticeInter implements A,B{

	public void m1() {
		
		System.out.println("m1");
	}
	
	public static void main(String[] args)
	{
		PracticeInter p= new PracticeInter();
		p.m1();
		
//		int a[] = {2,3,4,5,6};
//		int b[] = a;
//		int sum=0;
//		for(int i=0;i<3;++i)
//		{
//			System.out.println(i);
//			System.out.println(a[i]);
//			sum+=(a[i]*b[i+1])+(b[i]*a[i+1]);
//			System.out.println(a[i]);
//		}
//		System.out.println(sum);
		
		for(int j=0;j<10;++j)
		{
			System.out.println(j);
		}
	}
	
	
	
}
