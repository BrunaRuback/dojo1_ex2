package util;

public class Ponto {

    float x, y;

    Ponto ponto1;
    Ponto ponto2;
    Ponto ponto3;
    Ponto ponto4;

    /* ------ CONSTRUTOR ------ */
    // criando objeto Ponto
    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /* ------ GETTERS & SETTERS ------ */
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Ponto getPonto1() {
        return ponto1;
    }

    public void setPonto1(Ponto ponto1) {
        this.ponto1 = ponto1;
    }

    public Ponto getPonto2() {
        return ponto2;
    }

    public void setPonto2(Ponto ponto2) {
        this.ponto2 = ponto2;
    }

    public Ponto getPonto3() {
        return ponto3;
    }

    public void setPonto3(Ponto ponto3) {
        this.ponto3 = ponto3;
    }

    public Ponto getPonto4() {
        return ponto4;
    }

    public void setPonto4(Ponto ponto4) {
        this.ponto4 = ponto4;
    }

    /* ------ METODOS ------ */
    public void mover(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public double distancia(Ponto p) {
        float dx = this.x - p.x;
        float dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "X: " + this.x + "\nY: " + this.y + "\n------------";
    }

    public void alterarX(float a) {
        x = a;
    }

    public void alterarY(float b) {
        y = b;
    }

    public void imprimir() {
        // System.out.println("** Dados do ponto ***");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
