package posicion;

public class Punto {
	
	private int x;
	private int y;
	
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double distanciaCon(Punto obj){
		double difEX=Math.pow(obj.x-this.x,2);
		double difEY=Math.pow(obj.y-this.y,2);
		return Math.sqrt(difEX+difEY);		
	}
}

