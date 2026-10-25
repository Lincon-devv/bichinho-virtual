package trabalhos.program;

import trabalhos.entities.Bichinho;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        System.out.println("Um dia na vida do bichinho");

        System.out.println();
        System.out.println("Digite o nome do seu Bichinho: ");
        String nome = sc.nextLine();
        Bichinho bichinho = new Bichinho(nome);

        while (opcao != 0) {
            bichinho.menu();

            if (!sc.hasNextInt()) {
                System.out.println();
                System.out.println("Digite apenas números.");
                sc.next(); // descarta o texto inválido
                continue;
            }

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    bichinho.alimentar();
                    break;
                case 2:
                    bichinho.brincar();
                    break;
                case 3:
                    bichinho.dormir();
                    break;
                case 4:
                    if (bichinho.estaFeliz()) {
                        System.out.println("Ele está feliz");
                    } else {
                        System.out.println("Não está feliz");
                    }
                    break;
                case 5:
                    //System.out.println(bichinho);
                    bichinho.status();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
