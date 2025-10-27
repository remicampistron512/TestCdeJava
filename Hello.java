import java.util.Scanner;

public class Hello{
	public static void main(String[] args){
		System.out.println("Bonjour et bienvenue dans mon programme java");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez votre nom");
		String name = scan.nextLine();
		System.out.println("Entrez votre pr\u00E9nom");
		String firstname = scan.nextLine();
		System.out.println("Bienvenue "+ firstname + " " + name);
		
		
	}
}

