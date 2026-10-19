package evaluation;

public class Main {
	public static void main(String[] args) {
		Ingenieur i1 = new Ingenieur("SSSS","Ali",129.0,5);
		Ingenieur i2 = new Ingenieur("HHHHH","Sara",150.0,3);
		
		Commercial c1 = new Commercial("EEEE","Salma",140.0,16.9);
		Commercial c2 = new Commercial("JJJJ","Oumaima",125.0,11.2);
		
		Employe[] T1 = {i1, i2, c1, c2};
		
		Projet p1 = new Projet("RRR","PPP");
		Projet p2 = new Projet("OOO","LLL");
		
		Mission m1 = new Mission(i1,p1,4);
		Mission m2 = new Mission(i2,p2,3);
		Mission m3 = new Mission(c1,p1,6);
		Mission m4 = new Mission(c2,p2,2);
		
		Mission[] T2 = {m1, m2, m3,m4};
		
		System.out.println("\nRECAPITULATIF DE TOUTES LES MISSIONS");
		for (int i = 0; i < T2.length; i++) {
			T2[i].afficherRecapitulatif();
		
		}
		
		double montantTotal = 0;
		for (Mission m : T2) {
			montantTotal += m.calculerMontant();
		}
		System.out.println("\nMONTANT TOTAL DES MISSIONS");
		System.out.println("Montant Total Global : " + montantTotal + " DH");
	}

}
