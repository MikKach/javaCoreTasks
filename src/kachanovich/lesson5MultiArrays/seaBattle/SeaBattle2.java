package kachanovich.lesson5MultiArrays.seaBattle;

import java.util.Random;

public class SeaBattle2 {
    public static void main(String[] args) {
        Random random = new Random();

        //создаем поле
        String[][] field = new String[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = "-";
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // расставляем корабли
        int indexX;
        int indexY;
        int x, y;
        int shipPosition;
        boolean shipCreated;
        boolean marker;
        // задаем количество палуб
        for (int numberShipDecks = 3; numberShipDecks >= 0; numberShipDecks--) {
            // задаем количество кораблей одного вида
            for (int numberShip = 1; numberShip <= 4 - numberShipDecks; numberShip++) {
                int countShip = 1;
                while (countShip > 0) {
                    // создаем стартовую точку для корабля
                    indexX = random.nextInt(0, 10);
                    indexY = random.nextInt(0, 10);
                    shipCreated = false;
                    marker = true;
                    // задаем позицию корабля на поле
                    shipPosition = random.nextInt(0, 4);

                    switch (shipPosition) {
                        //слева направо
                        case 0:
                            if ((indexY + numberShipDecks) < 10 && field[indexX][indexY] == "-") {
                                //поклеточная проверка на возможность расположения корабля
                                for (int k = indexY; k <= indexY + numberShipDecks; k++) {
                                    if (field[indexX][k] != "-") {
                                        marker = false;
                                        break;
                                    }
                                }
                                // располагаем корабль
                                if (marker) {
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        field[indexX][indexY + k] = "X";
                                    }

                                    // обводим корабль маркерами "0"
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        x = indexX;
                                        y = indexY + k;
                                        for (int i = (x - 1); i < (x + 2); i++) {
                                            for (int j = (y - 1); j < (y + 2); j++) {
                                                if (i >= 0 && i <= 9 && j >= 0 && j <= 9 && field[i][j] != "X") {
                                                    field[i][j] = "*";
                                                }
                                            }
                                        }
                                    }

                                    countShip--;
                                    break;
                                }
                            }

                            //сверху вниз
                        case 1:
                            if ((indexX + numberShipDecks) < 10 && field[indexX][indexY] == "-") {
                                //поклеточная проверка на возможность расположения корабля
                                for (int k = indexX; k <= indexX + numberShipDecks; k++) {
                                    if (field[k][indexY] != "-") {
                                        marker = false;
                                        break;
                                    }
                                }

                                // располагаем корабль
                                if (marker) {
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        field[indexX + k][indexY] = "X";
                                    }

                                    // обводим корабль маркерами "0"
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        x = indexX + k;
                                        y = indexY;
                                        for (int i = (x - 1); i < (x + 2); i++) {
                                            for (int j = (y - 1); j < (y + 2); j++) {
                                                if (i >= 0 && i <= 9 && j >= 0 && j <= 9 && field[i][j] != "X") {
                                                    field[i][j] = "*";
                                                }
                                            }
                                        }
                                    }

                                    countShip--;
                                    break;
                                }
                            }

                            //справа налево
                        case 2:
                            if ((indexY - numberShipDecks) > -1 && field[indexX][indexY] == "-") {
                                //поклеточная проверка на возможность расположения корабля
                                for (int k = indexY; k >= indexY - numberShipDecks; k--) {
                                    if (field[indexX][k] != "-") {
                                        marker = false;
                                        break;
                                    }
                                }

                                // располагаем корабль
                                if (marker) {
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        field[indexX][indexY - k] = "X";
                                    }

                                    // обводим корабль маркерами "0"
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        x = indexX;
                                        y = indexY - k;
                                        for (int i = (x - 1); i < (x + 2); i++) {
                                            for (int j = (y - 1); j < (y + 2); j++) {
                                                if (i >= 0 && i <= 9 && j >= 0 && j <= 9 && field[i][j] != "X") {
                                                    field[i][j] = "*";
                                                }
                                            }
                                        }
                                    }


                                    countShip--;
                                    break;
                                }
                            }

                            // снизу вверх
                        case 3:
                            if ((indexX - numberShipDecks) > -1 && field[indexX][indexY] == "-") {
                                //поклеточная проверка на возможность расположения корабля
                                for (int k = indexX; k >= indexX - numberShipDecks; k--) {
                                    if (field[k][indexY] != "-") {
                                        marker = false;
                                        break;
                                    }
                                }

                                // располагаем корабль
                                if (marker) {
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        field[indexX - k][indexY] = "X";
                                    }

                                    // обводим корабль маркерами "0"
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        x = indexX - k;
                                        y = indexY;
                                        for (int i = (x - 1); i < (x + 2); i++) {
                                            for (int j = (y - 1); j < (y + 2); j++) {
                                                if (i >= 0 && i <= 9 && j >= 0 && j <= 9 && field[i][j] != "X") {
                                                    field[i][j] = "*";
                                                }
                                            }
                                        }
                                    }

                                    countShip--;
                                    break;
                                }
                            }
                    }
                }
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == "*") {
                    field[i][j] = "-";
                }
            }
        }
        // выводим расположение кораблей
        System.out.println("Получили");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
