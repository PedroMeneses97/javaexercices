public class Circulo{

    private double radius = 1.0;
    private String color = "red";

    //Construtor
    public Circulo(Double radius,String color)
    {
        this.radius = radius;
        this.color = color;
    }

    //Métodos
    public String toString(){

      return "Circulo[radius=" + radius + " color=" + color + " area=" + getArea() + "]";
    }


    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){

     
     double area;
     area = Math.PI * (radius * radius);

     return area;
     
    }



}
