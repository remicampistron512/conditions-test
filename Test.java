public class Test {
	public static void main(String [] args){
		int integer = 5;
		if(integer < 0){
			System.out.println(integer + " est négatif");
		} else if(integer > 0){
			System.out.println(integer + " est positif");
		} else if(integer == 0){
			System.out.println(integer + " est nul");
		}
		if(integer % 2 == 0){
			System.out.println(integer + " est pair");
		} else {
			System.out.println(integer + " est impair");
		}
	}
}