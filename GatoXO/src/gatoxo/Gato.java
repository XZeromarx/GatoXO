package gatoXO;

import java.util.Scanner;

/**
 *
 * @author XZeroMarx
 */
public class Gato {

    String[][] m = new String[3][3];
    Scanner scan = new Scanner(System.in);
    private String gatito;
    private String resultadoP1;
    private String resultadoP2;
    private String peticion;
    byte jugadas = 0;

    public String getPeticion() {
        return peticion;
    }

    public void setPeticion() {
        System.out.print("Desea Seguir Jugando?");
        System.out.println("1.- Si , 2.- No");
        System.out.println("introduzca 1 o 2: ");
        String resp = scan.nextLine();
        if ("1".equalsIgnoreCase(resp)) {
            peticion = "si";
        } else if ("2".equalsIgnoreCase(resp)) {
            peticion = "no";

        }

    }

    public String getResultadoP1() {
        if ("X".equalsIgnoreCase(m[0][0]) && "X".equalsIgnoreCase(m[0][1]) && "X".equalsIgnoreCase(m[0][2])) {
            resultadoP1 = "game!";
        } else if ("X".equalsIgnoreCase(m[1][0]) && "X".equalsIgnoreCase(m[1][1]) && "X".equalsIgnoreCase(m[1][2])) {
            resultadoP1 = "game!";

        } else if ("X".equalsIgnoreCase(m[2][0]) && "X".equalsIgnoreCase(m[2][1]) && "X".equalsIgnoreCase(m[2][2])) {
            resultadoP1 = "game!";

        } else if ("X".equalsIgnoreCase(m[0][0]) && "X".equalsIgnoreCase(m[1][0]) && "X".equalsIgnoreCase(m[2][0])) {
            resultadoP1 = "game!";

        } else if ("X".equalsIgnoreCase(m[0][1]) && "X".equalsIgnoreCase(m[1][1]) && "X".equalsIgnoreCase(m[2][1])) {
            resultadoP1 = "game!";

        } else if ("X".equalsIgnoreCase(m[0][2]) && "X".equalsIgnoreCase(m[1][2]) && "X".equalsIgnoreCase(m[2][2])) {
            resultadoP1 = "game!";

        } else if ("X".equalsIgnoreCase(m[0][0]) && "X".equalsIgnoreCase(m[1][1]) && "X".equalsIgnoreCase(m[2][2])) {
            resultadoP1 = "game!";

        } else if ("X".equalsIgnoreCase(m[2][0]) && "X".equalsIgnoreCase(m[1][1]) && "X".equalsIgnoreCase(m[0][2])) {
            resultadoP1 = "game!";

        } else {
            
            if (jugadas >= 9) {
                resultadoP1 = "tie";
            }

        }
        return resultadoP1;
    }

    public String getResultadoP2() {
        if ("O".equalsIgnoreCase(m[0][0]) && "O".equalsIgnoreCase(m[0][1]) && "O".equalsIgnoreCase(m[0][2])) {
            resultadoP2 = "game2!";
        } else if ("O".equalsIgnoreCase(m[1][0]) && "O".equalsIgnoreCase(m[1][1]) && "O".equalsIgnoreCase(m[1][2])) {
            resultadoP2 = "game2!";

        } else if ("O".equalsIgnoreCase(m[2][0]) && "O".equalsIgnoreCase(m[2][1]) && "O".equalsIgnoreCase(m[2][2])) {
            resultadoP2 = "game2!";

        } else if ("O".equalsIgnoreCase(m[0][0]) && "O".equalsIgnoreCase(m[1][0]) && "O".equalsIgnoreCase(m[2][0])) {
            resultadoP2 = "game2!";

        } else if ("O".equalsIgnoreCase(m[0][1]) && "O".equalsIgnoreCase(m[1][1]) && "O".equalsIgnoreCase(m[2][1])) {
            resultadoP2 = "game2!";

        } else if ("O".equalsIgnoreCase(m[0][2]) && "O".equalsIgnoreCase(m[1][2]) && "O".equalsIgnoreCase(m[2][2])) {
            resultadoP2 = "game2!";

        } else if ("O".equalsIgnoreCase(m[0][0]) && "O".equalsIgnoreCase(m[1][1]) && "O".equalsIgnoreCase(m[2][2])) {
            resultadoP2 = "game2!";

        } else if ("O".equalsIgnoreCase(m[2][0]) && "O".equalsIgnoreCase(m[1][1]) && "O".equalsIgnoreCase(m[0][2])) {
            resultadoP2 = "game2!";

        } else {
            
            if (jugadas >= 9) {
                resultadoP2 = "tie";
            }

        }

        return resultadoP2;
    }

    public Gato() {
    }

    public String getGato() {

        for (byte i = 0; i < m.length; i++) {
            for (byte j = 0; j < m[i].length; j++) {
                System.out.print("   " + m[i][j] + "   ");
            }
            System.out.println("");
        }

        return gatito;
    }

    public void setM(int i, int j, String k) {

        m[i][j] = k;

    }

    public void setGatoDefault() {
        for (byte i = 0; i < m.length; i++) {
            for (byte j = 0; j < m[i].length; j++) {
                m[i][j] = "*";
            }
        }
    }

}
