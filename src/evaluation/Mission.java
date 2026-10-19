package evaluation;

public class Mission {

	private Employe employe;
	private Projet projet;
	private int nbJours;

	public Mission(Employe employe, Projet projet, int nbJours) {
		this.employe = employe;
		this.projet = projet;
		this.nbJours = nbJours;
	}

	public double calculerMontant() {
		return employe.calculerCout(nbJours);

	}
	
	

	public void afficherRecapitulatif() {
		System.out.println("Recapitulatif");
		System.out.println("les informations de l’employé");
		System.out.println(afficherDetails());
		System.out.println("les informations du projet");
		System.out.println(projet.toString());
		System.out.println("la durée de la mission");
		System.out.println(nbJours);
		System.out.println("le montant calculé");
		System.out.println(calculerMontant());
	}

}
