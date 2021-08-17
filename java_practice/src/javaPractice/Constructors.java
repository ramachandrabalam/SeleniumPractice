package javaPractice;


class Different_con{
	int i;
	int j;
	
	public Different_con() {
		System.out.println("This is the default construictor");
		i=7;
		j=6;
	}
	public Different_con(int k) {
		System.out.println("This is the parameter construictor");
		i=89;
		j=77;
	}
}


public class Constructors {

	public static void main(String[] args) {
		
		Different_con obj = new Different_con(5);
		
		System.out.println(obj.i);
		

	}

}
