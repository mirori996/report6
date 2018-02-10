package jp.ac.uryukyu.ie.e175743;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> MyCards = new ArrayList();
        List<Integer> markhorder = new ArrayList();
        List<Integer> numberhorder = new ArrayList();
        List<Integer> cards1 = new ArrayList();
        List<Integer> cards2 = new ArrayList();
        List<Integer> cards3 = new ArrayList();
        List<Integer> cards4 = new ArrayList();

        Draw draw = new Draw(MyCards, markhorder, numberhorder, cards1, cards2, cards3, cards4);
        draw.cardsmaker(cards1);
        draw.cardsmaker(cards2);
        draw.cardsmaker(cards3);
        draw.cardsmaker(cards4);
        for (int i = 0; i < 5; i++) {
            draw.drawcards(MyCards, markhorder, numberhorder, cards1, cards2, cards3, cards4);
        }
        System.out.println("あなたの手札は" + MyCards);

        draw.Remycards(MyCards, markhorder, numberhorder, cards1, cards2, cards3, cards4);
    }
}
