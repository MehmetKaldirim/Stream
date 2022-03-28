package state;

import trader.State;

import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {


        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx= new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va,tx);

        System.out.println("Stream of Stream");
        list.stream().map(state -> state.getCity()).forEach(System.out::println);

        System.out.println("all cities one by many method");
        list.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("all cities one by many method 2");
        list.stream()
                .flatMap(state->state.getCity().stream())
                .forEach(System.out::println);

    }
}