package day07.inherit;

import static day07.util.Utility.makeLine;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior("주차왕파킹");
        Mage m = new Mage("충격왕쇼킹");
        Hunter h = new Hunter("욕설왕퍼킹");

//        w.showStatus();
//        m.showStatus();
//        h.showStatus();

        m.thunderBolt(w, h,
            new Warrior("닥터지"),
            new Mage("리베아")
        );
    }
}
