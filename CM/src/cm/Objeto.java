package cm;
public class Objeto {
    private int x;
    private int y;

    public Objeto() {
    }

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Objeto{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double calcularDistancia(double Xorigem, double Yorigem, double Xdestino, double Ydestinho){
        double x1 = Xorigem;
        double x2 = Xdestino;
        double y1 = Yorigem;
        double y2 = Ydestinho;
        double ac = 90 - y1;
        double ab = 90 - y2;
        double abc = x2 - x1;
        double cossenoDeABC = Math.cos(ac) * Math.cos(ab) + Math.sin(ab) + Math.sin(ac) * Math.cos(abc);
        double arcoCosseno = Math.acos(cossenoDeABC);
        double distancia = (40030 * arcoCosseno) / 360;
        return Math.round(distancia);
    }
}
