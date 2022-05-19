package com.example.dultiluny;

import android.graphics.Bitmap;

public class Ob {
    //для всех объектов
    String option;//вид объекта
    Bitmap[][] img;

    //option == hero, background, use
    double x;
    double y;
    int num=0; //все объекты элементы массивов и это номер анимации
    int frame=0;// номер кадра в анимации
    int location;// номер комнаты

    //option == use
    int next_location;//номер следующей комнаты если это объект use; не у всех
    int number_cards;
    String option_text;//обращение к тексту который будет появляться; не у всех
    int text;


    //option == table_card
    int pos_table;

    //option == card
    int Draw;
    int Pos;
    double[] x0;
    double[] y0;

    double time;

    tree_rooms room;
    int turn = 1;
    int animate_cad=0;
    Ob ob;
    int know = -1;
    String sost;
    int speed;

    int toch_girl;
    int toch_hero;

}
