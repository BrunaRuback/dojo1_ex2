package util;

public class Reta {

    Ponto pontoA;
    Ponto pontoB;

    public Reta(Ponto pontoA, Ponto pontoB) {
        this.pontoA = pontoA;
        this.pontoB = pontoB;
    }

    public double tamanho() {
        return this.pontoB.distancia(pontoA);
    }
}