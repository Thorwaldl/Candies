import java.util.ArrayList;
import java.util.List;

public class DistribuicaoDoces {
    public static void main(String[] args) {
       
    }
    public static int doces(int n, int[] arr, List<Integer> distribuicao) {
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = 1;  // Inicialmente, cada criança recebe pelo menos 1 doce
        }

        // Verifica da esquerda para a direita
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Verifica da direita para a esquerda
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
        }

        // Calcula o número total mínimo de doces necessários
        int totalCandies = 0;
        for (int i = 0; i < n; i++) {
            totalCandies += candies[i];
            distribuicao.add(candies[i]);  // Adiciona a distribuição ideal à lista
        }

        return totalCandies;
    }
}
