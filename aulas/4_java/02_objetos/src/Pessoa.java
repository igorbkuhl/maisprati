public class Pessoa {
    public String nome;
    protected int idade;
    private float peso;
    private static String sexo = "Feminino";
    private final float PI;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.PI = 3.1415;
    }

    // public void setPI(float valor) {
    //     this.PI = valor; // ERRO
    // }

    public float getPeso() {
        return this.peso;
    }

    public static String getSexo() {
        return sexo;
    }

    public void setPeso(int peso) {
        if (peso > 500) {
            System.out.println("Erro!");
            return;
        }

        this.peso = peso;
    }

    public void apresentar(String nacionalidade) {
        System.out.printf("Olá, meu nome é: %s e sou %s.\n", nome, nacionalidade);
    }

    public double calcularDesconto(double valor, double percentual) {
        return valor - (valor * percentual / 100);
    }

    public void alterar(int[] array) {
        array[0] = 99;
    }
}
