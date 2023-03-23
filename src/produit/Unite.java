package produit;

public enum Unite {
	
	
	LITRE("l"), GRAMME("g"), KILOGRAMME("kg"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("");
	
	private String symbole;
	Unite(String symbole) {
		this.symbole = symbole;
	}
	public String getSymbole() {
		return symbole;
	}
}
