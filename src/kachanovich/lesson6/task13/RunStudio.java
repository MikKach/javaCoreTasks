package kachanovich.lesson6.task13;

public class RunStudio {
    public static void main(String[] args) {
        Clothing clothing1 = new Tshirt(ClothingSize.S, 25, "Red");
        Clothing clothing2 = new Trousers(ClothingSize.L, 30, "Black");
        Clothing clothing3 = new Skirt(ClothingSize.XXS, 45, "Yellow");
        Clothing clothing4 = new Tie(ClothingSize.XS, 12, "Broun");
        Clothing[] clothings = {clothing1, clothing2, clothing3, clothing4};
        Studio studio = new Studio();
        studio.dressMens(clothings);
        System.out.println();
        studio.dressWomens(clothings);
    }
}
