package kachanovich.lesson6.task1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone(3526598, "Nokia", 50.5);
        Phone phone2 = new Phone(5468712, "Sitra", 40.3);
        Phone phone3 = new Phone(7891234, "Pokon", 67.0);
        Phone phone4 = new Phone(5893274, "Satory");

        //System.out.printf("Model: %s;\t Number: %d;\t Weight: %.1f\n",phone1.model,phone1.number,phone1.weight);
        //System.out.printf("Model: %s;\t Number: %d;\t Weight: %.1f\n",phone2.model,phone2.number,phone2.weight);
        // System.out.printf("Model: %s;\t Number: %d;\t Weight: %.1f\n",phone3.model,phone3.number,phone3.weight);
        // System.out.printf("Model: %s;\t Number: %d;\t Weight: %.1f\n",phone4.model,phone4.number,phone4.weight);
        //phone1.receiveCall("Elefant", phone1.getNumber());
        //  System.out.printf("Number: %d\n",phone1.getNumber());
        // phone2.receiveCall("Tor");
        // System.out.printf("Number: %d\n",phone2.getNumber());
        //phone3.receiveCall("Gus");
        // System.out.printf("Number: %d\n",phone3.getNumber());
        Phone.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber());

    }
}
