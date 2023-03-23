package produit;

public class Poisson extends Produit {
	private float valeur;
	private String date;
	
	public Poisson(String date) {
		super("poisson", Unite.KILOGRAMME, 1);
		this.date = date;
	}
	


	@Override
	public String getDescription() {
		
		return getNom() + " péchês " + date;
	}
	
	public static void main(String[] args) {
		Poisson poisson = new Poisson("mardi");
		System.out.println(poisson.getDescription());
	}
}
