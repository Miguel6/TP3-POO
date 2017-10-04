package items;

public interface UsarConsumible {
	
	public abstract boolean puedeSerConsumido(Consumible item);
	public abstract boolean usarConsumible(Consumible item);
}
