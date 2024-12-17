package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public void exemploLista(){

        List<String> list  = new ArrayList<>();

        list.add("Gabriel");
        list.add("Pedro");
        list.add("Arthur");
        list.add("Sofia");
        list.add("Serena");
        list.add("Ariana");
        list.add(0,"Luan");

        System.out.println(list.size());


        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------------------");
        list.remove(0); // o metodo remove pode remover tanto pelo index quanto pelo dado dentro da lista comparando
        list.remove("Pedro");
        // exemplo de uso de predicado
        list.removeIf(x -> x.charAt(0) == 'S');
        // o predicado que fizamos é um lambda
        // passamos uma variavel sendo ela o X e informando que que o x.charAt(0) é a posição do carctere que buscamos
        // então informamos que se for igual a 'A' devemos remover da lista
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        System.out.println("Index of Luan: " + list.indexOf("Luan"));
        // quando tentamos buscar o indexOf de um elemento que nao esta na lista ele retorna -1
        System.out.println("Index of Serena: " + list.indexOf("Serena"));
        System.out.println("----------------------");
        // Uso do filtro na lista
        // vamos fazer uma nova lista quer será a nossa lista filtrada
        //atualmente ja podemos utilizar apenas o toList() para fazer a conversão para o tipo list
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A' ).collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("----------------------");
        List<String> result2 = list.stream().filter(x -> x.charAt(0) == 'A' ).toList();
        System.out.println("Utilizando o toList()");
        for (String x : result2){
            System.out.println(x);
        }
        System.out.println("----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }
}
