# tarefa_reflections

Os códigos nesse trabalho utilizam o recurso de reflection em Java. A reflection em Java permite que um programa obtenha informações sobre classes carregadas em tempo de execução e use essas informações para realizar operações dinâmicas, como acessar campos, métodos e construtores, além de criar novas instâncias de classes. A reflection é comumente usada em situações em que é necessário examinar ou modificar o comportamento de um programa em tempo de execução.

No código fornecido, o uso de reflection pode ser observado nas seguintes linhas:

A obtenção do construtor da classe ClasseAnotada em Constructor<?> cons = c.getConstructor();.
A criação de uma nova instância de ClasseAnotada usando o construtor obtido em ClasseAnotada classeAnotada = (ClasseAnotada) cons.newInstance();.
A verificação se a classe ClasseAnotada possui a anotação @Tabela em classeAnotada.getClass().isAnnotationPresent(Tabela.class).
A obtenção e impressão do valor do atributo value da anotação @Tabela em System.out.println(t.value());.
Esses trechos de código demonstram o uso de reflection para acessar informações sobre a classe e a anotação em tempo de execução. 

## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
