package javaPractice;


class Calc{
	int num1;
	int num2;
	
	
	public void perform() {
		double result=num1+num2;
		System.out.println((result+(result*2))/4);
	}
}
public class Class_objects {

	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.num1=5;
		obj.num2=8;
		obj.perform();

	}

}
