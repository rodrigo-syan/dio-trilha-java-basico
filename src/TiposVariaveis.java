public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        byte idade = 123;
        short ano = 2022;
        int cep = 60861634;
        long cpf = 1234567890L;
        float pi = 3.14F;
        String cpfZero = "01234567890";

        System.out.println(salarioMinimo);
        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(cpfZero);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //cast

    }
}
