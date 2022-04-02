package kachanovich.lesson6.task9_InternetShop;

public class InternetShop {
    private User[] userArray;
    private Category[] categoryArray;

    public InternetShop() {
        categoryArray = new Category[0];
        userArray = new User[0];
    }

    public Category[] getCategoryArray() {
        return categoryArray;
    }

    public void setCategoryArray(Category... category) {
        Category[] temporaryArray = new Category[this.categoryArray.length + category.length];
        int count = 0;
        for (int i = 0; i < this.categoryArray.length; i++) {
            temporaryArray[i] = this.categoryArray[i];
            count++;
        }
        for (int j = 0; j < category.length; j++) {
            temporaryArray[count++] = category[j];
        }
        this.categoryArray = new Category[count];
        for (int i = 0; i < this.categoryArray.length; i++) {
            this.categoryArray[i] = temporaryArray[i];
        }
    }

    public User[] getUserArray() {
        return userArray;
    }

    public void setUserArray(User... users) {
        User[] temporaryArray = new User[this.userArray.length + users.length];
        int count = 0;
        for (int i = 0; i < this.userArray.length; i++) {
            temporaryArray[i] = this.userArray[i];
            count++;
        }
        for (int j = 0; j < users.length; j++) {
            temporaryArray[count++] = users[j];
        }
        this.userArray = new User[count];
        for (int i = 0; i < this.userArray.length; i++) {
            this.userArray[i] = temporaryArray[i];
        }
    }
}
