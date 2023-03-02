package vagner.segundaSemana;
public class MinhaClasse {
    
    public static void main(String [] args) {

        //aula 1
        //System.out.print("Olá turma, sejam bem vindos!");
        
        //aula 2
        /*
        int ano 2021;
        ano = 2022;
        final String BR "Brasil";
        BR = "Brazil";*/

        //aula 3
         /*
        String meuNome = "Sombra";
        int anoFabricacao = 2022;
        boolean verdadeira = true;
         */

        String primeiroNome = "Eu sou ";
        String segundoNome = "Senhor Sombra";
        

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do Metodo" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
