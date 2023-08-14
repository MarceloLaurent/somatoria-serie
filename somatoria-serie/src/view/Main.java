package view;

import controller.SomatoriaController;

public class Main {
    public static void main(String[] args) {

        SomatoriaController sc = new SomatoriaController();

        double resultado = sc.somatoria(5);

        System.out.println(resultado);
    }
}