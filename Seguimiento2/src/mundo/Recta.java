package mundo;

public class Recta {
    private double x1, y1, x2, y2;

    public Recta(double x1, double y1, double x2, double y2) throws IllegalArgumentException {
        if (x1 == 0 || x2 == 0) {
            throw new IllegalArgumentException("Las coordenadas X1 y X2 no pueden ser 0");
        }
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String obtenerEcuacion() {
        double m = (y2 - y1) / (x2 - x1);
        return "y - " + y1 + " = " + m + "(x - " + x1 + ")";
    }
}
