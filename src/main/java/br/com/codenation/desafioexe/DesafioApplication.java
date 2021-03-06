// sempre colocar projetos em Pacotes
package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

    public static List<Integer> fibonacci() {
        // inst�nciamos a ArrayList
        List<Integer> AdicionaNaLista = new ArrayList<>();
        // percorremos o loop  
        for (int a = 0, b = 1; a <= 377; b += a, a = b - a) {
            //Adionamos elemento na lista
            AdicionaNaLista.add(a);
        }

        return AdicionaNaLista;
    }

    public static Boolean isFibonacci(Integer a) {
        /*contains: Verificar se o elemento existe na ArrayList
        return:  pode ser usado no retorno de m�todo ou para simplesmente parar a execu��o por al�*/
        return (fibonacci().contains(a));
    }

    public static void main(String[] args) {
        DesafioApplication.fibonacci();
        //DesafioApplication.isFibonacci((a));

    }
}
