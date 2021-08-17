package javaPractice;

public class Twod_array {

	public static void main(String[] args) {
		int f[][]= { {1,2,3,4},
				     {3,4,2},
				     {4,5,2,1,4}
				   
		};
		
 for(int i=0; i<f.length;i++) {

	 for(int j=0;j<f[i].length;j++) {
		 System.out.print(f[i][j]+ " ");
	 }
	 System.out.println();
 }

	}

}
