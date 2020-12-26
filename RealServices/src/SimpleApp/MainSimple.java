package SimpleApp;

 
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainSimple {
	public static void main(String[] args) {
		System.out.println("App di prova configuration managment ");
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("inserisci un intero");
		try {
			int x =sc.nextInt(); 
		System.out.println("il quadrato di "+x+" è "+x*x);
	}catch(InputMismatchException e) {
		System.out.println("lanciata eccezione:"+e); 
		System.out.println("End of Program");
		break;
	} 
		
	 
		}
		sc.close();
		}

}
