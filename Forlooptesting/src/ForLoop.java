import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner scan = new Scanner(System.in);
                 int height;
    
                 do {
                   System.out.print("Height: ");
                   height = scan.nextInt();
                     }while(height < 0 || height > 8);
    
		   String s = "#";
		
		//row
		for(int i = 0; i < height; i++) { 
			
			//column
			for(int j = i; j < height ; j++) {
					
					System.out.print(" ");
							 
			}
			System.out.print(s);
			s += "#";
			
			System.out.println();
		}
	}

}
