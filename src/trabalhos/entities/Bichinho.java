package trabalhos.entities;

public class Bichinho {
    private String nome;
    private int fome;
    private int energia;
    private int felicidade;

    public Bichinho(String nome) {
        this.nome = nome;
        this.fome = 100;
    }

    public void menu() {
        System.out.println("\n===== Escolha o que quer fazer com " + nome + " =====\n");
        System.out.println("1 - Alimentar");
        System.out.println("2 - Brincar");
        System.out.println("3 - Dormir");
        System.out.println("4 - Saber se está feliz");
        System.out.println("5 - Status");
        System.out.println("0 - Sair\n");
        System.out.print("Escolha uma opção: ");
    }

    private int limitar(int valor) {
        return Math.max(0, Math.min(100, valor));
    }

    public void alimentar() {
        fome = limitar(fome - 30);
        felicidade = limitar(felicidade + 5);
    }

    public void brincar() {
        if (fome >= 100) {
            System.out.println("Seu bichinho está doente demais para brincar");
        } else {
            felicidade = limitar(felicidade + 20);
            energia = limitar(energia - 15);
            fome = limitar(fome + 10);
        }
    }

    public void dormir() {
        energia = 100;
        fome = limitar(fome + 20);
    }

    public boolean estaFeliz() {
        return felicidade >= 70;
    }

    public void status() {
        System.out.println(this);
    }

    public String toString() {
        return "Nome: "
                + nome
                + ", Fome: "
                + fome
                + ", Energia: "
                + energia
                + ", Felicidade: "
                + felicidade;
    }


}
