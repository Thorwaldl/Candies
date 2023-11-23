import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de crianças na turma: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Digite as avaliações de cada aluno, uma por linha:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> distribuicao = new ArrayList<>();
        int resultado = DistribuicaoDoces.doces(n, arr, distribuicao);

        System.out.println("Número mínimo de doces que Alice deve comprar: " + resultado);
        System.out.println("Distribuição ideal dos doces: " + distribuicao);
    }
}
