package jp.ac.uryukyu.ie.e175743;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Draw {
    List<String> MyCards = new ArrayList();
    List<Integer> markhorder = new ArrayList();
    List<Integer> numberhorder = new ArrayList();
    List<Integer> cards1 = new ArrayList();
    List<Integer> cards2 = new ArrayList();
    List<Integer> cards3 = new ArrayList();
    List<Integer> cards4 = new ArrayList();
    public Draw(List<String> mycards, List<Integer> horderM, List<Integer> horderN, List<Integer> c1, List<Integer> c2, List<Integer> c3, List<Integer> c4){

    }

    //トランプのカード（１〜１３）を作る。
    public void cardsmaker(List<Integer> cards) {
        for (int i = 1; i <= 13; ) {
            cards.add(i);
            i++;
        }
    }
    //作った山札からカードを引くメソッド。
    //引いたカードのマークと数字をhorderM, horderNに保存する。
    public void drawcards(List<String> mycards, List<Integer> horderM, List<Integer> horderN, List<Integer> c1, List<Integer> c2, List<Integer> c3, List<Integer> c4) {
        int drawcard;
        int mark = (int) (Math.random() * 4) + 1;
        if (mark == 1) {
            int cardsnumber = (int) (Math.random() * c1.size());
            drawcard = c1.remove(cardsnumber);
            mycards.add("♣" + drawcard);
        } else if (mark == 2) {
            int cardsnumber = (int) (Math.random() * c2.size());
            drawcard = c2.remove(cardsnumber);
            mycards.add("❤" + drawcard);
        } else if (mark == 3) {
            int cardsnumber = (int) (Math.random() * c3.size());
            drawcard = c3.remove(cardsnumber);
            mycards.add("♦" + drawcard);
        } else {
            int cardsnumber = (int) (Math.random() * c4.size());
            drawcard = c4.remove(cardsnumber);
            mycards.add("♠" + drawcard);
        }
        horderM.add(mark);
        horderN.add(drawcard);
    }

    //手札を入れ替えるメソッド
    //list, horderM, horderN, から削除し、drawcards()でカードを引く。
    public void Remycards(List<String> list, List<Integer> horderM, List<Integer> horderN, List<Integer> c1, List<Integer> c2, List<Integer> c3, List<Integer> c4) {
        String input;
        int Recardnumber = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("手札を入れ替えますか？ yes/no");
        input = in.nextLine();
        if (input.equals("yes")) {
            System.out.println("左から何番目のカードを入れ替えますか？ (1~5");
            input = in.nextLine();
            System.out.println("では、" + input + "番目のカード" + list.get(Integer.parseInt(input) - 1) + "を入れ替えます。");
            list.remove((Integer.parseInt(input) - 1));
            horderM.remove((Integer.parseInt(input) - 1));
            horderN.remove((Integer.parseInt(input) - 1));
            Recardnumber++;

            for (int i = 0; i >= 0; ) {
                System.out.println("他に入れ替えるカードはありますか？ yes/no");
                input = in.nextLine();
                if (input.equals("yes")) {
                    System.out.println(list);
                    System.out.println("左から何番目のカードを入れ替えますか？ (1~" + (5 - Recardnumber));
                    input = in.nextLine();
                    System.out.println("では、" + input + "番目のカード" + list.get(Integer.parseInt(input) - 1) + "を入れ替えます。");
                    list.remove((Integer.parseInt(input) - 1));
                    horderM.remove((Integer.parseInt(input) - 1));
                    horderN.remove((Integer.parseInt(input) - 1));
                    Recardnumber++;
                } else {
                    i--;
                }
            }
            for(int i = 0; i < Recardnumber; i++){
                drawcards(list, horderM, horderN, c1, c2, c3, c4);
            }
        }
        System.out.println("それではこの手札で行きます。");
        System.out.println(list);
    }
}
