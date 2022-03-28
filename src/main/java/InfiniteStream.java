import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n+2)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("************Fibonnacci*************");


        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
                .limit(8)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

        System.out.println("********* Fibonnacci x element");
        int n = 8;
        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
                .limit(n)
                .skip(7)
                .map(t -> t[0])
                .forEach(System.out::println);
    }
}
