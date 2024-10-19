package sala;

import asiento.Asiento;

public class Sala {
    public int numSala;
    public int numFilas;
    public int numColumnas;

    // Generar Asientos por default
    public Sala(){
        Asiento[][] asientos = new Asiento[numFilas][numColumnas]; 
        char letraFila = 'A';
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                Asiento asiento = new Asiento(letraFila, j + 1);
                asientos[i][j] = asiento;
            }
            letraFila++;
        }

        // Imprimir 
        System.out.println("Asientos:");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print(asientos[i][j].columna + asientos[i][j].fila);
            }
            System.out.println();
        }
    }



}
