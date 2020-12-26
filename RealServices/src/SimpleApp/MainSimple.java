package SimpleApp;

 
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainSimple {
	public static void main(String[] args) {
		System.out.println("App di prova configuration managment ");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("OP:1 quadrato - 2 string composition");
			int op = sc.nextInt();
			if(op==1) {
		System.out.println("inserisci un intero");
		try {
			int x =sc.nextInt(); 
		System.out.println("il quadrato di "+x+" � "+x*x);
	}catch(InputMismatchException e) {
		System.out.println("lanciata eccezione:"+e); 
		System.out.println("End of Program");
		break;
	} 
			}else if(op==2) {
				System.out.println("Inserisci una stringa");
				String x = sc.next();
				StringBuffer a = new StringBuffer("la stringa :");
				a.append(x);
				x= new String(a);
				System.out.println(x);
				
			}else {
				System.out.println("exit");
				break;
			}
	 
		}
		sc.close();
		}

}
