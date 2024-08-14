package com.Practice;


class TommyVecetti{
    String actions;
    public void action(String n){
        actions = n;
        System.out.println(actions);
    }
}

public class RockstarGames {
    public static void main(String[] args) {
        var tv = new TommyVecetti();
        tv.action("Man Hitting");
        tv.action("Man Firing");
        tv.action("Man Running");
        tv.actions = "New User";



    }
}
