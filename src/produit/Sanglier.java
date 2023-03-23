package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private float valeur;
	private Gaulois chasseur;
	public Sanglier(Gaulois chasseur, float valeur) {
		super("sanglier", Unite.KILOGRAMME, valeur);
		this.valeur = valeur;
		this.chasseur = chasseur;
	}
	@Override
	public String getDescription() {
		return getNom() + " de " + valeur + " " + Unite.KILOGRAMME.getSymbole() + " chassé par " + chasseur.getNom();
	}
	public static void main(String[] args) {
		Gaulois obelix = new Gaulois("obelix", 50);
		Sanglier sanglier = new Sanglier(obelix, 15);
		
		System.out.println(sanglier.getDescription());
	}

}
