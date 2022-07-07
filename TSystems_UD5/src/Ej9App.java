
public class Ej9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int num=1; num<101; num++) {
			
			int resto = num%2;
			if(resto==0) {
			System.out.println("El número " +num+ " es divisible entre 2");
			}
			
			int resto1 =num%3;
			if(resto1==0) {
			System.out.println("El número " +num+ " es divisible entre 3");
			}
		}
	}	
}
