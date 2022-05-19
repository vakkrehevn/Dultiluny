package com.example.dultiluny;

import android.graphics.Color;
import android.util.Log;

public class Text {
    int cons = 18;
    double x=0;
    double y=0;
    game games;
    String text;
    double size;
    int color= Color.argb(180, 255, 255, 255);
    public Text(game games2){
        this.games=games2;
        Log.i("parametr", games.w + ";" + games.h);
        this.size= games.h/cons;
        this.y = this.size;


    }

}
