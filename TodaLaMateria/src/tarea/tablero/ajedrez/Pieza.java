package tarea.tablero.ajedrez;

public abstract class Pieza {
	
	protected String color;

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return color + " ";
	}
	
}
