package Mathematics;
class Fibonacci
{  
	public static int n1=0,n2=1,n3;   
	public static int count;
	static {
		System.out.print(n1+" "+n2);//printing 0 and 1
	}
	static void printFibonacci(int count) {
		if(count > 0) {    
			n3 = n1 + n2;    
			System.out.print(" " + n3);    
			n1 = n2;    		
			n2 = n3;
			printFibonacci(count - 1);
		}    
	}
}