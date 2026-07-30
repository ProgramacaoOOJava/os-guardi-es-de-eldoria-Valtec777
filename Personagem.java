public class Personagem {
    // 1. Atributos do personagem 
    String nome;
    String classe;
    int nível;
    int pontosDeVida;
    double poderBase;
    // 2. Metodo para exibir as informações
    public void exibirStatus() {
        System.out.println("Nome: " + this.nome
        System.out.println("Classe: " + this.classe);
        System.out.println("Nível: " + this.nivel);
        System.out.println("pontos de Vida: " + this.pontosDeVida);
        System.out.println("Poder Base: " + this.poderBase);
        
    }
    // 3. Metodo Main dentro da mesma classe para rodar o código
    public static void main(String[] args) {
    // Criando o Arthanis  (p1)
    Personagem p1 = new Personagem();                        
    p1 . nome = "Arthemis";
    p1 . classe = "Arqueira";
    p1. nivel = 5;
    p1. pontosDeVida = 80;
    p1. poderBase = 12.5;

    //Criando o segundo personagem p2 = new Persona
        Personagem p2 = new Personagem();
        p2.nome = " Ragnar ";
        p2.classe = "Guerreiro";
        p2.nivel = 6;
        p2.pontosDeVida = 100;
        p2.poderBase = 15.0;

    
     
    // exibindo o status de cao
    System.out.println("\n=======PERSONAGEM 1 ======);
        p1.exibirStatus();
        System.out.println("\n======PERSONAGEM 2 ======);
        p2.exibirStatus();

        
    }
}

