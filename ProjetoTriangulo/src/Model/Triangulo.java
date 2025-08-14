package Model;

public class Triangulo {
	public double lado1;
    public double lado2;
    public double lado3;
    private String tipo;
    private double perimetro;
    private double area;

    public boolean isTriangle() {
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            calcularPerimetro();
            classificar();
            calcularArea();
            return true;
        } else {
            return false;
        }
    }

    public double calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public String classificar() {
        if (lado1 == lado2 && lado2 == lado3) {
            tipo = "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }
        return tipo;
    }

    public double calcularArea() {
        double sp = perimetro / 2;
        area = Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
        return area;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
}

