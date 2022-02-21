/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundirlaflota_aitor;

/**
 *
 * @author Aitor
 */
public class Barcos {

    /**
     * Metodo para generar numeros Aleatorios entre el 0 y 10.
     *
     * @return Devuelve un numero entero aleatorio entre 0 y 10.
     */
    public static int numeroRandom() {
        return (int) (Math.random() * 10);
    }

    /**
     * Metodo para insertar barcos de una casiila.
     *
     * @param tablero Matriz de tipo char donde se van ha insertar la lancha.
     */
    public static void insertarLancha(char[][] tablero) {
        int rng1 = numeroRandom(), rng2 = numeroRandom();
        boolean exit = false;
        if (tablero[rng1][rng2] == '-') {
            tablero[rng1][rng2] = 'L';
        } else {
            do {
                exit = true;
                rng1 = numeroRandom();
                rng2 = numeroRandom();
                if (tablero[rng1][rng2] == '-') {
                    tablero[rng1][rng2] = 'L';
                    exit = false;
                }
            } while (exit);
        }
    }

    /**
     * Metodo para insertar barcos de tres casillas en horizontal.
     *
     * @param tablero Matriz de tipo char donde se van ha insertar el buque.
     */
    public static void insertarBuque(char[][] tablero) {
        int rng1 = numeroRandom(), rng2 = numeroRandom();
        boolean exit = true;
        do {
            if (tablero[rng1][rng2] == '-' && (rng2 + 2) < 10) {
                tablero[rng1][rng2] = 'B';
                if (tablero[rng1][rng2 + 1] == '-') {
                    tablero[rng1][rng2 + 1] = 'B';
                    if (tablero[rng1][rng2 + 2] == '-') {
                        tablero[rng1][rng2 + 2] = 'B';
                        exit = false;
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1][rng2 + 1] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                } else {
                    tablero[rng1][rng2] = '-';
                    rng1 = numeroRandom();
                    rng2 = numeroRandom();
                }

            } else if (tablero[rng1][rng2] == '-' && (rng2 + 2) > 10) {
                tablero[rng1][rng2] = 'B';
                if ((rng2 + 1) == 9 && tablero[rng1][rng2 + 1] == '-') {
                    tablero[rng1][rng2 + 1] = 'B';
                    if (tablero[rng1][rng2 - 1] == '-') {
                        tablero[rng1][rng2 - 1] = 'B';
                        exit = false;
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1][rng2 + 1] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                } else if (tablero[rng1][rng2 - 1] == '-') {
                    tablero[rng1][rng2 - 1] = 'B';
                    if (tablero[rng1][rng2 - 2] == '-') {
                        tablero[rng1][rng2 - 2] = 'B';
                        exit = false;
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1][rng2 - 1] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                }
            } else {
                rng1 = numeroRandom();
                rng2 = numeroRandom();
                exit = true;
            }
        } while (exit);

    }

    /**
     * Metodo para insertar un barco de cuatro casillas en horizontal.
     *
     * @param tablero Matriz de tipo char donde se van ha insertar el acorazado.
     */
    public static void insertarAcorazado(char[][] tablero) {
        int rng1 = numeroRandom(), rng2 = numeroRandom();
        boolean exit = true;
        do {
            if (tablero[rng1][rng2] == '-' && (rng2 + 3) < 10) {
                tablero[rng1][rng2] = 'Z';
                if (tablero[rng1][rng2 + 1] == '-') {
                    tablero[rng1][rng2 + 1] = 'Z';
                    if (tablero[rng1][rng2 + 2] == '-') {
                        tablero[rng1][rng2 + 2] = 'Z';
                        if (tablero[rng1][rng2 + 3] == '-') {
                            tablero[rng1][rng2 + 3] = 'Z';
                            exit = false;
                        } else {
                            tablero[rng1][rng2] = '-';
                            tablero[rng1][rng2 + 1] = '-';
                            tablero[rng1][rng2 + 2] = '-';
                            rng1 = numeroRandom();
                            rng2 = numeroRandom();
                        }
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1][rng2 + 1] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                } else {
                    tablero[rng1][rng2] = '-';
                    rng1 = numeroRandom();
                    rng2 = numeroRandom();
                }

            } else if (tablero[rng1][rng2] == '-' && (rng2 + 3) >= 10) {
                tablero[rng1][rng2] = 'Z';
                if ((rng2 + 2) == 9 && tablero[rng1][rng2 + 2] == '-') {
                    tablero[rng1][rng2 + 2] = 'Z';
                    if (tablero[rng1][rng2 + 1] == '-') {
                        tablero[rng1][rng2 + 1] = 'Z';
                        if (tablero[rng1][rng2 - 1] == '-') {
                            tablero[rng1][rng2 - 1] = 'Z';
                            exit = false;
                        } else {
                            tablero[rng1][rng2] = '-';
                            tablero[rng1][rng2 + 2] = '-';
                            tablero[rng1][rng2 + 1] = '-';
                            rng1 = numeroRandom();
                            rng2 = numeroRandom();
                        }
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1][rng2 + 2] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                } else if ((rng2 + 1) == 9 && tablero[rng1][rng2 + 1] == '-') {
                    tablero[rng1][rng2 + 1] = 'Z';
                    if (tablero[rng1][rng2 - 1] == '-') {
                        tablero[rng1][rng2 - 1] = 'Z';
                        if (tablero[rng1][rng2 - 2] == '-') {
                            tablero[rng1][rng2 - 2] = 'Z';
                            exit = false;
                        } else {
                            tablero[rng1][rng2] = '-';
                            tablero[rng1][rng2 + 1] = '-';
                            tablero[rng1][rng2 - 1] = '-';
                            rng1 = numeroRandom();
                            rng2 = numeroRandom();
                        }
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1][rng2 + 1] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                } else if ((rng2 + 1) > 9 && tablero[rng1][rng2 - 1] == '-') {
                    tablero[rng1][rng2 - 1] = 'Z';
                    if (tablero[rng1][rng2 - 2] == '-') {
                        tablero[rng1][rng2 - 2] = 'Z';
                        if (tablero[rng1][rng2 - 3] == '-') {
                            tablero[rng1][rng2 - 3] = 'Z';
                            exit = false;
                        } else {
                            tablero[rng1][rng2] = '-';
                            tablero[rng1][rng2 - 1] = '-';
                            tablero[rng1][rng2 - 2] = '-';
                            rng1 = numeroRandom();
                            rng2 = numeroRandom();
                        }
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1][rng2 - 1] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                }
            } else {
                rng1 = numeroRandom();
                rng2 = numeroRandom();
                exit = true;
            }
        } while (exit);
    }

    /**
     * Metodo para insertar un barco de cinco casillas en vertical.
     *
     * @param tablero Matriz de tipo char donde se van ha insertar el
     * Portaaviones.
     */
    public static void insertarPortaAviones(char[][] tablero) {
        int rng1 = numeroRandom(), rng2 = numeroRandom();
        boolean exit = true;
        do {
            if (tablero[rng1][rng2] == '-' && (rng1 + 4) < 10) {
                tablero[rng1][rng2] = 'P';
                if (tablero[rng1 + 1][rng2] == '-') {
                    tablero[rng1 + 1][rng2] = 'P';
                    if (tablero[rng1 + 2][rng2] == '-') {
                        tablero[rng1 + 2][rng2] = 'P';
                        if (tablero[rng1 + 3][rng2] == '-') {
                            tablero[rng1 + 3][rng2] = 'P';
                            if (tablero[rng1 + 4][rng2] == '-') {
                                tablero[rng1 + 4][rng2] = 'P';
                                exit = false;
                            } else {
                                tablero[rng1][rng2] = '-';
                                tablero[rng1 + 1][rng2] = '-';
                                tablero[rng1 + 2][rng2] = '-';
                                tablero[rng1 + 3][rng2] = '-';
                                rng1 = numeroRandom();
                                rng2 = numeroRandom();
                            }
                        } else {
                            tablero[rng1][rng2] = '-';
                            tablero[rng1 + 1][rng2] = '-';
                            tablero[rng1 + 2][rng2] = '-';
                            rng1 = numeroRandom();
                            rng2 = numeroRandom();
                        }
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1 + 1][rng2] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                } else {
                    tablero[rng1][rng2] = '-';
                    rng1 = numeroRandom();
                    rng2 = numeroRandom();
                }
            } else if (tablero[rng1][rng2] == '-' && (rng1 + 4) >= 10) {
                tablero[rng1][rng2] = 'P';
                if ((rng1 + 3) == 9 && tablero[rng1 + 3][rng2] == '-') {
                    tablero[rng1 + 3][rng2] = 'P';
                    if (tablero[rng1 + 2][rng2] == '-') {
                        tablero[rng1 + 2][rng2] = 'P';
                        if (tablero[rng1 + 1][rng2] == '-') {
                            tablero[rng1 + 1][rng2] = 'P';
                            if (tablero[rng1 - 1][rng2] == '-') {
                                tablero[rng1 - 1][rng2] = 'P';
                                exit = false;
                            } else {
                                tablero[rng1][rng2] = '-';
                                tablero[rng1 + 3][rng2] = '-';
                                tablero[rng1 + 2][rng2] = '-';
                                tablero[rng1 + 1][rng2] = '-';
                                rng1 = numeroRandom();
                                rng2 = numeroRandom();
                            }
                        } else {
                            tablero[rng1][rng2] = '-';
                            tablero[rng1 + 3][rng2] = '-';
                            tablero[rng1 + 2][rng2] = '-';
                            rng1 = numeroRandom();
                            rng2 = numeroRandom();
                        }
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1 + 3][rng2] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                } else if ((rng1 + 2) == 9 && tablero[rng1 + 2][rng2] == '-') {
                    tablero[rng1 + 2][rng2] = 'P';
                    if (tablero[rng1 + 1][rng2] == '-') {
                        tablero[rng1 + 1][rng2] = 'P';
                        if (tablero[rng1 - 1][rng2] == '-') {
                            tablero[rng1 - 1][rng2] = 'P';
                            if (tablero[rng1 - 2][rng2] == '-') {
                                tablero[rng1 - 2][rng2] = 'P';
                                exit = false;
                            } else {
                                tablero[rng1][rng2] = '-';
                                tablero[rng1 + 2][rng2] = '-';
                                tablero[rng1 + 1][rng2] = '-';
                                tablero[rng1 - 1][rng2] = '-';
                                rng1 = numeroRandom();
                                rng2 = numeroRandom();
                            }
                        } else {
                            tablero[rng1][rng2] = '-';
                            tablero[rng1 + 2][rng2] = '-';
                            tablero[rng1 - 1][rng2] = '-';
                            rng1 = numeroRandom();
                            rng2 = numeroRandom();
                        }
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1 + 2][rng2] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                } else if ((rng1 + 1) == 9 && tablero[rng1 + 1][rng2] == '-') {
                    tablero[rng1 + 1][rng2] = 'P';
                    if (tablero[rng1 - 1][rng2] == '-') {
                        tablero[rng1 - 1][rng2] = 'P';
                        if (tablero[rng1 - 2][rng2] == '-') {
                            tablero[rng1 - 2][rng2] = 'P';
                            if (tablero[rng1 - 3][rng2] == '-') {
                                tablero[rng1 - 3][rng2] = 'P';
                                exit = false;
                            } else {
                                tablero[rng1][rng2] = '-';
                                tablero[rng1 + 1][rng2] = '-';
                                tablero[rng1 - 1][rng2] = '-';
                                tablero[rng1 - 2][rng2] = '-';
                                rng1 = numeroRandom();
                                rng2 = numeroRandom();
                            }
                        } else {
                            tablero[rng1][rng2] = '-';
                            tablero[rng1 + 1][rng2] = '-';
                            tablero[rng1 - 1][rng2] = '-';
                            rng1 = numeroRandom();
                            rng2 = numeroRandom();
                        }
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1 + 1][rng2] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                } else if ((rng1 + 1) > 9 && tablero[rng1 - 1][rng2] == '-') {
                    tablero[rng1 - 1][rng2] = 'P';
                    if (tablero[rng1 - 2][rng2] == '-') {
                        tablero[rng1 - 2][rng2] = 'P';
                        if (tablero[rng1 - 3][rng2] == '-') {
                            tablero[rng1 - 3][rng2] = 'P';
                            if (tablero[rng1 - 4][rng2] == '-') {
                                tablero[rng1 - 4][rng2] = 'P';
                                exit = false;
                            } else {
                                tablero[rng1][rng2] = '-';
                                tablero[rng1 - 1][rng2] = '-';
                                tablero[rng1 - 2][rng2] = '-';
                                tablero[rng1 - 3][rng2] = '-';
                                rng1 = numeroRandom();
                                rng2 = numeroRandom();
                            }
                        } else {
                            tablero[rng1][rng2] = '-';
                            tablero[rng1 - 1][rng2] = '-';
                            tablero[rng1 - 2][rng2] = '-';
                            rng1 = numeroRandom();
                            rng2 = numeroRandom();
                        }
                    } else {
                        tablero[rng1][rng2] = '-';
                        tablero[rng1 - 1][rng2] = '-';
                        rng1 = numeroRandom();
                        rng2 = numeroRandom();
                    }
                }
            } else {
                rng1 = numeroRandom();
                rng2 = numeroRandom();
                exit = true;
            }

        } while (exit);
    }
}
