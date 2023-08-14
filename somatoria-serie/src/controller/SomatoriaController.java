//Exercicio 5
package controller;

public class SomatoriaController {

    public SomatoriaController() {
    }

    public double somatoria(int numero){
        if(numero == 1){
            return 1; //Condição de parada: n = 1
        } else {
            return 1.0/numero + somatoria(numero -1); //Chamada: 1 divido por n mais a funcção com n - 1 como parâmetro
        }
    }
}
