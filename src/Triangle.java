public class Triangle {
    double a;
    double b;
    double c;

    public void area() {
        double s = (a + b + c) / 2;
        double areaOfTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(areaOfTriangle);

    }
}
