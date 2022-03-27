package kachanovich.lesson5MultiArrays.seaBattle;

import java.util.Random;
import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String playerOne = scanner.next();
        scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String playerTwo = scanner.next();
        scanner.nextLine();
        System.out.printf("Поле игрока %s cоздано\n", playerOne);
        String[][] fieldPlayerOne = fieldPlayerOne();
        System.out.printf("Поле игрока %s cоздано\n", playerTwo);
        String[][] fieldPlayerTwo = fieldPlayerOne();
        System.out.print("Показать поле? (y/n)");
        String answerField = scanner.next();
        System.out.println(answerField);
        if (answerField == "y" || answerField == "Y") {
            startMenu(playerOne, playerTwo, fieldPlayerOne, fieldPlayerTwo);
        }

    }

    public static void startMenu(String playerOne, String playerTwo, String[][] fieldPlayerOne, String[][] fieldPlayerTwo) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("1 - Поле игрока %s\n", playerOne);
            System.out.printf("2 - Поле игрока %s\n", playerTwo);
            System.out.printf("3 - Игра\n");
            int answerFieldPlayer = scanner.nextInt();
            switch (answerFieldPlayer) {
                case 1: {
                    printField(fieldPlayerOne);
                    break;
                }
                case 2: {
                    printField(fieldPlayerTwo);
                    break;
                }
            }
            if (answerFieldPlayer == 3) {
                break;
            }
        }
    }

    public static void printField(String[][] array) {
        // выводим расположение кораблей
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static String[][] fieldPlayerOne() {
        Random random = new Random();

        //создаем поле
        String[][] field = new String[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = "-";
            }
        }

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
                                        field[indexX][indexY + k] = "O";
                                    }

                                    // обводим корабль маркерами "0"
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        x = indexX;
                                        y = indexY + k;
                                        for (int i = (x - 1); i < (x + 2); i++) {
                                            for (int j = (y - 1); j < (y + 2); j++) {
                                                if (i >= 0 && i <= 9 && j >= 0 && j <= 9 && field[i][j] != "O") {
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
                                        field[indexX + k][indexY] = "O";
                                    }

                                    // обводим корабль маркерами "0"
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        x = indexX + k;
                                        y = indexY;
                                        for (int i = (x - 1); i < (x + 2); i++) {
                                            for (int j = (y - 1); j < (y + 2); j++) {
                                                if (i >= 0 && i <= 9 && j >= 0 && j <= 9 && field[i][j] != "O") {
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
                                        field[indexX][indexY - k] = "O";
                                    }

                                    // обводим корабль маркерами "0"
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        x = indexX;
                                        y = indexY - k;
                                        for (int i = (x - 1); i < (x + 2); i++) {
                                            for (int j = (y - 1); j < (y + 2); j++) {
                                                if (i >= 0 && i <= 9 && j >= 0 && j <= 9 && field[i][j] != "O") {
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
                                        field[indexX - k][indexY] = "O";
                                    }

                                    // обводим корабль маркерами "0"
                                    for (int k = 0; k <= numberShipDecks; k++) {
                                        x = indexX - k;
                                        y = indexY;
                                        for (int i = (x - 1); i < (x + 2); i++) {
                                            for (int j = (y - 1); j < (y + 2); j++) {
                                                if (i >= 0 && i <= 9 && j >= 0 && j <= 9 && field[i][j] != "O") {
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
        // удаляем маркеры *
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == "*") {
                    field[i][j] = "-";
                }
            }
        }
        return field;
    }

}
