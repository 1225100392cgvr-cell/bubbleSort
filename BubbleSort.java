import java.util.Arrays;

public class BubbleSort {

    // 1. Método bubbleSort(int[] arreglo): traducción del pseudocódigo
    public static void bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        int comparaciones = 0, intercambios = 0, pasadas = 0;
        boolean huboIntercambio;
        int pasada = 1;

        System.out.println("Inicial:  " + Arrays.toString(arreglo));

        do {
            huboIntercambio = false;
            for (int i = 0; i < n - pasada; i++) {
                comparaciones++;
                if (arreglo[i] > arreglo[i + 1]) {
                    int auxiliar = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = auxiliar;
                    intercambios++;
                    huboIntercambio = true;
                }
            }
            pasadas++;
            // 2. Mostrar el arreglo después de cada pasada
            System.out.println("Pasada " + pasada + ": " + Arrays.toString(arreglo));
            pasada++;
        } while (huboIntercambio && pasada < n);

        // 3. Totales
        System.out.println("Total de comparaciones: " + comparaciones);
        System.out.println("Total de intercambios:  " + intercambios);
        System.out.println("Total de pasadas:       " + pasadas);
        System.out.println();
    }

    // 5. Variación opcional: String[] con compareTo
    public static void bubbleSort(String[] arreglo) {
        int n = arreglo.length;
        int comparaciones = 0, intercambios = 0, pasadas = 0;
        boolean huboIntercambio;
        int pasada = 1;

        System.out.println("Inicial:  " + Arrays.toString(arreglo));

        do {
            huboIntercambio = false;
            for (int i = 0; i < n - pasada; i++) {
                comparaciones++;
                if (arreglo[i].compareTo(arreglo[i + 1]) > 0) {
                    String auxiliar = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = auxiliar;
                    intercambios++;
                    huboIntercambio = true;
                }
            }
            pasadas++;
            System.out.println("Pasada " + pasada + ": " + Arrays.toString(arreglo));
            pasada++;
        } while (huboIntercambio && pasada < n);

        System.out.println("Total de comparaciones: " + comparaciones);
        System.out.println("Total de intercambios:  " + intercambios);
        System.out.println("Total de pasadas:       " + pasadas);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Arreglo del pseudocódigo {10, 3, 7, 6, 17} ===");
        bubbleSort(new int[]{10, 3, 7, 6, 17});

        // 4. Pruebas pedidas
        System.out.println("=== Arreglo {34, 12, 25, 8, 19} ===");
        bubbleSort(new int[]{34, 12, 25, 8, 19});

        System.out.println("=== Arreglo ya ordenado ===");
        bubbleSort(new int[]{8, 12, 19, 25, 34});

        System.out.println("=== Arreglo en orden inverso ===");
        bubbleSort(new int[]{34, 25, 19, 12, 8});

        System.out.println("=== Variación opcional: String[] ===");
        bubbleSort(new String[]{"Luis", "Ana", "Carlos", "Beatriz", "Diana"});
    }
}