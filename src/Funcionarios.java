public class Funcionarios {
    /*por que definir algum atributo como privado? se, aparentemente, ele fica público depois?
     * o atributo não vai ficar público depois, o que vai se tornar público é o construtor
     * o problema de deixar o atributo público é que qualquer classe que tiver acesso a ele, pode
     * modificar diretamente seu nome:
     *
     * alguém que soubesse o tipo de dado poderia colocar -500 em idade, porque -500 é tipo int
     * mas, pra controlar a inserção de dados, podemos realizar uma condicional simples com IF
     *
     *
     *
     * */
    private Long numeroDoCracha;
    private String nome;
    private int idade;
    private int quantidadeDeVendas;

    /*Construtor é isso que tá aqui abaixo: Basicamente, depois de definir quais dados vão ser utilizados dentro do objeto "funcionario"
     * eu vou ter que dizer quais dados eu vou receber em cada atributo de Funcionário. Quando eu torno isso público, quer dizer que eu
     * permito que outras classes saibam quais variáveis eu vou receber de parâmetro pra preencher os campos que vão compor o objeto
     * funcionário
     *
     * Objeto = cada registro que tem acesso aos comportamentos que eu defini na classe
     *  (ex.: funcionário fulano, 18 anos, 4 vendas; funcionário ciclano, 19 anos, 6 vendas;
     * vindos da classe Funcionarios). O que seria um registro concreto? O registro que foi devidamente inserido na classe, que foi
     * "cadastrado"
     *
     * Um ponto importante: o registro só vai PERSISTIR, ou seja, ser armazenado, caso haja conexão com um banco de dados,
     * junto a uma operação de inserção de dados no BD
     *
     * Objeto é uma INSTÂNCIA concreta da classe (a classe é o MODELO, a instância são OBJETOS do modelo)
     *
     * */
    public Funcionarios(Long numeroDoCracha, String nome, int idade, int quantidadeDeVendas) {
        this.numeroDoCracha = numeroDoCracha;
        this.nome = nome;

        /*preciso chamar o método aqui porque, se eu não chamar o método, de nada adianta a condição que
         *                     eu construí pra validar o dado*/
        setIdade(idade);
        this.quantidadeDeVendas = quantidadeDeVendas;
    }


    /*Isso se chama MÉTODO, que é um parâmetro pra construção de um atributo*/

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
           /*
           Essa era a opção que eu tinha pensado, mas existe uma forma mais
           inteligente de se fazer uma mensagem de erro em Java

           System.out.println("Por favor, insira um valor válido para idade");*/

            throw new IllegalArgumentException("Por favor, digite um valor válido para o campo de idade");
        }

    }
    public int getquantidadeDeVendas(){
        return this.quantidadeDeVendas;
    }
    public String getNome(){
        return this.nome;
    }
}