package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort.service;

public class BubbleSort {

    public void bubbleSort1(String[] arreglo) {
        int n = arreglo.length;
        for (int x = 0; x < arreglo.length; x++) {
            for (int y = 0; y < arreglo.length - 1; y++) {
                String elementoActual = arreglo[y],
                        elementoSiguiente = arreglo[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {
                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }
        for (int i=0; i<n; ++i)
            System.out.print(" | "+arreglo[i] + " | ");
        System.out.println();
    }
}
