package gatoXO;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JuegoGato {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jugadores;
        while (true) {
            while (true) {
                System.out.println("Buen día!");
                System.out.println("Cuantas personas jugaran?");
                System.out.println("1 jugador (contra la computadora)");
                System.out.println("2 jugadores");
                System.out.print("ingrese 1 o 2: ");
                jugadores = scan.nextLine();

                if ("1".equals(jugadores)) {
                    System.out.println("a elejido el modo de 1 jugador.");

                    break;
                } else if ("2".equals(jugadores)) {
                    System.out.println("a elejido el modo de 2 jugadores.");
                    break;
                } else {
                    System.out.println("No ha elejido una opcion valida");
                    System.out.println("intente nevamente");
                }
            }

            Gato gato = new Gato();
            //inicializacion de variables

            System.out.println("Comienza el juego!");
            System.out.println("");
            gato.setGatoDefault();
            gato.getGato();

            boolean num1 = false;
            boolean num2 = false;
            boolean num3 = false;
            boolean num4 = false;
            boolean num5 = false;
            boolean num6 = false;
            boolean num7 = false;
            boolean num8 = false;
            boolean num9 = false;

            //ciclo del juego
            while (true) {

                OUTER_1:
                while (true) {
                    System.out.println("Jugador 1");
                    System.out.print("seleccione el espacio: ");
                    String op = scan.nextLine();
                    switch (op) {
                        case "1":
                            if (num1 == false) {
                                gato.jugadas += 1;
                                gato.setM(2, 0, "X");
                                num1 = true;
                                break OUTER_1;
                            } else {
                                System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            }
                            break;
                        case "2":
                            if (num2 == false) {
                                gato.jugadas += 1;
                                gato.setM(2, 1, "X");
                                num2 = true;
                                break OUTER_1;
                            } else {
                                System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            }
                            break;
                        case "3":
                            if (num3 == false) {
                                gato.jugadas += 1;
                                gato.setM(2, 2, "X");
                                num3 = true;
                                break OUTER_1;
                            } else {
                                System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            }
                            break;
                        case "4":
                            if (num4 == false) {
                                gato.jugadas += 1;
                                gato.setM(1, 0, "X");
                                num4 = true;
                                break OUTER_1;
                            } else {
                                System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            }
                            break;
                        case "5":
                            if (num5 == false) {
                                gato.jugadas += 1;
                                gato.setM(1, 1, "X");
                                num5 = true;
                                break OUTER_1;
                            } else {
                                System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            }
                            break;
                        case "6":
                            if (num6 == false) {
                                gato.jugadas += 1;
                                gato.setM(1, 2, "X");
                                num6 = true;
                                break OUTER_1;
                            } else {
                                System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            }
                            break;
                        case "7":
                            if (num7 == false) {
                                gato.jugadas += 1;
                                gato.setM(0, 0, "X");
                                num7 = true;
                                break OUTER_1;
                            } else {
                                System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            }
                            break;
                        case "8":
                            if (num8 == false) {
                                gato.jugadas += 1;
                                gato.setM(0, 1, "X");
                                num8 = true;
                                break OUTER_1;
                            } else {
                                System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            }
                            break;
                        case "9":
                            if (num9 == false) {
                                gato.jugadas += 1;
                                gato.setM(0, 2, "X");
                                num9 = true;
                                break OUTER_1;
                            } else {
                                System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            }
                            break;
                        default:
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                            break;
                    }
                }
                if (num1 == true && num2 == true && num3 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;

                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num4 == true && num5 == true && num6 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num7 == true && num8 == true && num9 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                    }
                }
                if (num1 == true && num4 == true && num7 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num2 == true && num5 == true && num8 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num3 == true && num6 == true && num9 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num1 == true && num5 == true && num9 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num7 == true && num5 == true && num3 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                gato.getGato();
                //while del jugador 2/computadora

                if ("1".equalsIgnoreCase(jugadores)) {
                    try {
                        System.out.println("Computadora: Buscando jugada....");
                        Thread.sleep(2000);
                        OUTER:
                        while (true) {
                            
                            Random r = new Random();
                            int num = r.nextInt(10);
                            switch (num) {
                                case 1:
                                    if (num1 == false) {
                                        gato.jugadas += 1;
                                        gato.setM(2, 0, "O");
                                        num1 = true;
                                        break OUTER;
                                    }
                                    break;
                                case 2:
                                    if (num2 == false) {
                                        gato.jugadas += 1;
                                        gato.setM(2, 1, "O");
                                        num2 = true;
                                        break OUTER;
                                    }
                                    break;
                                case 3:
                                    if (num3 == false) {
                                        gato.jugadas += 1;
                                        gato.setM(2, 2, "O");
                                        num3 = true;
                                        break OUTER;
                                    }
                                    break;
                                case 4:
                                    if (num4 == false) {
                                        gato.jugadas += 1;
                                        gato.setM(1, 0, "O");
                                        num4 = true;
                                        break OUTER;
                                    }
                                    break;
                                case 5:
                                    if (num5 == false) {
                                        gato.jugadas += 1;
                                        gato.setM(1, 1, "O");
                                        num5 = true;
                                        break OUTER;
                                    }
                                    break;
                                case 6:
                                    if (num6 == false) {
                                        gato.jugadas += 1;
                                        gato.setM(1, 2, "O");
                                        num6 = true;
                                        break OUTER;
                                    }
                                    break;
                                case 7:
                                    if (num7 == false) {
                                        gato.jugadas += 1;
                                        gato.setM(0, 0, "O");
                                        num7 = true;
                                        break OUTER;
                                    }
                                    break;
                                case 8:
                                    if (num8 == false) {
                                        gato.jugadas += 1;
                                        gato.setM(0, 1, "O");
                                        num8 = true;
                                        break OUTER;
                                    }
                                    break;
                                case 9:
                                    if (num9 == false) {
                                        gato.jugadas += 1;
                                        gato.setM(0, 2, "O");
                                        num9 = true;
                                        break OUTER;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JuegoGato.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }else if("2".equalsIgnoreCase(jugadores)){
                while (true) {

                    System.out.println("Jugador 2");
                    System.out.print("seleccione el espacio: ");
                    String op = scan.nextLine();
                    if (op.equals("1")) {
                        if (num1 == false) {
                            gato.jugadas += 1;
                            gato.setM(2, 0, "O");
                            num1 = true;
                            break;
                        } else {
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                        }
                    } else if (op.equals("2")) {
                        if (num2 == false) {
                            gato.jugadas += 1;
                            gato.setM(2, 1, "O");
                            num2 = true;
                            break;
                        } else {
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                        }
                    } else if (op.equals("3")) {
                        if (num3 == false) {
                            gato.jugadas += 1;
                            gato.setM(2, 2, "O");
                            num3 = true;
                            break;
                        } else {
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                        }
                    } else if (op.equals("4")) {
                        if (num4 == false) {
                            gato.jugadas += 1;
                            gato.setM(1, 0, "O");
                            num4 = true;
                            break;
                        } else {
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                        }
                    } else if (op.equals("5")) {
                        if (num5 == false) {
                            gato.jugadas += 1;
                            gato.setM(1, 1, "O");
                            num5 = true;
                            break;
                        } else {
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                        }
                    } else if (op.equals("6")) {
                        if (num6 == false) {
                            gato.jugadas += 1;
                            gato.setM(1, 2, "O");
                            num6 = true;
                            break;
                        } else {
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");

                        }
                    } else if (op.equals("7")) {
                        if (num7 == false) {
                            gato.jugadas += 1;
                            gato.setM(0, 0, "O");
                            num7 = true;
                            break;
                        } else {
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");

                        }
                    } else if (op.equals("8")) {
                        if (num8 == false) {
                            gato.jugadas += 1;
                            gato.setM(0, 1, "O");
                            num8 = true;
                            break;
                        } else {
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                        }
                    } else if (op.equals("9")) {
                        if (num9 == false) {
                            gato.jugadas += 1;
                            gato.setM(0, 2, "O");
                            num9 = true;
                            break;
                        } else {
                            System.out.println("Ingrese un numero del 1 al 9 y que no haya sido escogido");
                        }
                    }

                }
                }//fin del while del jugador 2
                if (num1 == true && num2 == true && num3 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;

                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num4 == true && num5 == true && num6 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num7 == true && num8 == true && num9 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                    }
                }
                if (num1 == true && num4 == true && num7 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num2 == true && num5 == true && num8 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num3 == true && num6 == true && num9 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num1 == true && num5 == true && num9 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                if (num7 == true && num5 == true && num3 == true) {
                    if ("game!".equals(gato.getResultadoP1())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 1!!! Felicidades.");
                        break;
                    } else if ("game2!".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Gana el Jugador 2!!! Felicidades.");
                        break;
                    } else if ("tie".equals(gato.getResultadoP1()) && "tie".equals(gato.getResultadoP2())) {
                        gato.getGato();
                        System.out.println("Empate!!!");
                        break;
                    }
                }
                gato.getGato();

            }//while del juego
            gato.setPeticion();
            if ("no".equalsIgnoreCase(gato.getPeticion())) {
                System.out.println("Gracias por jugar. que tenga buen dia.");
                break;
            }

        }//while general
    }
}
