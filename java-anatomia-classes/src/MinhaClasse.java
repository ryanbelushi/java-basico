public class MinhaClasse {
    public static void main(String[] args) {

        String firstName = "Ryan";
        String lastName = "Belushi";

        // Guardando o retorno do método em uma variável.
        String nomeCompleto = nomeCompleto(firstName, lastName);

        // Exibindo o resultado no terminal.
        System.out.println(nomeCompleto);
    }

     // método:

     public static String nomeCompleto (String firstName, String lastName) {
        // O método concat é usado para concatenar duas strings.
        // O método concat não adiciona espaço entre as strings, então é necessário adicionar um espaço manualmente. Como foi feito abaixo.
            return firstName.concat(" ").concat(lastName);
     }
}
