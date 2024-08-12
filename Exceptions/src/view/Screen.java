package view;

public class Screen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = new int[3];
		try {
			vector[0] = 1;
			vector[1] = 2;
			vector[2] = 3;
			vector[3] = 4;
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			// e is the variable object.
			System.out.println("There's no space in the vector.");
			System.out.println(e.getMessage());
		}
		char var='a';
		System.out.println(var);
		
		
		
	}
}
