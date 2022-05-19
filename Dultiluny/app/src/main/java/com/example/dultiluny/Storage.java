package com.example.dultiluny;

import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class Storage {
    int cons=2000;
    Ob[] Obs = new Ob[61];


    ArrayList cards = new ArrayList();// индексы в массиве Ob всех объектов в которых могут лежать карты
    int a_len=12;
    String[] text_cards = new String[a_len];
    int kk;


    public Storage(int kk){
        this.kk=kk;
        set_text_cards();
    }

    void set_text_cards(){
        text_cards[0]="text1";
        text_cards[1]="text2";
        text_cards[2]="text3";
        text_cards[3]="text4";
    }


    void set_cards(ArrayList cards_img, int w, int h){
        ArrayList ruby = new ArrayList();
        for(int i=0; i<a_len; i++){
            int a = (int) (Math.random() * (Obs.length-1)); //рандомно выбирает место из всех элементов Ob
            while (Obs[a].option!="use" | Obs[a].next_location!=-1 | ruby.contains(a)){//проверяет что рандомно выбрали правильный предмет типа use
                a = (int) (Math.random() * (Obs.length));
            }


            ruby.add(a);
            ArrayList arr = new ArrayList();
            arr.add(a);// индекс предмета
            arr.add(false); // рисуется или нет
            arr.add(Obs[a].x);//координаты х
            arr.add(Obs[a].y);// координаты у
            arr.add(cards_img.get(i));

            double[] move = new double[6];
            move[0]=(Obs[a].x+(w/2))/2;//х центра круга
            move[1]=(Obs[a].y+(h/2))/2;//у центра круга
            move[2]=Math.sqrt((move[0]-w/2)*(move[0]-w/2)+(move[1]-h/2)*(move[1]-h/2));//радиус круга
            if (Obs[a].y<(h/2)){
                move[3]=1;//поверху идет
            }if (Obs[a].y>=(h/2)){
                move[3]=-1;//по низу идет
            }
            move[4]=move[3]*Math.acos((Obs[a].x-move[0])/move[2]);//угол
            move[5]=(int)(cons/kk);
            arr.add(move);
            arr.add(text_cards);
            cards.add(arr);
        }

    }
}
