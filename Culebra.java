import java.util.Scanner;

public class Culebra {

    //funciones utiles
    public static void mostrarMatriz(String[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }//mostrar matriz


    //main
    public static void main(String[] args) {
        boolean terminar = false;
        char accion;
        int i, j;
        Scanner teclado = new Scanner(System.in);
        String[][] Tablero = new String[10][10];

        for (i = 0; i < Tablero.length; i++) {
            for (j = 0; j < Tablero[i].length; j++) {
                Tablero[i][j] = ("□");
            }
        }
        for (i = 0; i < 1; i++) {
            for (j = 0; j < 6; j++) {
                Tablero[i][j] = ("∞");
            }
        }


        System.out.println("Muevase con las teclas W A S D \n W=arriba \n A=izquierda \n S=abajo \n D=derecha \n Si desea salir presione Q");
        while (terminar == false) {
            mostrarMatriz(Tablero);

            accion = teclado.next().charAt(0);
            switch (accion) {
                case 'w': break;
            }
            if (accion == 'Q') {
                terminar = true;
                System.out.println("Game over");
            }/* else {
                if (accion == 'W') {
                    Tablero[i+1][j]="∞";
                    Tablero[i-1][j]="□";
                } else {
                    if (accion == 'A') {
                        Tablero [i][j-1]="∞";
                        Tablero [i][j+1]="□";
                    } else {
                        if (accion == 'S') {
                            Tablero[i-1][j]="∞";
                            Tablero[i+1][j]="□";
                        } else {
                            if (accion == 'D') {
                                Tablero[i][j+1]="∞";
                                Tablero[i][j-1]="□";
                            }
                        }
                    }
                }
            }*///fin if's
        }//fin while


    }//fin main
}//fin class
