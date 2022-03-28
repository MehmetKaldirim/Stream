package dislerim;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {


        System.out.println("Print all dish's name that has less than 400 calories");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("***********************");


        System.out.println("Print the length of the name of each dish");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);
        System.out.println("***********************");

        System.out.println("Print Three High Caloric dislerim.Dish Name(>300)");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300 )
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("***********************");
        System.out.println("Print all dish name that are below 400 calories in sorted");

        DishData.getAll().stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish :: getCalories).reversed())
                .map(Dish ::  getName)
                .forEach(System.out::println);
        System.out.println("***********************");




    }
}