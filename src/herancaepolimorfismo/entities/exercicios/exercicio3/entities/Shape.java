package herancaepolimorfismo.entities.exercicios.exercicio3.entities;


import herancaepolimorfismo.entities.exercicios.exercicio3.enums.Color;

public abstract class Shape {

	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
}