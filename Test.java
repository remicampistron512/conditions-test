import java.util.Scanner;

public class Test {
	public static void main(String [] args){
		int integerInt = 0;
		if(args.length>0){
			integerInt = Integer.parseInt(args[0]);
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("Entrez un nombre");
			
			while (!scan.hasNextInt()) {
				System.out.println("Entrée invalide, veuillez entrer un entier :");
				scan.next(); 
			}
			
			integerInt = scan.nextInt();
		}
		
		if(integerInt < 0){
			System.out.println(integerInt + " est négatif");
		} else if(integerInt > 0){
			System.out.println(integerInt + " est positif");
		} else if(integerInt == 0){
			System.out.println(integerInt + " est nul");
		}
		if(integerInt % 2 == 0){
			System.out.println(integerInt + " est pair");
		} else {
			System.out.println(integerInt + " est impair");
		}
	}
}