package Aplication;
import java.util.Locale;
import java.util.Scanner;
import aula01.Alunos;

public class Geral {
    public static void main (String args[]){
        Scanner sx = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a quantidade de alunos: ");
        int quantidade = sx.nextInt();

        for (int i = 0;  i < quantidade; i++){

            Alunos x = new Alunos();
            System.out.println("Digite o nome do aluno abaixo: ");

            x.nome = sx.next();

            System.out.println("Digite a primeira nota");
            x.nota01 = sx.nextDouble();

            System.out.println("Digite a segunda nota");
            x.nota02 = sx.nextDouble();

            System.out.println("Digite a terceira nota");
            x.nota03 = sx.nextDouble();

            double media = x.media();

            System.out.printf("O nome do aluno é %s e as notas dele são respectivamente: %.1f, %.1f, %.1f e a media é %.1f%n", x.nome, x.nota01, x.nota02, x.nota03, media);

        }
sx.close();
    }
}
