public class Main {

    /*Main é o local onde o programa inicia todas as outras classes criadas*/

    public static void main (String[] args){
        /*public é dizendo que essa classe é acessível a todas as outras
        * static quer dizer que esse método não precisa receber um objeto pra  (ou seja, eu não dou parâmetros pra que a Main exista)
        * void significa que esse método não retorna nenhum valor
        System.out.println("Sistema Iniciado");*/

         Funcionarios funcionario1 =
            new Funcionarios (321L, "Gabriel Braz Vorcaro", 28, 30);

         Funcionarios funcionario2 =
            new Funcionarios (654L, "Adryanna Lima", 25, 2);

         int vendas1 = funcionario1.getquantidadeDeVendas();
         int venda2 = funcionario2.getquantidadeDeVendas();

         if (vendas1 > venda2){
             System.out.println(funcionario1.getNome() + " vendeu " + vendas1 + " produtos");
         }
         else if (vendas1 == venda2) {
             System.out.println(funcionario1.getNome() + " e " + funcionario2.getNome() + " venderam a mesma quantidade de produtos!");
         }

         else if (venda2 > vendas1) {
             System.out.println(funcionario2.getNome() + " vendeu mais produtos");
         }
    }


}