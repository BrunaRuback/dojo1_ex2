package application;

import util.Ponto;
import util.Reta;
import util.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ponto ponto1;
        Ponto ponto2;
        Ponto ponto3;
        Ponto ponto4;

        /*
         * implemente uma classe Ponto que representa um ponto de coordenadas x
         * e y. Para esta classe, implemente os métodos que permitem alterar e recuperar
         * as
         * coordenadas do ponto (métodos get e set). A classe também deve ser capaz de
         * calcular a
         * distância entre dois pontos. Implemente uma classe principal que crie três
         * objetos do
         * tipo ponto, modifique os dados dos objetos criados e mostre seus dados.
         * 
         * 
         * 
         * 
         * 
         * Exercício 3: crie uma classe Reta que utilize a classe Ponto do exercício
         * anterior. A
         * partir de seus dois extremos (pontos), a classe Retangulo deve ser capaz de
         * retornar o
         * seu tamanho.
         */

        Scanner sc = new Scanner(System.in);

        float x, y;

        System.out.println("X do ponto 1: ");
        x = sc.nextFloat();
        System.out.print("Y do ponto 1: ");
        y = sc.nextFloat();
        ponto1 = new Ponto(x, y);

        System.out.println("X do ponto 2: ");
        x = sc.nextFloat();
        System.out.print("Y do ponto 2: ");
        y = sc.nextFloat();
        ponto2 = new Ponto(x, y);

        System.out.println("X do ponto 3: ");
        x = sc.nextFloat();
        System.out.print("Y do ponto 3: ");
        y = sc.nextFloat();
        ponto3 = new Ponto(x, y);

        System.out.println("X do ponto 4: ");
        x = sc.nextFloat();
        System.out.print("Y do ponto 4: ");
        y = sc.nextFloat();
        ponto4 = new Ponto(x, y);

        char answer;
        do {
            System.out.println("Deseja alterar algum ponto (s/n)? ");
            answer = sc.next().charAt(0);
            switch (answer) {
                case 's':
                    System.out.println("Deseja alterar qual ponto (1/2/3/4)? ");
                    int cnt = sc.nextInt();
                    switch (cnt) {
                        case 1:
                            System.out.println("Novo x do ponto 1: ");
                            sc.nextLine();
                            x = sc.nextInt();
                            ponto1.alterarX(x);
                            System.out.println("Novo y do ponto 1: ");
                            y = sc.nextInt();
                            ponto1.alterarY(y);
                            break;
                        case 2:
                            System.out.println("Novo x do ponto 2: ");
                            sc.nextLine();
                            x = sc.nextInt();
                            ponto2.alterarX(x);
                            System.out.println("Novo y do ponto 2: ");
                            y = sc.nextInt();
                            ponto2.alterarY(y);
                            break;
                        case 3:
                            System.out.println("Novo x do ponto 3: ");
                            sc.nextLine();
                            x = sc.nextInt();
                            ponto3.alterarX(x);
                            System.out.println("Novo y do ponto 3: ");
                            y = sc.nextInt();
                            ponto3.alterarY(y);
                            break;
                        case 4:
                            System.out.println("Novo x do ponto 4: ");
                            sc.nextLine();
                            x = sc.nextInt();
                            ponto4.alterarX(x);
                            System.out.println("Novo y do ponto 4: ");
                            y = sc.nextInt();
                            ponto4.alterarY(y);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + cnt);
                    }
                case 'n':
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + answer);
            }
        } while (answer == 's');

        sc.close();

        Reta reta1;
        Reta reta2;
        reta1 = new Reta(ponto1, ponto2);
        reta2 = new Reta(ponto3, ponto4);

        System.out.println("------------ Dados dos pontos ------------");
        System.out.println("Ponto 1: ");
        ponto1.imprimir();
        System.out.println("Ponto 2: ");
        ponto2.imprimir();
        System.out.println("Ponto 3: ");
        ponto3.imprimir();
        System.out.println("Ponto 4: ");
        ponto4.imprimir();

        System.out.println(" Distancias entre os pontos ------------");
        System.out.println("Entre o ponto 1 e o 2: ");
        System.out.println(ponto1.distancia(ponto2));
        System.out.println("Entre o ponto 1 e o 3: ");
        System.out.println(ponto1.distancia(ponto3));
        System.out.println("Entre o ponto 2 e o 3: ");
        System.out.println(ponto2.distancia(ponto3));

        System.out.println("Tamanho das retas ------------");
        System.out.println(reta1.tamanho());
        System.out.println(reta2.tamanho());

        Retangulo retangulo = new Retangulo(reta1, reta2);
        System.out.println("Retangulo ------------");
        System.out
                .println("Altura: " + retangulo.getAltura().tamanho() + "\nLargura: "
                        + retangulo.getLargura().tamanho());
        System.out.println("Perímetro: " + retangulo.perimetro() + "\nÁrea: " + retangulo.area());
    }
}
