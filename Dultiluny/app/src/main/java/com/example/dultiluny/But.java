package com.example.dultiluny;

import android.graphics.Color;

public class But {
    int cons = 40;
    double x;
    double y;
    double R;
    String option;
    game games;
    int color;
    public But(game games, String option){
        this.option=option;
        this.games=games;

        if (this.option=="left"){
            this.R= Math.sqrt(games.w* games.h/Math.PI/cons);
            this.x=R+R/2;
            this.y=games.h - R;
            this.color = Color.argb(150, 0, 0, 0);
        }
        if (this.option=="right"){
            this.R= Math.sqrt(games.w* games.h/Math.PI/cons);
            this.x=games.w-(R+R/2);
            this.y=games.h - R;
            this.color = Color.argb(150, 0, 0, 0);
        }
        if (this.option=="cards"){
            this.R= Math.sqrt(games.w* games.h/Math.PI/cons);
            this.x=games.w-(R+R/2);
            this.y=R;
            this.color = Color.argb(150, 0, 0, 0);
        }
        if (this.option=="cart"){
            this.R= Math.sqrt(games.w* games.h/Math.PI/cons);
            this.x=R;
            this.y=R;
            this.color = Color.argb(150, 0, 0, 0);
        }
    }
}
