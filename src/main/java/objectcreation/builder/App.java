package objectcreation.builder;

public class App {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(15, 5)
                .calories(215)
                .fat(5)
                .sodium(1)
                .carbohydrate(22)
                .build();

        System.out.println(nutritionFacts);
    }
}
