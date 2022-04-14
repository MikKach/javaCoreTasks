package kachanovich.lesson6.task13;

public class Studio {//TODO finish the logic



    public void dressMens(Clothing[] clothing) {
        System.out.print("Одеваем мужчину\n");
        System.out.print("---------------\n");
        for (Clothing value : clothing) {
            value.getClothingSize().getDescription();
            value.dressMen();
        }
    }


    public void dressWomens(Clothing[] clothing) {
        System.out.print("Одеваем женщину\n");
        System.out.print("---------------\n");
        for (Clothing el: clothing) {
            if (el != null) {
                el.dressWomen();
                System.out.println(el.getClothingSize().getDescription());
            }
        }
    }
}
