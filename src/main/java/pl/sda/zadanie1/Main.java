package pl.sda.zadanie1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("chleb", "pomidory", "mąka", "mleko", "cukier",  "sól", "jajka", "masło", "proszek do pieczenia", "woda"));
        Stack<String> basket = new Stack<>();
        basket.add(list.get(2));
        basket.add(list.get(3));
        basket.add(list.get(6));
        basket.add(list.get(9));

        Queue<String> check = new LinkedList<>();
        int basketSize = basket.size();
        for (int i = 0; i < basketSize; i++) {
            check.offer(basket.pop());
        }

        System.out.println(check);
    }
}
