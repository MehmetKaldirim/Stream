package dislerim;

import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {

        System.out.println("ALL MATCH\n");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);
        System.out.println("*******************");


        System.out.println("ANY MATCH");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegetarian friendly");
        System.out.println("*******************");


        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);
        System.out.println("*******************");

        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());
        System.out.println("*******************");


        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());
        System.out.println("*******************");



    }

}