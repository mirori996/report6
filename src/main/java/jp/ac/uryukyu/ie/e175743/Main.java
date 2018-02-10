package jp.ac.uryukyu.ie.e175743;

import java.util.ArrayList;
import java.util.List;

//mark(1,2,3,4) == (C,H,D,S) == (♣,❤,♦,♠)
//cards1~4(1,2,3,4,5,6,7,8,9,10,11,12,13) == (A,2,3,4,5,6,7,8,9,10,J,Q,K)
public class Main {
    public static void main(String[] args) {

        /*
        トランプのポーカーを実装してみようと思いましたが、
        手札を用意して、手札を入れ替えるところまでしかできませんでした。
        
        必要なリストの用意
        手札/Mycards, 引いたカードのマークの保存/markhorder, 引いたカードの数字の保存/numberhorder,
        ♣,❤,♦,♠それぞれのカードの保存/cards1, cards2, cards3, cards4
        */
        List<String> MyCards = new ArrayList();
        List<Integer> markhorder = new ArrayList();
        List<Integer> numberhorder = new ArrayList();
        List<Integer> cards1 = new ArrayList();
        List<Integer> cards2 = new ArrayList();
        List<Integer> cards3 = new ArrayList();
        List<Integer> cards4 = new ArrayList();

        Draw draw = new Draw(MyCards, markhorder, numberhorder, cards1, cards2, cards3, cards4);

        //山札を作る。
        draw.cardsmaker(cards1);
        draw.cardsmaker(cards2);
        draw.cardsmaker(cards3);
        draw.cardsmaker(cards4);

        //手札を５枚引く。
        for (int i = 0; i < 5; i++) {
            draw.drawcards(MyCards, markhorder, numberhorder, cards1, cards2, cards3, cards4);
        }
        System.out.println("あなたの手札は" + MyCards);

        //手札の入れ替え。
        draw.Remycards(MyCards, markhorder, numberhorder, cards1, cards2, cards3, cards4);
    }
}
