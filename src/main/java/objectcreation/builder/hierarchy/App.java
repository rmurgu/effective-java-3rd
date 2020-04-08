package objectcreation.builder.hierarchy;

public class App {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.LARGE)
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.PEPPER)
                .build();

        Calzone calzone = new Calzone.Builder()
                .sauceInside()
                .addTopping(Pizza.Topping.ONION)
                .build();

        System.out.println(nyPizza);
        System.out.println(calzone);
    }
}
