import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // lê a quantidade N de posições do vetor
        double[] vect = new double[n]; // instancia o vetor passando a quantidade de posições

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble(); //loop for para percorrer todas as posiçoes do vetor e armazenar os dados
        }

        double sum = 0.0;
        for (int i = 0; i < n ; i++){
            sum += vect[i]; //  loop for para somar todos os dados do vetor e guardar na variavel sum
        }

        double avg = sum / n; // calculo da media dividindo a soma pela quantidade de posições do vetor

        System.out.printf("Altura média: %.2f%n ", avg); // exibir a media formatada

    }
}
