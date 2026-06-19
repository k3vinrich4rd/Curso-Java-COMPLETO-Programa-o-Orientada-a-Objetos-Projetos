package genericssetmap.tiposcuringa.tiposcuringadelimitados.problema1.somadaareadeumalista.application;

import genericssetmap.tiposcuringa.tiposcuringadelimitados.problema1.somadaareadeumalista.entities.Circle;
import genericssetmap.tiposcuringa.tiposcuringadelimitados.problema1.somadaareadeumalista.entities.Rectangle;
import genericssetmap.tiposcuringa.tiposcuringadelimitados.problema1.somadaareadeumalista.entities.Shape;

import java.util.ArrayList;
import java.util.List;

/*
Vamos fazer um método para retornar a soma das áreas de uma lista de figuras.
 */
public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}

	//A lista pode implementar Shape ou de qualquer tipo que seja seu subtipo como Circle ou Rectangle
	//Com o curinga delimitado, alguns tipos não podem ser incluídos na lista
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}