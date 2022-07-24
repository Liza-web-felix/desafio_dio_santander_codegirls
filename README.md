# Desafio DIO Santander Code Girls
Abstraindo um Bootcamp Utilizando POO em Java

# Implementações:
Nesse projeto foram implementados mais uma Mentoria, Bootcamp, mais dois Devs e uma última mensagem para dizer que não tem mais conteúdos para mostar.
Modifiquei o formato da data=2022-07-23 (yyyy-MM-dd) para data=23/07/2022 (dd/MM/yyyy).

#Orientações:
Modifique você mesmo o formato da data utilizando o DateTimeFormatter ao toString()

#Insira os seguintes trechos de código ao toString() do seu projeto:

@Override
public String toString(){
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data.format(formatter) + "]";
}

## Links Úteis:

Aprenda a formatar as datas de várias maneiras

[DelftStack](https://www.delftstack.com/pt/howto/java/java-change-date-format/)

[DEVMEDIA](https://www.devmedia.com.br/utilizando-recursos-do-java-para-formatacao-de-datas/5720)

Aprenda a resolver problemas envolvendo formatação de datas

[StackOverflow](https://pt.stackoverflow.com/questions/231106/formatar-data-no-java)



