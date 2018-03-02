package com.proxy.demo1;

public class TecentLOL implements OnlineGame {

    private LOL lol = new LOL();

    private void pay(){
        System.out.println("需要付费");
    }

    @Override
    public void play() {
        pay();
        lol.play();
    }
}
