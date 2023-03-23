package produit;

public abstract class Produit {
	private String nom;
	private Unite unite;
	private float valeur;
	
	
	public Produit(String nom, Unite unite, float valeur) {
		super();
		this.nom = nom;
		this.unite = unite;
		this.valeur = valeur;
	}
	
	public String getNom() {
		return nom;
	}
	
	public abstract String getDescription();
}
