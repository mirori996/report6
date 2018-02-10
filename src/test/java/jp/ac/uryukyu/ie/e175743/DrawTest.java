package jp.ac.uryukyu.ie.e175743;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DrawTest {
    @org.junit.jupiter.api.Test
    void drawcards() {
        List<String> MyCards = new ArrayList();
        List<Integer> markhorder = new ArrayList();
        List<Integer> numberhorder = new ArrayList();
        List<Integer> cards1 = new ArrayList();
        List<Integer> cards2 = new ArrayList();
        List<Integer> cards3 = new ArrayList();
        List<Integer> cards4 = new ArrayList();

        Draw draw = new Draw(MyCards, markhorder, numberhorder, cards1, cards2, cards3, cards4);

        for (int i = 1; i <= 5; ) {
            cards1.add(i);
            cards2.add(i);
            cards3.add(i);
            cards4.add(i);
            i++;
        }
        for (int i = 0; i < 5; i++) {
            draw.drawcards(MyCards, markhorder, numberhorder, cards1, cards2, cards3, cards4);
        }
        //draw.Remycards(Mycards, markhorder, numberhorder, cards1, cards2, cards3, cards4);

        assertEquals(MyCards.size(), 5);
    }

}