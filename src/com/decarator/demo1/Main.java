package com.decarator.demo1;

import com.decarator.demo1.finery.BigTrouser;
import com.decarator.demo1.finery.TShirts;

public class Main {
    public static void main(String[] args) {
        Person h = new Person("Hi~ o(*￣▽￣*)ブ");
        System.out.println("第一种装扮:");
        Finery tShirts = new TShirts();
        Finery bigTrouser = new BigTrouser();
        h.show();
        tShirts.show();
        bigTrouser.show();
    }
}
