public class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    //Construtor
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase

    }
     
    // Metodo para exibir o status
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        

    }
}

