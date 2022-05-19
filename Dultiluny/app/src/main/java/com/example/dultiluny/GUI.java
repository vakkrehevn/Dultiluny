package com.example.dultiluny;

public class GUI {
    /*
    создать геймс
     */
    game games;
    But[] Bu = new But[4];
    Text TX;

    public GUI(game games){
        this.games=games;
        this.TX=new Text(games);
        this.Bu[0]=new But(games, "cards");
        this.Bu[1]=new But(games, "left");
        this.Bu[2]=new But(games, "right");
        this.Bu[3]=new But(games, "cart");
    }
}
