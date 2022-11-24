package ex2;

public class TestCompte {

	public static void main(String[] args) {
		
		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte(1, "LA", 1220);
		comptes[1] = new Compte(100, "CC", 12);
		
		for (int i=0; i<comptes.length; i++) {
			
			System.out.println(comptes[i]);
		}
		
		

	}

}
