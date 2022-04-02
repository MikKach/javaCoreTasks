package kachanovich.lesson6.task9_InternetShop;

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
                    menuEntrance();
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
        for (int i = 0; i < internetShop.getUserArray().length; i++) {
            if (internetShop.getUserArray()[i].getLogin().equals(login)) {
                System.out.println("Такой логин существует");
                menuStart();
            }
        }
        System.out.print("Введите пароль: ");
        String password = scanner.next();
        scanner.nextLine();
        user = new User(login, password);
        internetShop.setUserArray(user);
        menuListCategory(user);
    }

    private void menuEntrance() {
        System.out.print("Введите логин: ");
        String log = scanner.next();
        scanner.nextLine();
        for (int i = 0; i < internetShop.getUserArray().length; i++) {
            if (log.equals(internetShop.getUserArray()[i].getLogin())) {
                user = internetShop.getUserArray()[i];
                System.out.print("Введите пароль: ");
                String pas = scanner.next();
                scanner.nextLine();
                if (pas.equals(user.getPassword())) {
                    menuListCategory(user);
                }
            }
        }
        System.out.print("Такой пользователь не существует\n");
        menuStart();
    }

    private void menuListCategory(User user) {
        while (true) {
            System.out.print("\n");
            if (user.getLogin().equals("One")) {
                System.out.print("\tМеню менеджера магазина\n");
                System.out.print("1 - Выход\n");
                System.out.print("2 - Главное меню\n");
                System.out.print("3 - Добавить каталог\n");
            } else {
                System.out.print("\tМеню\n");
                System.out.print("1 - Выход\n");
                System.out.print("2 - Главное меню\n");
                System.out.printf("3 - Корзина пользователя %s\n", user.getLogin());
            }
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
                    if (user.getLogin().equals("One")) {
                        menuAddNewCategory(user);
                    } else {
                        menuBasket(user);
                    }
                }
            }
            if (num < 1 || num > internetShop.getCategoryArray().length + 3) {
                System.out.print("Неверный пункт меню\nСделайте выбор\n");
                continue;
            }
            for (int i = 0; i < internetShop.getCategoryArray().length; i++) {
                if (i == num - 4) {
                    menuCategory(internetShop.getCategoryArray()[i], user);
                }
            }

        }
    }

    private void menuAddNewCategory(User user) {
        System.out.println("Создание нового каталога");
        System.out.print("Введите название нового каталога: ");
        String newCategory = scanner.next();
        scanner.nextLine();
        for (int i = 0; i < internetShop.getCategoryArray().length; i++) {
            if (internetShop.getCategoryArray()[i].getCategoryName().equals(newCategory)) {
                System.out.println("Такой каталог существует");
                menuListCategory(user);
            }
        }
        Category category = new Category(newCategory);
        internetShop.setCategoryArray(category);
        menuListCategory(user);
    }


    private void menuCategory(Category category, User user) {
        while (true) {
            System.out.print("\n");
            if (user.getLogin().equals("One")) {
                System.out.print("\tМеню менеджера магазина\n");
            } else {
                System.out.print("\tМеню\n");
            }
            System.out.print("1 - Выход\n");
            System.out.print("2 - Главное меню\n");
            System.out.print("3 - Список каталогов\n");
            if (user.getLogin().equals("One")){
                System.out.print("4 - Добавить товар\n");

            }
            else {
                System.out.printf("4 - Корзина пользователя %s\n", user.getLogin());
            }
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
                    menuListCategory(user);
                }
                case 4: {
                    if (user.getLogin().equals("One")){
                        menuAddNewProduct(category,user);
                    }
                    else {
                        menuBasket(user);
                    }
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

    private void menuAddNewProduct(Category category, User user) {
        System.out.print("Введите название нового товара: ");
        String newProductName = scanner.next();
        scanner.nextLine();
        for (int i = 0; i < category.getProductsArray().length; i++) {
            if (category.getProductsArray()[i].getProductName().equals(newProductName)){
                System.out.print("Такой товар существует в этом каталоге\n");
                menuCategory(category,user);
            }
        }
        System.out.print("Введите стоимость товара\n");
        int newProductPrice = scanner.nextInt();
        scanner.nextLine();
        Product newProduct = new Product(newProductName,newProductPrice);
        category.setProductsArray(newProduct);
        menuCategory(category,user);
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
                System.out.print("Товар добавлен в корзину\n");
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
                    menuListCategory(user);
                }
                case 4: {
                    menuPayProduct(user);
                }
                case 5: {
                    user.nullBasket();
                }
            }

        }
    }

    private void menuPayProduct(User user) {
        System.out.print("Оплата товара прошла успешно\n");
        user.nullBasket();
        menuListCategory(user);
    }
}