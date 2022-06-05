package kachanovich.myTest.practStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyPractStream {
    public static void main(String[] args) {
        Engine engine1 = new Engine("Foton", "V6", 3.5);
        Engine engine2 = new Engine("Atlet", "V8", 4.0);
        Engine engine3 = new Engine("Power", "R4", 2.0);
        Engine engine4 = new Engine("Power", "V4", 4.5);
        Engine engine5 = new Engine("Foton", "V4", 3.0);
        Engine engine6 = new Engine("Pony", "R4", 1.6);
        Engine engine7 = new Engine("Pony", "R4", 2.0);
        Engine engine8 = new Engine("Reno", "V8", 4.5);
        Engine engine9 = new Engine("Atlet", "V6", 3.5);
        Engine engine10 = new Engine("Sudvig", "R5", 2.0);

        Car car1 = new Car("Reno", "Espase", 110, List.of(engine3, engine6));
        Car car2 = new Car("Volga", "Veter", 150, List.of(engine1, engine10, engine5));
        Car car3 = new Car("Amer", "Svet", 200, List.of(engine7));
        Car car4 = new Car("Dodg", "Caravan", 180, List.of(engine2, engine9, engine4));
        Car car5 = new Car("LiFan", "SiSu", 120, List.of(engine10));
        Car car6 = new Car("Moscvich", "Svoy", 94, List.of(engine3, engine7));
        Car car7 = new Car("Volga", "Svarog", 250, List.of(engine1, engine2, engine3));
        Car car8 = new Car("Volga", "Veter", 150, List.of(engine10, engine9, engine8, engine7));
        Car car9 = new Car("Amer", "Tor", 180, List.of(engine8));
        Car car10 = new Car("Moscvich", "Rabotnik", 110, List.of(engine5, engine7, engine9));
        Car car11 = new Car("Moscvich", "Hozyain", 110, List.of(engine3, engine6));
        Car car12 = new Car("Reno", "Migom", 250, List.of(engine1, engine10, engine3, engine6, engine8));
        Car car13 = new Car("Amer", "Trudovik", 130, List.of(new Engine()));
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);

        System.out.println("Выводим на экран весь список:");
        carList.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Метод filter.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Фильтрация по String в первом уровне. Оставить только машины Volga.");
        carList.stream().filter(e -> e.getCompany().equals("Volga")).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Фильтрация по int на первом уровне. Оставить только машины с мощностью больше 160.");
        carList.stream().filter(c -> c.getPower() > 160).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Выводим машины с двумя двигателями");
        carList.stream().filter(car -> car.getEngineList().size() == 2).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Фильтрация по String в втором уровне. Оставить только машины с двигателем фирмы Power");
        carList.stream().filter(c -> c.getEngineList().stream().anyMatch(engine -> engine.getCompanyEngine().equals("Power"))).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Фильтрация по int в втором уровне. Оставить только машины с объъемом двигателя меньше 2.0");
        carList.stream().filter(car -> car.getEngineList().stream().anyMatch(engine -> engine.getEngineCapacity() < 2.0)).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("skip");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Пропустить 9 элементов списка");
        carList.stream().skip(9).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("distinct");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Возвращение списка без дубликатов");
        carList.stream().distinct().forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("map");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Выводим название машин");
        carList.stream().map(Car::getCompany).forEach(c -> System.out.printf("%s ", c));
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Выводим названия производителей двигателей");

        System.out.println("--------------------------------------------------------------------");
    }
}
