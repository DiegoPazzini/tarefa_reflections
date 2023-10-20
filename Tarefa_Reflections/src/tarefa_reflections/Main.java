package tarefa_reflections; // Declaração do pacote

import java.lang.reflect.Constructor; // Importação da classe Constructor do pacote java.lang.reflect

public class Main { // Declaração da classe Main

    public static void main(String[] args) { // Declaração do método principal main

        Class<?> c = ClasseAnotada.class; // Criação de uma referência à classe ClasseAnotada e atribuição a 'c'

        try { // Início do bloco try, que é usado para lidar com exceções

            Constructor<?> cons = c.getConstructor(); // Obtenção do construtor da classe 'c' e atribuição a 'cons'

            ClasseAnotada classeAnotada = (ClasseAnotada) cons.newInstance(); // Criação de uma nova instância de ClasseAnotada usando o construtor obtido e atribuição a 'classeAnotada'

            if(classeAnotada.getClass().isAnnotationPresent(Tabela.class)){ // Verificação se a classe de 'classeAnotada' possui a anotação @Tabela

                Tabela t = classeAnotada.getClass().getAnnotation(Tabela.class); // Obtenção da anotação @Tabela da classe 'classeAnotada' e atribuição a 't'

                System.out.println(t.value()); // Impressão do valor do atributo 'value' da anotação @Tabela

            } // Fim do bloco if

        } catch (Exception e) { // Captura de exceções de qualquer tipo e atribuição a 'e'

            e.printStackTrace(); // Impressão da pilha de erro ou rastreamento do erro

        } // Fim do bloco try-catch

    } // Fim do método main

} // Fim da classe Main