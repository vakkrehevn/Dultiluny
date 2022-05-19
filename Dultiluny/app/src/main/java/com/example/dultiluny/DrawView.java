package com.example.dultiluny;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.graphics.BitmapFactory;

import java.util.ArrayList;

class DrawView extends View {
    Storage storage;
    game games;
    Paint mPaint = new Paint();
    Rect Rect = new Rect();

    public DrawView(Context context, Storage storage, game games) {
        super(context);
        this.storage = storage;
        this.games = games;

    }
    void cards_light(Canvas canvas){
        for (int i=0; i<storage.cards.size();i++) {
            ArrayList card = (ArrayList) storage.cards.get(i);
            double[] move = (double[]) card.get(5);
            if (move[5] == 0 & (boolean) card.get(1)){
                int f = storage.Obs[5].frame;
                canvas.drawBitmap(storage.Obs[5].img[0][f], 0, 0, mPaint);
                break;
            }
        }

    }
    void home_p(Canvas canvas) {
        for (int i = 1; i < storage.Obs.length; i++) {
            if (storage.Obs[i].option == "background") {
                if (games.hero.location == storage.Obs[i].location) {
                    int n = storage.Obs[i].num;
                    int f = storage.Obs[i].frame;
                    Log.i("tag1", n + "; " + f);
                    canvas.drawBitmap(storage.Obs[i].img[0][f], (float) storage.Obs[i].x, (float) storage.Obs[i].y, mPaint);
                    if (games.USE!=-1){
                        canvas.drawBitmap(storage.Obs[games.USE].img[0][0], (float) storage.Obs[i].x, (float) storage.Obs[i].y, mPaint);

                    }
                }
            }
        }
    }
    void draw_nork(Canvas canvas){
        if (storage.Obs[50].sost=="не спасен" & games.hero.location==7){
            canvas.drawBitmap(storage.Obs[50].img[0][0], (float) storage.Obs[50].x, (float) storage.Obs[50].y, mPaint);
        }
    }

    void hero_p(Canvas canvas) {

        int n = storage.Obs[0].num;
        int f = storage.Obs[0].frame;
        Log.i("num", String.valueOf(games.hero.x));
        canvas.drawBitmap(storage.Obs[0].img[n][f], (float) games.hero.x, (float) games.hero.y, mPaint);

    }
    void baground_osn_p(Canvas canvas) {
        for (int i=1; i < storage.Obs.length; i++) {
            if (storage.Obs[i].option == "background" & storage.Obs[i].location==games.hero.location) {
                int n = storage.Obs[i].num;
                int f = storage.Obs[i].frame;
                canvas.drawBitmap(storage.Obs[0].img[0][0], (float) storage.Obs[i].x, (float) storage.Obs[i].y, mPaint);
            }
        }

    }
    void Cards(Canvas canvas, Paint p){
        p.setColor(Color.argb(255, 255, 255, 255));
        for (int i=0; i < storage.cards.size(); i++) {
            ArrayList k = (ArrayList)(storage.cards.get(i));
            if ((boolean) k.get(1)) {
                canvas.drawBitmap((Bitmap) k.get(4), (float) (double)k.get(2), (float) (double)k.get(3), mPaint);
                //int y = 9/0;
            }
        }

    }


    void gui_p(Canvas canvas, Paint p){
        But[] buttons =games.gui.Bu;
        for(int i=0; i<buttons.length; i++){
            p.setColor(buttons[i].color);
            canvas.drawCircle((float) buttons[i].x, (float)buttons[i].y, (float) buttons[i].R, p);
        }
    }


    void table_card_p(Canvas canvas){
        for (int i = 1; i < storage.Obs.length; i++) {
            if (storage.Obs[i].option == "table_card") {
                if (storage.Obs[i].pos_table==1){
                    canvas.drawBitmap(storage.Obs[i].img[0][0], (float) games.w/2, (float) games.h/2, mPaint);
                }
            }
        }
    }
    void cart_p(Canvas canvas){
        if (storage.Obs[32].pos_table==1){
            canvas.drawBitmap(storage.Obs[32].img[0][0], (float) 0, (float) 0, mPaint);
            int tg=storage.Obs[32].toch_girl-1;
            int th=storage.Obs[32].toch_hero-1;
            canvas.drawBitmap(storage.Obs[33].img[0][tg], (float) 0, (float) 0, mPaint);
            canvas.drawBitmap(storage.Obs[34].img[0][th], (float) 0, (float) 0, mPaint);
        }
    }

    void gui_t(Canvas canvas, Paint p){
        Text text = new Text(games);
        if(storage.Obs[51].sost=="draw"){
            canvas.drawBitmap(storage.Obs[51].img[0][0], (float) games.w/2, (float) games.h/2, mPaint);
            p.setColor(text.color);
            p.setTextSize((float)text.size);
            canvas.drawText(storage.Obs[51].option_text, (float) games.w/2, (float) games.h/2, p);
        }

    }
    void move_girl(Canvas canvas, Paint p){
        if (storage.Obs[0].location==storage.Obs[15].location){
            int n = storage.Obs[15].num;
            int f = storage.Obs[15].frame;
            canvas.drawBitmap(storage.Obs[15].img[n][f], (float) storage.Obs[15].x, (float) storage.Obs[15].y, mPaint);
        }
    }
    @Override
    protected void onDraw(Canvas canvas) {
        if (games.pos == "in home") {
            home_p(canvas);
            draw_nork(canvas);
            hero_p(canvas);
            //gui_t(canvas, mPaint);
            gui_p(canvas, mPaint);
            //table_card_p(canvas);
            Cards(canvas, mPaint);
            cards_light(canvas);
            move_girl(canvas, mPaint);
            //gui_t(canvas, mPaint);
            cart_p(canvas);

        }

    }
}