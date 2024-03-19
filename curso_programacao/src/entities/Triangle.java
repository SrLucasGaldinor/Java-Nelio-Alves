package entities;

public class Triangle {
	private String code;
	public double a;
	public double b;
	public double c;
	public double perimeter;
	public double area;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void calculatePerimeter() {
		perimeter = a + b + c;
	}

	public void calculateAreaOfTheTriangle() {
		double semiPerimeter = perimeter / 2.0;
		area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
		validationArea();
	}
	
	public void validationArea() {
		if (Double.isNaN(area)) {
			area = 0.0;
		}
	}
}
