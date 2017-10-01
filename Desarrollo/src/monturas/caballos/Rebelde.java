package monturas.caballos;

public class Rebelde extends EstadoCaballo{

	public Rebelde() {
		this.cantDeAtaques=3;
	}
	@Override
	public EstadoCaballo tomar() {
		return new Normal();
	}
	

}
