package com.example.dultiluny;

import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class game {

    int w;
    int h;

    int const_for_hero=0;

    public int cons=4;
    int USE=-1;

    double b;
    double k;

    Storage storage;
    GUI gui;
    int a = 0;

    String pos = "not in home";
    String state = "in game";
    int v = 0;//скорость
    int step = 11;
    Ob hero;

    int kk;
    double post_cons=1100;

    int place;
    int[] alphaC = new int[12];
    ImageButton[] ButCards = new ImageButton[12];
    public game(Storage storage, int w, int h, int kk) {
        for (int i=0; i<alphaC.length; i++){
            this.alphaC[i]=View.INVISIBLE;
        }
        this.kk = kk;
        this.storage = storage;
        this.hero = find_hero();
        this.w=w;
        this.h=h;
        this.k=((double) h/(double)-w);
        this.b=h;

        this.gui = new GUI(this);

    }

    void move_cards2(){
        for (int i=0; i<storage.cards.size();i++) {
            ArrayList card = (ArrayList) storage.cards.get(i);
            double[] move = (double[]) card.get(5);
            if (move[5] == 0 & (boolean) card.get(1)) {
                    move[5] = -1;
            }
        }
    }
    void go_girl() {

        Ob girl = storage.Obs[15];
        //Log.i("fff", girl.turn +";");
        girl.location = girl.room.index_location;
        /*if (girl.location == hero.location & girl.num!=2 & girl.num!=3 & girl.sost=="normal" & this.state!="sits") {
            girl.sost = "kill";
            int middle = (int) (hero.x-girl.x);
            girl.speed=middle/(1000/kk);
        }
         */

        if (girl.sost == "normal") {
            if (girl.know != -1) {
                girl.turn = 3;
                if (Math.abs(girl.x - girl.ob.x) < 1.2 * step) {
                    if (girl.num < 2) {
                        girl.num = 2 + girl.num;
                        girl.frame = 0;
                    }
                    if (girl.frame == 8) {
                        girl.room = (tree_rooms) girl.room.next_room.get(girl.know);
                        girl.location = girl.room.index_location;
                        //girl.num=1-girl.num%2;
                        //girl.frame=0;
                    }
                    if (girl.frame < 15) {

                    } else {
                        girl.know = -1;
                        girl.num = 1 - girl.num % 2;
                        girl.frame = 0;
                    }
                } else {
                    if (girl.x < girl.ob.x) {
                        girl.x = girl.x + step;
                        girl.turn = 2;
                    } else {
                        girl.x = girl.x - step;
                        girl.turn = 1;
                    }
                }

            } else {
                if (Math.abs(girl.x - w / 2) < 1.5 * step) {
                    double p = Math.random() * (int) girl.room.go_objects.size();///////
                    int c = (int) p;
                    girl.know = c;
                    girl.ob = (Ob) girl.room.go_objects.get(c);
                } else {
                    if (girl.x < w / 2) {
                        girl.x = girl.x + step;
                        girl.turn = 2;
                    } else {
                        girl.x = girl.x - step;
                        girl.turn = 1;
                    }
                }
            }

        }else if (girl.sost=="kill"){
            if (Math.abs(hero.x-girl.x)>Math.abs(1.5*girl.speed)){
                girl.x=girl.x+girl.speed;

            }else{
                girl.speed=0;
                this.pos="end";

            }
        }
    }
    void move_cards() { //двигает карту
        for (int i=0; i<storage.cards.size();i++) {
            ArrayList card = (ArrayList)storage.cards.get(i);
            double[] move = (double[]) card.get(5);
            if ((boolean)card.get(1) & move[5]>0){
                if (move[3]==1) {
                    move[4] = move[4] + 3.14 / (storage.cons/kk);
                }if (move[3]==-1){
                    move[4] = move[4] - 3.14 / (storage.cons/kk);
                }
                double xcard=(double)card.get(2);
                xcard=move[0]+Math.cos(move[4])*move[2];
                card.set(2, xcard);
                double ycard=(double)card.get(3);
                ycard=move[1]-Math.sin(move[4])*move[2];
                card.set(3, ycard);
                move[5]-=1;
            }
            if ((boolean)card.get(1) & move[5]==-1) {
                card.set(2, (double)card.get(2)+(w/2)/(post_cons/kk));
                card.set(3, (double)card.get(2)*k+b);


            }
            if((double)card.get(3)<=0){
                card.set(1, false);
                move[5]=-2;
                alphaC[i] = View.VISIBLE;
                //Log.i("tg24", ButCards[i].ALPHA + ";");
            }

        }

    }

    int next_loc(){
        But[] buttons = this.gui.Bu;
        for (int i=0; i<storage.Obs.length; i++ ){
            if (storage.Obs[i].option=="use" & storage.Obs[i].next_location!=-1  & hero.location == storage.Obs[i].location){//проверяю что это use, проверяю что это точно дверь\лестница, проверяю что этот объект на локации героя
                if (Math.abs(hero.x - storage.Obs[i].x) <= Math.abs(cons * step)){ //проверяю что герой стоит рядом
                    if (true){ //проверяю что нажали на предмет
                        return storage.Obs[i].next_location;
                    }
                }
            }
        }
        return  hero.location;
    }

    void place_of_cards() {//ищем место для карты
        Random rand = new Random();
        place = rand.nextInt(6);//рандомно задаем индекс места из 5 вариантов
        int numcard=rand.nextInt(4);
        for (int i = 0; i < storage.Obs.length; i++) {
            if (storage.Obs[i].option == "use" & storage.Obs[i].number_cards == place) {//ищем предмет с таким индексом
                storage.Obs[5].Pos= numcard; //номер карты которую будем рисовать (рандомный)
            }
        }
    }
    boolean double_click(double lt, double evY) { //проверка на что нажали
       double nt=System.currentTimeMillis();
       But[] buttons = this.gui.Bu;
       if (nt-lt<1000 & evY>2*buttons[1].R & evY<h-2*buttons[1].R){
           this.hero.location=this.next_loc();
           this.Priatky();
           this.move_cards2();
           this.show_card();
           //this.draw_tab();
           this.norka();
           return  true;
       }
       return false;
    }

    void show_card() { //показывает карту
        for (int i = 0; i<storage.cards.size(); i++){
            ArrayList ae = (ArrayList) storage.cards.get(i);
            if (ae.contains(USE)){
                ae.set(1, true);

            }
        }

    }


    void use_chek() { //проверка предмета подошел ли герой и свечение
        for (int bagr = 0; bagr < storage.Obs.length; bagr++) {
            if (storage.Obs[bagr].option == "background" & storage.Obs[bagr].location == hero.location) {
                storage.Obs[bagr].num = 0;
                //gui.TX.text="";
                USE=-1;
                for (int us = 0; us < storage.Obs.length; us++) {
                    if ((storage.Obs[us].option == "use" |storage.Obs[us].option == "blue") & storage.Obs[us].location == hero.location) {//проверка то что герой рядом
                        if (Math.abs(hero.x - storage.Obs[us].x) <= Math.abs(cons * step)) {
                            if (USE==-1) {
                                USE = us;
                                break;
                                //storage.Obs[i].num = storage.Obs[j].num;
                                //gui.TX.text=storage.Obs[j].option_text;
                            }
                        }
                    }
                }
            }
        }
    }
    void norka(){
        Log.i("ddd", String.valueOf(USE));
        if (storage.Obs[USE].option_text=="клетка" & storage.Obs[50].sost=="не спасен"){
            const_for_hero=10;
            storage.Obs[50].sost="спасен";
        }
    }

    void draw_tab(){
        if (storage.Obs[USE].option=="use" & storage.Obs[51].sost=="no draw" & storage.Obs[USE].text==1){
            storage.Obs[51].sost="draw";
            storage.Obs[51].option_text=storage.Obs[USE].option_text;
        }else if(storage.Obs[51].sost=="draw"){
            storage.Obs[51].sost="no draw";
        }
    }

    void animate_girls() {
        Ob girl = storage.Obs[15];
        if (true) {
            if (girl.turn==2) {
                girl.num = 1;
            } else if (girl.turn==1){
                girl.num = 0;
            }
        }
    }

    void animate(){
        if (state=="in game") {
            //v<0 hero.n=ходим в лево <-
            //v=0 вправо стоит ->
            // v=0 влево стоит <-
            // v>0 hero.n=ходим в право->
            if (v < 0) {
                hero.num = const_for_hero+1;
                a = 1;
            } else if (v > 0) {
                hero.num = const_for_hero + 0;
                a = 0;
            } else if (v == 0 & a == 0) {
                hero.num = const_for_hero+3;
            } else if (v == 0 & a == 1) {
                hero.num = const_for_hero + 2;
            }
        }
            for (int i = 0; i < storage.Obs.length; i++) {
                if (storage.Obs[i].option == "hero" | storage.Obs[i].option == "background" | storage.Obs[i].option == "cards_light" | storage.Obs[i].option == "girl") {
                    if (storage.Obs[i].frame < storage.Obs[i].img[storage.Obs[i].num].length - 1) {
                        storage.Obs[i].frame += 1;
                    } else {
                        storage.Obs[i].frame = 0;
                    }
                }
            }



    }
    void Priatky() {
        if (state == "in game" & USE!=-1) {
            if ( storage.Obs[USE].option=="blue") {
                hero.num = 5 - a;
                hero.frame = 0;
                state = "sits";
            }
        }
        else if (state=="sits"){
            hero.frame=0;
            hero.num = 9-a;
        }
    }
    void T16(){
        if (hero.num==5 | hero.num==4){
            if (hero.frame==hero.img[1].length-1){
                hero.num=7-a;
            }
        }if (hero.num==8 | hero.num==9){
            if (hero.frame==hero.img[1].length-1){
                state="in game";
            }
        }
    }

    Ob find_hero(){
        Ob hero = new Ob();
        for (int j = 0; j < storage.Obs.length; j++) {
            if (storage.Obs[j].option == "hero") {
                hero = storage.Obs[j];
            }
        }
        return hero;
    }

    void cart(float x, float y) {
        But[] buttons =this.gui.Bu;
        if ((x - buttons[3].x) * (x - buttons[3].x) + (y - buttons[3].y) * (y - buttons[3].y) <= buttons[3].R * buttons[3].R) {
            if (storage.Obs[32].pos_table==0){
                storage.Obs[32].pos_table=1;
                Log.i("tgggg", String.valueOf(storage.Obs[15].location));
                Log.i("thhhh", String.valueOf(storage.Obs[0].location));
                storage.Obs[32].toch_girl=storage.Obs[15].location;
                storage.Obs[32].toch_hero=storage.Obs[0].location;

            }else{
                storage.Obs[32].pos_table=0;

            }
        }
    }


    void check() {
        if (hero.x+v>-40 & hero.x+v<w-100){
            hero.x+=v;
        }
        go_girl();
    }
}
