package items;

public class Carcaj {
	
	private int cantDeFlechas;
	public Carcaj(int cant) throws CarcajException {
		if(cant>0)
			this.cantDeFlechas=cant;
		else
			throw new CarcajException("cantidad de flechas incorrecta");
	}
	public Carcaj() {
		this.cantDeFlechas=6;
	}
	
	public int getCantDeFlechas() {
		return this.cantDeFlechas;
	}

}
