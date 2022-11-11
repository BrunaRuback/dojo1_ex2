package util;

public class Retangulo {

    private Reta altura;
    private Reta largura;

    public Retangulo(Reta altura, Reta largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Reta getAltura() {
        return altura;
    }

    public void setAltura(Reta altura) {
        this.altura = altura;
    }

    public Reta getLargura() {
        return largura;
    }

    public void setLargura(Reta largura) {
        this.largura = largura;
    }

    public double perimetro() {
        return this.largura.tamanho() * 2 + this.altura.tamanho() * 2;
    }

    public double area() {
        return this.largura.tamanho() * this.altura.tamanho();
    }

}
