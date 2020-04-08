package objectcreation.staticfactorymethod;

public class App {

    public static void main(String[] args) {
        Guitar fender = Guitar.fender();

        System.out.println(fender);
    }
}
