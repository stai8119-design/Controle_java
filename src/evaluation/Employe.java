package evaluation;

public abstract class Employe {

	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	protected Employe superieur;

	public Employe(String matricule, String nom, double tarifJournalier) {
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
	}

	public String getMatricule() {
		return matricule;
	}

	public abstract double calculerCout(int nbJours);

	public void afficherDetails() {
		System.out.println("Matricule:" + matricule + ",nom:" + nom + ", le tarif journalier:" + tarifJournalier);
	}

	
	public void setSuperieur(Employe superieur) {
		this.superieur = superieur;
	}

	
}
