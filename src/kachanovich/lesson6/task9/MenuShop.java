package kachanovich.lesson6.task9;

import java.util.Scanner;

public class MenuShop {
    Scanner scanner = new Scanner(System.in);
    InternetShop internetShop;
    User user;

    public MenuShop(InternetShop internetShop) {
        this.internetShop = internetShop;

    }

    public void menuStart() {
        while (true) {
            System.out.print("\n");
            System.out.print("\tМагазин 'Толстячок'\n");
            System.out.print("\n");
            System.out.print("\tГлавное меню\n");
            System.out.print("1 - Вход\n");
            System.out.print("2 - Регистрация нового пользователя\n");
            System.out.print("3 - Выход\n");
            System.out.print(": ");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1: {
                    menuRegistration();
                    System.exit(0);
                }
                case 2: {
                    menuNewUser();
                }
                case 3: {
                    System.exit(0);
                }
            }
            if (num != 1 && num != 2) {
                System.out.println("Неверный пункт меню");
            }
        }
    }

    private void menuNewUser() {
        System.out.print("\n");
        System.out.print("Новый пользователь\n");
        System.out.print("Введите логин: ");
        String login = scanner.next();
        scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.next();
        scanner.nextLine();
        user = new User(login, password);
        internetShop.setUserArray(user);
        menuListCategory();
    }

    private void menuRegistration() {//TODO
        System.out.print("Введите логин: ");
        String log = scanner.next();
        for (int i = 0; i < internetShop.getUserArray().length; i++) {
            if (log.equals(internetShop.getUserArray()[i].getLogin())) {
                System.out.print("Введите пароль: ");
                String pas = scanner.next();
                if (pas.equals(internetShop.getUserArray()[i].getPassword())) {

                }
            }
        }
    }

    private void menuListCategory() {
        while (true) {
            System.out.print("\n");
            System.out.print("\tМеню\n");
            System.out.print("1 - Выход\n");
            System.out.print("2 - Главное меню\n");
            System.out.printf("3 - Корзина пользователя %s\n", user.getLogin());
            System.out.print("\tСписок каталогов\n");
            for (int i = 0; i < internetShop.getCategoryArray().length; i++) {
                System.out.printf("%d - %s\n", i + 4, internetShop.getCategoryArray()[i].getCategoryName());
            }
            System.out.print(": ");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1: {
                    System.exit(0);
                }
                case 2: {
                    menuStart();
                }
                case 3: {
                    menuBasket(user);
                }
            }
            if (num < 1 || num > internetShop.getCategoryArray().length + 3) {
                System.out.print("Неверный пункт меню\nСделайте выбор\n");
                continue;
            }
            for (int i = 0; i < internetShop.getCategoryArray().length; i++) {
                if (i == num - 4) {
                    menuCategory(internetShop.getCategoryArray()[i]);
                }
            }
        }
    }


    private void menuCategory(Category category) {
        while (true) {
            System.out.print("\n");
            System.out.print("\tМеню\n");
            System.out.print("1 - Выход\n");
            System.out.print("2 - Главное меню\n");
            System.out.print("3 - Список каталогов\n");
            System.out.printf("4 - Корзина пользователя %s\n", user.getLogin());
            System.out.printf("\tКаталог: %s\n", category.getCategoryName());
            for (int i = 0; i < category.getProductsArray().length; i++) {
                System.out.printf("%d - %s %s\n", i + 5, category.getCategoryName(), category.getProductsArray()[i].getProductName());
            }
            System.out.print(": ");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1: {
                    System.exit(0);
                }
                case 2: {
                    menuStart();
                }
                case 3: {
                    menuListCategory();
                }
                case 4: {
                    menuBasket(user);
                }
            }
            if (num < 1 | num > category.getProductsArray().length + 4) {
                System.out.print("Неверный пункт меню\nСделайте выбор\n");
                continue;
            }
            for (int i = 0; i < category.getProductsArray().length; i++) {
                if (i == num - 5) {
                    menuProduct(category.getProductsArray()[i]);
                }
            }
        }
    }

    private void menuProduct(Product product) {
        while (true) {
            System.out.print("\n");
            System.out.printf("%s %s, Цена %d\n", product.getCategoryProduct(), product.getProductName(), product.getPrice());
            System.out.print("Добавить в корзину? y/n\n");
            System.out.print(": ");
            char variable = scanner.next().charAt(0);
            if (variable != 'y' & variable != 'Y' & variable != 'n' & variable != 'N') {
                continue;
            }
            if (variable == 'y' | variable == 'Y') {
                user.setBasket(product);
                System.out.printf("Товар добавлен в корзину\n");
                break;
            }
            System.out.print("Товар в корзину не добавлен\n");
            break;
        }
    }

    private void menuBasket(User user) {
        while (true) {
            System.out.print("Меню\n");
            System.out.print("1 - Выход\n");
            System.out.print("2 - Главное меню\n");
            System.out.print("3 - Список каталогов\n");
            System.out.print("4 - Оплатить\n");
            System.out.print("5 - Очистить корзину\n");
            System.out.printf("\nКорзина пользователя %s\n", user.getLogin());
            System.out.printf("%-12s %12s %4s \n", "Продукт", "Категория", "Цена");
            System.out.print("-------------------------------\n");
            int totalPrice = 0;
            if (user.getBasket().getBuyProduct() == null) {
                System.out.print("Корзина пуста выберите другое меню\n");
                continue;
            }
            for (int i = 0; i < user.getBasket().getBuyProduct().length; i++) {
                System.out.printf("%-12s %10s %4d\n", user.getBasket().getBuyProduct()[i].getProductName(),
                        user.getBasket().getBuyProduct()[i].getCategoryProduct(),
                        user.getBasket().getBuyProduct()[i].getPrice());
                totalPrice += user.getBasket().getBuyProduct()[i].getPrice();
            }
            System.out.printf("Итоговая цена: %-4d\n", totalPrice);
            System.out.print(": ");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1: {
                    System.exit(0);
                }
                case 2: {
                    menuStart();
                }
                case 3: {
                    menuListCategory();
                }
                case 4: {
                    menuPayProduct();
                }
                case 5: {
                    user.nullBasket();
                }
            }

        }
    }

    private void menuPayProduct() {
        System.out.print("Оплата товара прошла успешно\n");
        user.nullBasket();
        menuListCategory();
    }
}