public class Patters {

	public static void main(String[] args) {
		
		pattern(1);
		add(4,6);
	}
	public static void pattern(int p ) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			
			System.out.print(" ");
			
		}
			System.out.println();	

	}
}
public static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}

}
