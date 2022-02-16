
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String s = "#";
		
		//row
		for(int i = 0; i < 5; i++) { 
			
			//column
			for(int j = i; j <5; j++) {
					
					System.out.print(" ");
							 
			}
			System.out.print(s);
			s += "#";
			
			System.out.println();
		}
	}

}
