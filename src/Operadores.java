public class Operadores {
    /*
     * public static void main(String[] args) {
     * String nomeCompleto = "LINGUAGEM" + " JAVA";
     * 
     * System.out.print(nomeCompleto);
     * }
     * 
     * public static void main (String[] args) {
     * String concatenacao ="?";
     * 
     * concatenacao = 1+1+1+"1";
     * concatenacao = 1+"1"+1+1;
     * concatenacao = 1+"1"+1+"1";
     * concatenacao = "1"+1+1+1;
     * concatenacao = "1"+(1+1+1);
     * 
     * }
     * }
     * 
     * public static void main (String[] args) {
     * int numero = 5;
     * numero = -numero;
     * 
     * System.out.print(numero);
     * 
     * numero = +numero;
     * 
     * System.out.print(numero);
     * 
     * }
     * 
     * public static void main (String[] args) {
     * int numero = 5;
     * 
     * numero++;
     * 
     * System.out.print(numero);
     * 
     * }
     * 
     * public static void main (String[] args) {
     * boolean variavel = true;
     * 
     * variavel = !variavel;
     * 
     * System.out.print(variavel);
     * 
     * }
     */
    public static void main (String[] args) {
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";
        String resultadoTernario = "";

        if(a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        
        System.out.println(resultado);

        resultadoTernario = a!=b ? "Verdadeiro" : "falso"; //"Condição" ? "valor se verdadeiro" : "valor se falso"

        System.out.println(resultadoTernario);

        String nomeUm = "RODRIGO";
        String nomeDois = new String("RODRIGO");

        System.out.println(nomeUm.equals(nomeDois));



    }
}
