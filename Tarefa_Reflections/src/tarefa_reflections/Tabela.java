package tarefa_reflections; // Declaração do pacote

import java.lang.annotation.ElementType; // Importação da classe ElementType do pacote java.lang.annotation
import java.lang.annotation.Retention; // Importação da classe Retention do pacote java.lang.annotation
import java.lang.annotation.RetentionPolicy; // Importação da classe RetentionPolicy do pacote java.lang.annotation
import java.lang.annotation.Target; // Importação da classe Target do pacote java.lang.annotation

@Retention(RetentionPolicy.RUNTIME) // Definição da política de retenção da anotação como RUNTIME
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER}) // Definição dos elementos aos quais a anotação pode ser aplicada

public @interface Tabela { // Declaração da anotação Tabela

    String value(); // Declaração de um método sem corpo chamado value na anotação Tabela

} // Fim da anotação Tabela