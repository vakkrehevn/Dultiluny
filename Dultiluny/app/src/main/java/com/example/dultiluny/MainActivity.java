package com.example.dultiluny;
//kk=FPS

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {
    boolean anime=false;
    Handler handler;
    Runnable runnable;

    tree_rooms tr ;

    ArrayList card_img = new ArrayList();

    double last_time=0;

    int w;
    int h;


    int kk=100;

    Storage storage = new Storage(kk);
    game games;
    boolean start=false;
    //MediaPlayer SongStep;

    /*public void play_step(){
        SongStep.start();
    }

     */

    public  void button_cards(){
        games.ButCards[0]=(ImageButton) findViewById(R.id.image1);
        games.ButCards[1]=(ImageButton) findViewById(R.id.image2);
        games.ButCards[2]=(ImageButton) findViewById(R.id.image3);
        games.ButCards[3]=(ImageButton) findViewById(R.id.image4);
        games.ButCards[4]=(ImageButton) findViewById(R.id.image5);
        games.ButCards[5]=(ImageButton) findViewById(R.id.image6);
        games.ButCards[6]=(ImageButton) findViewById(R.id.image7);
        games.ButCards[7]=(ImageButton) findViewById(R.id.image8);
        games.ButCards[8]=(ImageButton) findViewById(R.id.image9);
        games.ButCards[9]=(ImageButton) findViewById(R.id.image10);
        games.ButCards[10]=(ImageButton) findViewById(R.id.image11);
        games.ButCards[11]=(ImageButton) findViewById(R.id.image12);
        for (int i = 0; i<games.ButCards.length; i++){
            games.ButCards[i].setVisibility(games.alphaC[i]);
        }
    }

    public void SetStor() {

        //Hero
        {
                storage.Obs[0] = new Ob();
                storage.Obs[0].x = 200;
                storage.Obs[0].y = h / 3 + 10;
                storage.Obs[0].location = 1;
                storage.Obs[0].option = "hero";
                storage.Obs[0].num = 0;
                storage.Obs[0].frame = 0;
                storage.Obs[0].img = new Bitmap[14][16];

                {
                    storage.Obs[0].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr1);
                    storage.Obs[0].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][0], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr2);
                    storage.Obs[0].img[0][1] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][1], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr3);
                    storage.Obs[0].img[0][2] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][2], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr4);
                    storage.Obs[0].img[0][3] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][3], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr5);
                    storage.Obs[0].img[0][4] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][4], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr6);
                    storage.Obs[0].img[0][5] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][5], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr7);
                    storage.Obs[0].img[0][6] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][6], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][7] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr8);
                    storage.Obs[0].img[0][7] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][7], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][8] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr9);
                    storage.Obs[0].img[0][8] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][8], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][9] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr10);
                    storage.Obs[0].img[0][9] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][9], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][10] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr11);
                    storage.Obs[0].img[0][10] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][10], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][11] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr12);
                    storage.Obs[0].img[0][11] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][11], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][12] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr13);
                    storage.Obs[0].img[0][12] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][12], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][13] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr14);
                    storage.Obs[0].img[0][13] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][13], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][14] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr15);
                    storage.Obs[0].img[0][14] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][14], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[0][15] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznorkr16);
                    storage.Obs[0].img[0][15] = Bitmap.createScaledBitmap(storage.Obs[0].img[0][15], (w / 6), (w / 6 * 1000) / 456, true);
                }//хождение ->
                {
                    storage.Obs[0].img[1][0] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork1);
                    storage.Obs[0].img[1][0] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][0], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][1] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork2);
                    storage.Obs[0].img[1][1] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][1], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][2] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork3);
                    storage.Obs[0].img[1][2] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][2], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][3] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork4);
                    storage.Obs[0].img[1][3] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][3], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][4] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork5);
                    storage.Obs[0].img[1][4] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][4], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][5] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork6);
                    storage.Obs[0].img[1][5] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][5], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][6] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork7);
                    storage.Obs[0].img[1][6] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][6], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][7] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork8);
                    storage.Obs[0].img[1][7] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][7], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][8] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork9);
                    storage.Obs[0].img[1][8] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][8], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][9] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork10);
                    storage.Obs[0].img[1][9] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][9], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][10] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork11);
                    storage.Obs[0].img[1][10] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][10], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][11] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork12);
                    storage.Obs[0].img[1][11] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][11], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][12] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork13);
                    storage.Obs[0].img[1][12] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][12], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][13] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork14);
                    storage.Obs[0].img[1][13] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][13], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][14] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork15);
                    storage.Obs[0].img[1][14] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][14], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[1][15] = BitmapFactory.decodeResource(getResources(), R.drawable.hodbeznork16);
                    storage.Obs[0].img[1][15] = Bitmap.createScaledBitmap(storage.Obs[0].img[1][15], (w / 6), (w / 6 * 1000) / 456, true);
                }//хождение <-
                {
                    storage.Obs[0].img[2][0] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork1);
                    storage.Obs[0].img[2][0] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][0], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][1] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork2);
                    storage.Obs[0].img[2][1] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][1], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][2] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork3);
                    storage.Obs[0].img[2][2] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][2], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][3] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork4);
                    storage.Obs[0].img[2][3] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][3], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][4] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork5);
                    storage.Obs[0].img[2][4] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][4], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][5] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork6);
                    storage.Obs[0].img[2][5] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][5], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][6] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork7);
                    storage.Obs[0].img[2][6] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][6], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][7] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork8);
                    storage.Obs[0].img[2][7] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][7], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][8] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork9);
                    storage.Obs[0].img[2][8] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][8], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][9] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork10);
                    storage.Obs[0].img[2][9] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][9], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][10] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork11);
                    storage.Obs[0].img[2][10] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][10], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][11] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork12);
                    storage.Obs[0].img[2][11] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][11], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][12] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork13);
                    storage.Obs[0].img[2][12] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][12], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][13] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork14);
                    storage.Obs[0].img[2][13] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][13], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][14] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork15);
                    storage.Obs[0].img[2][14] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][14], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[2][15] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznork15);
                    storage.Obs[0].img[2][15] = Bitmap.createScaledBitmap(storage.Obs[0].img[2][15], (w / 6), (w / 6 * 1000) / 456, true);
                }//стояние  <-
                {
                    storage.Obs[0].img[3][0] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr1);
                    storage.Obs[0].img[3][0] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][0], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][1] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr2);
                    storage.Obs[0].img[3][1] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][1], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][2] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr3);
                    storage.Obs[0].img[3][2] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][2], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][3] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr4);
                    storage.Obs[0].img[3][3] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][3], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][4] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr5);
                    storage.Obs[0].img[3][4] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][4], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][5] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr6);
                    storage.Obs[0].img[3][5] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][5], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][6] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr7);
                    storage.Obs[0].img[3][6] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][6], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][7] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr8);
                    storage.Obs[0].img[3][7] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][7], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][8] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr9);
                    storage.Obs[0].img[3][8] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][8], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][9] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr10);
                    storage.Obs[0].img[3][9] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][9], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][10] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr11);
                    storage.Obs[0].img[3][10] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][10], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][11] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr12);
                    storage.Obs[0].img[3][11] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][11], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][12] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr13);
                    storage.Obs[0].img[3][12] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][12], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][13] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr14);
                    storage.Obs[0].img[3][13] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][13], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][14] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr155);
                    storage.Obs[0].img[3][14] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][14], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[3][15] = BitmapFactory.decodeResource(getResources(), R.drawable.stoibeznorkr155);
                    storage.Obs[0].img[3][15] = Bitmap.createScaledBitmap(storage.Obs[0].img[3][15], (w / 6), (w / 6 * 1000) / 456, true);

                }//стояние  ->

                {
                    storage.Obs[0].img[4][0] = BitmapFactory.decodeResource(getResources(), R.drawable.set1);
                    storage.Obs[0].img[4][0] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][0], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][1] = BitmapFactory.decodeResource(getResources(), R.drawable.set2);
                    storage.Obs[0].img[4][1] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][1], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][2] = BitmapFactory.decodeResource(getResources(), R.drawable.set3);
                    storage.Obs[0].img[4][2] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][2], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][3] = BitmapFactory.decodeResource(getResources(), R.drawable.set4);
                    storage.Obs[0].img[4][3] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][3], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][4] = BitmapFactory.decodeResource(getResources(), R.drawable.set5);
                    storage.Obs[0].img[4][4] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][4], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][5] = BitmapFactory.decodeResource(getResources(), R.drawable.set6);
                    storage.Obs[0].img[4][5] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][5], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][6] = BitmapFactory.decodeResource(getResources(), R.drawable.set7);
                    storage.Obs[0].img[4][6] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][6], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][7] = BitmapFactory.decodeResource(getResources(), R.drawable.set8);
                    storage.Obs[0].img[4][7] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][7], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][8] = BitmapFactory.decodeResource(getResources(), R.drawable.set9);
                    storage.Obs[0].img[4][8] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][8], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][9] = BitmapFactory.decodeResource(getResources(), R.drawable.set10);
                    storage.Obs[0].img[4][9] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][9], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][10] = BitmapFactory.decodeResource(getResources(), R.drawable.set11);
                    storage.Obs[0].img[4][10] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][10], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][11] = BitmapFactory.decodeResource(getResources(), R.drawable.set12);
                    storage.Obs[0].img[4][11] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][11], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][12] = BitmapFactory.decodeResource(getResources(), R.drawable.set13);
                    storage.Obs[0].img[4][12] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][12], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][13] = BitmapFactory.decodeResource(getResources(), R.drawable.set14);
                    storage.Obs[0].img[4][13] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][13], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][14] = BitmapFactory.decodeResource(getResources(), R.drawable.set15);
                    storage.Obs[0].img[4][14] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][14], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[4][15] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[4][15] = Bitmap.createScaledBitmap(storage.Obs[0].img[4][15], (w / 6), (w / 6 * 1000) / 456, true);

                }
                {
                    storage.Obs[0].img[5][0] = BitmapFactory.decodeResource(getResources(), R.drawable.setr1);
                    storage.Obs[0].img[5][0] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][0], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][1] = BitmapFactory.decodeResource(getResources(), R.drawable.setr2);
                    storage.Obs[0].img[5][1] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][1], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][2] = BitmapFactory.decodeResource(getResources(), R.drawable.setr3);
                    storage.Obs[0].img[5][2] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][2], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][3] = BitmapFactory.decodeResource(getResources(), R.drawable.setr4);
                    storage.Obs[0].img[5][3] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][3], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][4] = BitmapFactory.decodeResource(getResources(), R.drawable.setr5);
                    storage.Obs[0].img[5][4] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][4], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][5] = BitmapFactory.decodeResource(getResources(), R.drawable.setr6);
                    storage.Obs[0].img[5][5] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][5], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][6] = BitmapFactory.decodeResource(getResources(), R.drawable.setr7);
                    storage.Obs[0].img[5][6] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][6], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][7] = BitmapFactory.decodeResource(getResources(), R.drawable.setr8);
                    storage.Obs[0].img[5][7] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][7], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][8] = BitmapFactory.decodeResource(getResources(), R.drawable.setr9);
                    storage.Obs[0].img[5][8] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][8], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][9] = BitmapFactory.decodeResource(getResources(), R.drawable.setr10);
                    storage.Obs[0].img[5][9] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][9], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][10] = BitmapFactory.decodeResource(getResources(), R.drawable.setr11);
                    storage.Obs[0].img[5][10] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][10], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][11] = BitmapFactory.decodeResource(getResources(), R.drawable.setr12);
                    storage.Obs[0].img[5][11] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][11], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][12] = BitmapFactory.decodeResource(getResources(), R.drawable.setr13);
                    storage.Obs[0].img[5][12] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][12], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][13] = BitmapFactory.decodeResource(getResources(), R.drawable.setr14);
                    storage.Obs[0].img[5][13] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][13], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][14] = BitmapFactory.decodeResource(getResources(), R.drawable.setr15);
                    storage.Obs[0].img[5][14] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][14], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[5][15] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[5][15] = Bitmap.createScaledBitmap(storage.Obs[0].img[5][15], (w / 6), (w / 6 * 1000) / 456, true);
                }
                {
                    storage.Obs[0].img[6][0] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][0] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][0], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][1] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][1] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][1], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][2] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][2] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][2], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][3] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][3] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][3], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][4] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][4] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][4], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][5] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][5] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][5], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][6] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][6] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][6], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][7] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][7] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][7], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][8] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][8] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][8], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][9] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][9] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][9], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][10] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][10] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][10], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][11] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][11] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][11], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][12] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][12] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][12], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][13] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][13] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][13], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][14] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][14] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][14], (w / 6), (w / 6 * 1000) / 456, true);
                    storage.Obs[0].img[6][15] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[6][15] = Bitmap.createScaledBitmap(storage.Obs[0].img[6][15], (w / 6), (w / 6 * 1000) / 456, true);
                }
                {
                    storage.Obs[0].img[7][0] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][1] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][2] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][3] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][4] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][5] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][6] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][7] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][8] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][9] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][10] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][11] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][12] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][13] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][14] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[7][15] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    for (int i = 0; i < storage.Obs[0].img[7].length; i++) {
                        storage.Obs[0].img[7][i] = Bitmap.createScaledBitmap(storage.Obs[0].img[7][i], (w / 6), (w / 6 * 1000) / 456, true);
                    }
                }
                {
                    storage.Obs[0].img[8][0] = BitmapFactory.decodeResource(getResources(), R.drawable.set16);
                    storage.Obs[0].img[8][1] = BitmapFactory.decodeResource(getResources(), R.drawable.set15);
                    storage.Obs[0].img[8][2] = BitmapFactory.decodeResource(getResources(), R.drawable.set14);
                    storage.Obs[0].img[8][3] = BitmapFactory.decodeResource(getResources(), R.drawable.set13);
                    storage.Obs[0].img[8][4] = BitmapFactory.decodeResource(getResources(), R.drawable.set12);
                    storage.Obs[0].img[8][5] = BitmapFactory.decodeResource(getResources(), R.drawable.set11);
                    storage.Obs[0].img[8][6] = BitmapFactory.decodeResource(getResources(), R.drawable.set10);
                    storage.Obs[0].img[8][7] = BitmapFactory.decodeResource(getResources(), R.drawable.set9);
                    storage.Obs[0].img[8][8] = BitmapFactory.decodeResource(getResources(), R.drawable.set8);
                    storage.Obs[0].img[8][9] = BitmapFactory.decodeResource(getResources(), R.drawable.set7);
                    storage.Obs[0].img[8][10] = BitmapFactory.decodeResource(getResources(), R.drawable.set6);
                    storage.Obs[0].img[8][11] = BitmapFactory.decodeResource(getResources(), R.drawable.set5);
                    storage.Obs[0].img[8][12] = BitmapFactory.decodeResource(getResources(), R.drawable.set4);
                    storage.Obs[0].img[8][13] = BitmapFactory.decodeResource(getResources(), R.drawable.set3);
                    storage.Obs[0].img[8][14] = BitmapFactory.decodeResource(getResources(), R.drawable.set2);
                    storage.Obs[0].img[8][15] = BitmapFactory.decodeResource(getResources(), R.drawable.set1);
                    for (int i = 0; i < storage.Obs[0].img[8].length; i++) {
                        storage.Obs[0].img[8][i] = Bitmap.createScaledBitmap(storage.Obs[0].img[8][i], (w / 6), (w / 6 * 1000) / 456, true);
                    }
                }
                {
                    storage.Obs[0].img[9][0] = BitmapFactory.decodeResource(getResources(), R.drawable.setr16);
                    storage.Obs[0].img[9][1] = BitmapFactory.decodeResource(getResources(), R.drawable.setr15);
                    storage.Obs[0].img[9][2] = BitmapFactory.decodeResource(getResources(), R.drawable.setr14);
                    storage.Obs[0].img[9][3] = BitmapFactory.decodeResource(getResources(), R.drawable.setr13);
                    storage.Obs[0].img[9][4] = BitmapFactory.decodeResource(getResources(), R.drawable.setr12);
                    storage.Obs[0].img[9][5] = BitmapFactory.decodeResource(getResources(), R.drawable.setr11);
                    storage.Obs[0].img[9][6] = BitmapFactory.decodeResource(getResources(), R.drawable.setr10);
                    storage.Obs[0].img[9][7] = BitmapFactory.decodeResource(getResources(), R.drawable.setr9);
                    storage.Obs[0].img[9][8] = BitmapFactory.decodeResource(getResources(), R.drawable.setr8);
                    storage.Obs[0].img[9][9] = BitmapFactory.decodeResource(getResources(), R.drawable.setr7);
                    storage.Obs[0].img[9][10] = BitmapFactory.decodeResource(getResources(), R.drawable.setr6);
                    storage.Obs[0].img[9][11] = BitmapFactory.decodeResource(getResources(), R.drawable.setr5);
                    storage.Obs[0].img[9][12] = BitmapFactory.decodeResource(getResources(), R.drawable.setr4);
                    storage.Obs[0].img[9][13] = BitmapFactory.decodeResource(getResources(), R.drawable.setr3);
                    storage.Obs[0].img[9][14] = BitmapFactory.decodeResource(getResources(), R.drawable.setr2);
                    storage.Obs[0].img[9][15] = BitmapFactory.decodeResource(getResources(), R.drawable.setr1);
                    for (int i = 0; i < storage.Obs[0].img[9].length; i++) {
                        storage.Obs[0].img[9][i] = Bitmap.createScaledBitmap(storage.Obs[0].img[9][i], (w / 6), (w / 6 * 1000) / 456, true);
                    }
                }
                //сидение(одно на всех)

                {
                    storage.Obs[0].img[10][0] = BitmapFactory.decodeResource(getResources(), R.drawable.ad1);
                    storage.Obs[0].img[10][1] = BitmapFactory.decodeResource(getResources(), R.drawable.ad2);
                    storage.Obs[0].img[10][2] = BitmapFactory.decodeResource(getResources(), R.drawable.ad3);
                    storage.Obs[0].img[10][3] = BitmapFactory.decodeResource(getResources(), R.drawable.ad4);
                    storage.Obs[0].img[10][4] = BitmapFactory.decodeResource(getResources(), R.drawable.ad5);
                    storage.Obs[0].img[10][5] = BitmapFactory.decodeResource(getResources(), R.drawable.ad6);
                    storage.Obs[0].img[10][6] = BitmapFactory.decodeResource(getResources(), R.drawable.ad7);
                    storage.Obs[0].img[10][7] = BitmapFactory.decodeResource(getResources(), R.drawable.ad8);
                    storage.Obs[0].img[10][8] = BitmapFactory.decodeResource(getResources(), R.drawable.ad9);
                    storage.Obs[0].img[10][9] = BitmapFactory.decodeResource(getResources(), R.drawable.ad10);
                    storage.Obs[0].img[10][10] = BitmapFactory.decodeResource(getResources(), R.drawable.ad11);
                    storage.Obs[0].img[10][11] = BitmapFactory.decodeResource(getResources(), R.drawable.ad12);
                    storage.Obs[0].img[10][12] = BitmapFactory.decodeResource(getResources(), R.drawable.ad13);
                    storage.Obs[0].img[10][13] = BitmapFactory.decodeResource(getResources(), R.drawable.ad14);
                    storage.Obs[0].img[10][14] = BitmapFactory.decodeResource(getResources(), R.drawable.ad15);
                    storage.Obs[0].img[10][15] = BitmapFactory.decodeResource(getResources(), R.drawable.ad16);
                    for (int i = 0; i < storage.Obs[0].img[10].length; i++) {
                        storage.Obs[0].img[10][i] = Bitmap.createScaledBitmap(storage.Obs[0].img[10][i], (w / 6), (w / 6 * 1000) / 456, true);
                    }
                }//хождение с хорьком ->
                {
                    storage.Obs[0].img[11][0] = BitmapFactory.decodeResource(getResources(), R.drawable.a1);
                    storage.Obs[0].img[11][1] = BitmapFactory.decodeResource(getResources(), R.drawable.a2);
                    storage.Obs[0].img[11][2] = BitmapFactory.decodeResource(getResources(), R.drawable.a3);
                    storage.Obs[0].img[11][3] = BitmapFactory.decodeResource(getResources(), R.drawable.a4);
                    storage.Obs[0].img[11][4] = BitmapFactory.decodeResource(getResources(), R.drawable.a5);
                    storage.Obs[0].img[11][5] = BitmapFactory.decodeResource(getResources(), R.drawable.a6);
                    storage.Obs[0].img[11][6] = BitmapFactory.decodeResource(getResources(), R.drawable.a7);
                    storage.Obs[0].img[11][7] = BitmapFactory.decodeResource(getResources(), R.drawable.a8);
                    storage.Obs[0].img[11][8] = BitmapFactory.decodeResource(getResources(), R.drawable.a9);
                    storage.Obs[0].img[11][9] = BitmapFactory.decodeResource(getResources(), R.drawable.a10);
                    storage.Obs[0].img[11][10] = BitmapFactory.decodeResource(getResources(), R.drawable.a11);
                    storage.Obs[0].img[11][11] = BitmapFactory.decodeResource(getResources(), R.drawable.a12);
                    storage.Obs[0].img[11][12] = BitmapFactory.decodeResource(getResources(), R.drawable.a13);
                    storage.Obs[0].img[11][13] = BitmapFactory.decodeResource(getResources(), R.drawable.a14);
                    storage.Obs[0].img[11][14] = BitmapFactory.decodeResource(getResources(), R.drawable.a15);
                    storage.Obs[0].img[11][15] = BitmapFactory.decodeResource(getResources(), R.drawable.a16);
                    for (int i = 0; i < storage.Obs[0].img[11].length; i++) {
                        storage.Obs[0].img[11][i] = Bitmap.createScaledBitmap(storage.Obs[0].img[11][i], (w / 6), (w / 6 * 1000) / 456, true);
                    }
                }//хождение с хорьком <-
                {
                    storage.Obs[0].img[12][0] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn1);
                    storage.Obs[0].img[12][1] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn2);
                    storage.Obs[0].img[12][2] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn3);
                    storage.Obs[0].img[12][3] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn4);
                    storage.Obs[0].img[12][4] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn5);
                    storage.Obs[0].img[12][5] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn6);
                    storage.Obs[0].img[12][6] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn7);
                    storage.Obs[0].img[12][7] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn8);
                    storage.Obs[0].img[12][8] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn9);
                    storage.Obs[0].img[12][9] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn10);
                    storage.Obs[0].img[12][10] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn11);
                    storage.Obs[0].img[12][11] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn12);
                    storage.Obs[0].img[12][12] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn13);
                    storage.Obs[0].img[12][13] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn14);
                    storage.Obs[0].img[12][14] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn15);
                    storage.Obs[0].img[12][15] = BitmapFactory.decodeResource(getResources(), R.drawable.stoyn16);
                    for (int i = 0; i < storage.Obs[0].img[12].length; i++) {
                        storage.Obs[0].img[12][i] = Bitmap.createScaledBitmap(storage.Obs[0].img[12][i], (w / 6), (w / 6 * 1000) / 456, true);
                    }
                }//стояние с хорьком  <-
                {
                    storage.Obs[0].img[13][0] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd1);
                    storage.Obs[0].img[13][1] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd2);
                    storage.Obs[0].img[13][2] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd3);
                    storage.Obs[0].img[13][3] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd4);
                    storage.Obs[0].img[13][4] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd5);
                    storage.Obs[0].img[13][5] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd6);
                    storage.Obs[0].img[13][6] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd7);
                    storage.Obs[0].img[13][7] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd8);
                    storage.Obs[0].img[13][8] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd9);
                    storage.Obs[0].img[13][9] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd10);
                    storage.Obs[0].img[13][10] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd11);
                    storage.Obs[0].img[13][11] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd12);
                    storage.Obs[0].img[13][12] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd13);
                    storage.Obs[0].img[13][13] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd14);
                    storage.Obs[0].img[13][14] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd15);
                    storage.Obs[0].img[13][15] = BitmapFactory.decodeResource(getResources(), R.drawable.stoynd16);
                    for (int i = 0; i < storage.Obs[0].img[13].length; i++) {
                        storage.Obs[0].img[13][i] = Bitmap.createScaledBitmap(storage.Obs[0].img[13][i], (w / 6), (w / 6 * 1000) / 456, true);
                    }

                }//стояние с хорьком  ->
            }

        //Norka
        {
            storage.Obs[50] = new Ob();
            storage.Obs[50].x = 0;
            storage.Obs[50].y = 0;
            storage.Obs[50].location = 7;
            storage.Obs[50].next_location = -1;
            storage.Obs[50].option = "horek";
            storage.Obs[50].option_text = "хорек";
            storage.Obs[50].sost = "не спасен";
            storage.Obs[50].num = 0;
            storage.Obs[50].frame = 0;
            storage.Obs[50].img = new Bitmap[1][1];
            storage.Obs[50].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.norka);
            storage.Obs[50].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[50].img[0][0], w, h, true);
        }
        //Tablich
        {
            storage.Obs[51] = new Ob();
            storage.Obs[51].option = "tablichka";
            storage.Obs[51].sost = "no draw";
            storage.Obs[51].frame = 0;
            storage.Obs[51].img = new Bitmap[1][1];
            storage.Obs[51].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.tablichka);
            storage.Obs[51].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[51].img[0][0], w, h, true);
        }
        //Card
        {
            storage.Obs[4] = new Ob();
            storage.Obs[4].pos_table = 0;
            storage.Obs[4].option = "table_card";
            storage.Obs[4].img = new Bitmap[1][1];

        }
        {
            storage.Obs[5] = new Ob();
            storage.Obs[5].option = "cards_light";
            storage.Obs[5].frame = 0;
            storage.Obs[5].img = new Bitmap[1][4];
            storage.Obs[5].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.cardblue);
            storage.Obs[5].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.cardgreen);
            storage.Obs[5].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.cardred);
            storage.Obs[5].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.cardyellow);
            for (int i = 0; i < storage.Obs[5].img[0].length; i++) {
                storage.Obs[5].img[0][i] = Bitmap.createScaledBitmap(storage.Obs[5].img[0][i], w, h, true);
            }
        }
        //Cart
        {
            storage.Obs[32] = new Ob();
            storage.Obs[32].option = "cart";
            storage.Obs[32].toch_girl = -1;
            storage.Obs[32].toch_hero = -1;
            storage.Obs[32].frame = 0;
            storage.Obs[32].img = new Bitmap[1][1];
            storage.Obs[32].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.cart);
            storage.Obs[32].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[32].img[0][0], w, h, true);
        }
        {
            storage.Obs[33] = new Ob();
            storage.Obs[33].option = "cart_toch_girl";
            storage.Obs[33].pos_table = 0;
            storage.Obs[33].frame = 0;
            storage.Obs[33].img = new Bitmap[1][7];
            storage.Obs[33].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.pin1);
            storage.Obs[33].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.pin2);
            storage.Obs[33].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.pin3);
            storage.Obs[33].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.pin4);
            storage.Obs[33].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.pin5);
            storage.Obs[33].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.pin6);
            storage.Obs[33].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.pin7);
            for (int i = 0; i < storage.Obs[33].img[0].length; i++) {
                storage.Obs[33].img[0][i] = Bitmap.createScaledBitmap(storage.Obs[33].img[0][i], w, h, true);
            }
        }
        {
            storage.Obs[34] = new Ob();
            storage.Obs[34].option = "cart_toch_hero";
            storage.Obs[34].pos_table = 0;
            storage.Obs[34].frame = 0;
            storage.Obs[34].img = new Bitmap[1][7];
            storage.Obs[34].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.cres1);
            storage.Obs[34].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.cres2);
            storage.Obs[34].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.cres3);
            storage.Obs[34].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.cres4);
            storage.Obs[34].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.cres5);
            storage.Obs[34].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.cres6);
            storage.Obs[34].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.cres7);
            for (int i = 0; i < storage.Obs[34].img[0].length; i++) {
                storage.Obs[34].img[0][i] = Bitmap.createScaledBitmap(storage.Obs[34].img[0][i], w, h, true);
            }
        }

        //Girl
        {
            storage.Obs[15] = new Ob();
            storage.Obs[15].x = 200;
            storage.Obs[15].y = h / 3 + 10;
            storage.Obs[15].room = tr;
            storage.Obs[15].option = "girl";
            storage.Obs[15].num = 0;
            storage.Obs[15].frame = 0;
            storage.Obs[15].sost = "normal";
            storage.Obs[15].img = new Bitmap[4][16];

            storage.Obs[15].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl1);
            storage.Obs[15].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl2);
            storage.Obs[15].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl3);
            storage.Obs[15].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl4);
            storage.Obs[15].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl5);
            storage.Obs[15].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl6);
            storage.Obs[15].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl7);
            storage.Obs[15].img[0][7] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl8);
            storage.Obs[15].img[0][8] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl9);
            storage.Obs[15].img[0][9] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl10);
            storage.Obs[15].img[0][10] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl11);
            storage.Obs[15].img[0][11] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl12);
            storage.Obs[15].img[0][12] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl13);
            storage.Obs[15].img[0][13] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl14);
            storage.Obs[15].img[0][14] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl15);
            storage.Obs[15].img[0][15] = BitmapFactory.decodeResource(getResources(), R.drawable.slugl16);

            storage.Obs[15].img[1][0] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr1);
            storage.Obs[15].img[1][1] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr2);
            storage.Obs[15].img[1][2] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr3);
            storage.Obs[15].img[1][3] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr4);
            storage.Obs[15].img[1][4] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr5);
            storage.Obs[15].img[1][5] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr6);
            storage.Obs[15].img[1][6] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr7);
            storage.Obs[15].img[1][7] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr8);
            storage.Obs[15].img[1][8] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr9);
            storage.Obs[15].img[1][9] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr10);
            storage.Obs[15].img[1][10] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr11);
            storage.Obs[15].img[1][11] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr12);
            storage.Obs[15].img[1][12] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr13);
            storage.Obs[15].img[1][13] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr14);
            storage.Obs[15].img[1][14] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr15);
            storage.Obs[15].img[1][15] = BitmapFactory.decodeResource(getResources(), R.drawable.slugr16);

            storage.Obs[15].img[2][0] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi8);
            storage.Obs[15].img[2][1] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi7);
            storage.Obs[15].img[2][2] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi6);
            storage.Obs[15].img[2][3] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi5);
            storage.Obs[15].img[2][4] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi4);
            storage.Obs[15].img[2][5] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi3);
            storage.Obs[15].img[2][6] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi2);
            storage.Obs[15].img[2][7] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi1);
            storage.Obs[15].img[2][8] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir2);
            storage.Obs[15].img[2][9] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir3);
            storage.Obs[15].img[2][10] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir4);
            storage.Obs[15].img[2][11] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir5);
            storage.Obs[15].img[2][12] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir6);
            storage.Obs[15].img[2][13] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir7);
            storage.Obs[15].img[2][14] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir8);
            storage.Obs[15].img[2][15] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir9);

            storage.Obs[15].img[3][0] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir8);
            storage.Obs[15].img[3][1] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir7);
            storage.Obs[15].img[3][2] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir6);
            storage.Obs[15].img[3][3] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir5);
            storage.Obs[15].img[3][4] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir4);
            storage.Obs[15].img[3][5] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir3);
            storage.Obs[15].img[3][6] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir2);
            storage.Obs[15].img[3][7] = BitmapFactory.decodeResource(getResources(), R.drawable.poevir1);
            storage.Obs[15].img[3][8] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi2);
            storage.Obs[15].img[3][9] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi3);
            storage.Obs[15].img[3][10] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi4);
            storage.Obs[15].img[3][11] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi5);
            storage.Obs[15].img[3][12] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi6);
            storage.Obs[15].img[3][13] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi7);
            storage.Obs[15].img[3][14] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi8);
            storage.Obs[15].img[3][15] = BitmapFactory.decodeResource(getResources(), R.drawable.poevi9);

            for (int j = 0; j < storage.Obs[15].img.length; j++) {
                for (int i = 0; i < storage.Obs[15].img[j].length; i++) {
                    storage.Obs[15].img[j][i] = Bitmap.createScaledBitmap(storage.Obs[15].img[j][i], (w / 6), (w / 6 * 1000) / 456, true);
                }
            }

        }

        //ROOM1
        {

            storage.Obs[1] = new Ob();
            storage.Obs[1].x = 0;
            storage.Obs[1].y = 0;
            storage.Obs[1].location = 1;
            storage.Obs[1].option = "background";
            storage.Obs[1].num = 0;
            storage.Obs[1].frame = 0;
            if (anime) {
                storage.Obs[1].img = new Bitmap[1][24];

                storage.Obs[1].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f0);
                storage.Obs[1].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][0], w, h, true);
                storage.Obs[1].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f1);
                storage.Obs[1].img[0][1] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][1], w, h, true);
                storage.Obs[1].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f2);
                storage.Obs[1].img[0][2] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][2], w, h, true);
                storage.Obs[1].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f3);
                storage.Obs[1].img[0][3] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][3], w, h, true);
                storage.Obs[1].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f4);
                storage.Obs[1].img[0][4] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][4], w, h, true);
                storage.Obs[1].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f5);
                storage.Obs[1].img[0][5] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][5], w, h, true);
                storage.Obs[1].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f6);
                storage.Obs[1].img[0][6] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][6], w, h, true);
                storage.Obs[1].img[0][7] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f7);
                storage.Obs[1].img[0][7] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][7], w, h, true);
                storage.Obs[1].img[0][8] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f8);
                storage.Obs[1].img[0][8] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][8], w, h, true);
                storage.Obs[1].img[0][9] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f9);
                storage.Obs[1].img[0][9] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][9], w, h, true);
                storage.Obs[1].img[0][10] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f10);
                storage.Obs[1].img[0][10] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][10], w, h, true);
                storage.Obs[1].img[0][11] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f11);
                storage.Obs[1].img[0][11] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][11], w, h, true);
                storage.Obs[1].img[0][12] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f12);
                storage.Obs[1].img[0][12] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][12], w, h, true);
                storage.Obs[1].img[0][13] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f13);
                storage.Obs[1].img[0][13] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][13], w, h, true);
                storage.Obs[1].img[0][14] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f14);
                storage.Obs[1].img[0][14] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][14], w, h, true);
                storage.Obs[1].img[0][15] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f15);
                storage.Obs[1].img[0][15] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][15], w, h, true);
                storage.Obs[1].img[0][16] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f16);
                storage.Obs[1].img[0][16] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][16], w, h, true);
                storage.Obs[1].img[0][17] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f17);
                storage.Obs[1].img[0][17] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][17], w, h, true);
                storage.Obs[1].img[0][18] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f18);
                storage.Obs[1].img[0][18] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][18], w, h, true);
                storage.Obs[1].img[0][19] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f19);
                storage.Obs[1].img[0][19] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][19], w, h, true);
                storage.Obs[1].img[0][20] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f20);
                storage.Obs[1].img[0][20] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][20], w, h, true);
                storage.Obs[1].img[0][21] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f21);
                storage.Obs[1].img[0][21] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][21], w, h, true);
                storage.Obs[1].img[0][22] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f22);
                storage.Obs[1].img[0][22] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][22], w, h, true);
                storage.Obs[1].img[0][23] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f23);
                storage.Obs[1].img[0][23] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][23], w, h, true);
            } else {
                storage.Obs[1].img = new Bitmap[1][1];
                storage.Obs[1].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.loc1n0f0);
                storage.Obs[1].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[1].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[2] = new Ob();
            storage.Obs[2].x = w / 8 / 2;
            storage.Obs[2].y = 100;
            storage.Obs[2].location = 1;
            storage.Obs[2].next_location = 2;
            storage.Obs[2].option = "use";
            storage.Obs[2].option_text = "";
            storage.Obs[2].number_cards = 0;
            storage.Obs[2].num = 1;
            storage.Obs[2].img = new Bitmap[1][1];
            storage.Obs[2].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1door1);
            storage.Obs[2].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[2].img[0][0], w, h, true);
        }
        {
            storage.Obs[16] = new Ob();
            storage.Obs[16].x = (w / 8) * 2 - (w / 8 / 4);
            storage.Obs[16].y = (h / 6) * 3;
            storage.Obs[16].location = 1;
            storage.Obs[16].next_location = -1;
            storage.Obs[16].option = "use";
            storage.Obs[16].option_text = "коробочка";
            storage.Obs[16].number_cards = 6;
            storage.Obs[16].num = 1;
            storage.Obs[16].img = new Bitmap[1][1];
            storage.Obs[16].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1pred1);
            storage.Obs[16].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[16].img[0][0], w, h, true);
        }
        {
            storage.Obs[23] = new Ob();
            storage.Obs[23].x = (w / 8 * 2) + (w / 8 / 3);
            storage.Obs[23].y = 100;
            storage.Obs[23].location = 1;
            storage.Obs[23].next_location = -1;
            storage.Obs[23].option = "blue";
            storage.Obs[23].option_text = "столб";
            storage.Obs[23].num = 1;
            storage.Obs[23].img = new Bitmap[1][1];
            storage.Obs[23].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1hide);
            storage.Obs[23].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[23].img[0][0], w, h, true);
        }
        {
            storage.Obs[27] = new Ob();
            storage.Obs[27].x = (w / 8) * 6;
            storage.Obs[27].y = (h / 6) * 4 + (h / 6 / 2);
            storage.Obs[27].location = 1;
            storage.Obs[27].next_location = -1;
            storage.Obs[27].option = "use";
            storage.Obs[27].option_text = "подушка";
            storage.Obs[27].number_cards = 7;
            storage.Obs[27].num = 1;
            storage.Obs[27].img = new Bitmap[1][1];
            storage.Obs[27].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1pred3);
            storage.Obs[27].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[27].img[0][0], w, h, true);
        }
        {
            storage.Obs[28] = new Ob();
            storage.Obs[28].x = (w / 8) * 3;
            storage.Obs[28].y = (h / 6) * 4 + (h / 6 / 3);
            storage.Obs[28].location = 1;
            storage.Obs[28].next_location = -1;
            storage.Obs[28].option = "use";
            storage.Obs[28].option_text = "книга1";
            storage.Obs[28].number_cards = 8;
            storage.Obs[28].num = 1;
            storage.Obs[28].img = new Bitmap[1][1];
            storage.Obs[28].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1pred4);
            storage.Obs[28].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[28].img[0][0], w, h, true);
        }
        {
            storage.Obs[29] = new Ob();
            storage.Obs[29].x = (w / 8) * 4 + (w / 8 / 3);
            storage.Obs[29].y = (h / 6) * 5;
            storage.Obs[29].location = 1;
            storage.Obs[29].next_location = -1;
            storage.Obs[29].option = "use";
            storage.Obs[29].option_text = "коробка";
            storage.Obs[29].number_cards = 9;
            storage.Obs[29].num = 1;
            storage.Obs[29].img = new Bitmap[1][1];
            storage.Obs[29].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1pred2);
            storage.Obs[29].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[29].img[0][0], w, h, true);
        }
        {
            storage.Obs[30] = new Ob();
            storage.Obs[30].x = (w / 8) * 5;
            storage.Obs[30].y = (h / 6) * 4 + (h / 6 / 3);
            storage.Obs[30].location = 1;
            storage.Obs[30].next_location = -1;
            storage.Obs[30].option = "use";
            storage.Obs[30].option_text = "книга2";
            storage.Obs[30].number_cards = 10;
            storage.Obs[30].num = 1;
            storage.Obs[30].img = new Bitmap[1][1];
            storage.Obs[30].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1pred5);
            storage.Obs[30].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[30].img[0][0], w, h, true);
        }

        //ROOM2
        {
            storage.Obs[3] = new Ob();
            storage.Obs[3].x = 0;
            storage.Obs[3].y = 0;
            storage.Obs[3].location = 2;
            storage.Obs[3].option = "background";
            storage.Obs[3].num = 0;
            storage.Obs[3].frame = 0;
            if (anime) {
                storage.Obs[3].img = new Bitmap[1][24];
                {
                    storage.Obs[3].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.k1);
                    storage.Obs[3].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][0], w, h, true);
                    storage.Obs[3].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.k2);
                    storage.Obs[3].img[0][1] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][1], w, h, true);
                    storage.Obs[3].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.k3);
                    storage.Obs[3].img[0][2] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][2], w, h, true);
                    storage.Obs[3].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.k4);
                    storage.Obs[3].img[0][3] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][3], w, h, true);
                    storage.Obs[3].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.k5);
                    storage.Obs[3].img[0][4] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][4], w, h, true);
                    storage.Obs[3].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.k6);
                    storage.Obs[3].img[0][5] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][5], w, h, true);
                    storage.Obs[3].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.k7);
                    storage.Obs[3].img[0][6] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][6], w, h, true);
                    storage.Obs[3].img[0][7] = BitmapFactory.decodeResource(getResources(), R.drawable.k8);
                    storage.Obs[3].img[0][7] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][7], w, h, true);
                    storage.Obs[3].img[0][8] = BitmapFactory.decodeResource(getResources(), R.drawable.k9);
                    storage.Obs[3].img[0][8] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][8], w, h, true);
                    storage.Obs[3].img[0][9] = BitmapFactory.decodeResource(getResources(), R.drawable.k10);
                    storage.Obs[3].img[0][9] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][9], w, h, true);
                    storage.Obs[3].img[0][10] = BitmapFactory.decodeResource(getResources(), R.drawable.k11);
                    storage.Obs[3].img[0][10] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][10], w, h, true);
                    storage.Obs[3].img[0][11] = BitmapFactory.decodeResource(getResources(), R.drawable.k12);
                    storage.Obs[3].img[0][11] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][11], w, h, true);
                    storage.Obs[3].img[0][12] = BitmapFactory.decodeResource(getResources(), R.drawable.k13);
                    storage.Obs[3].img[0][12] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][12], w, h, true);
                    storage.Obs[3].img[0][13] = BitmapFactory.decodeResource(getResources(), R.drawable.k14);
                    storage.Obs[3].img[0][13] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][13], w, h, true);
                    storage.Obs[3].img[0][14] = BitmapFactory.decodeResource(getResources(), R.drawable.k15);
                    storage.Obs[3].img[0][14] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][14], w, h, true);
                    storage.Obs[3].img[0][15] = BitmapFactory.decodeResource(getResources(), R.drawable.k16);
                    storage.Obs[3].img[0][15] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][15], w, h, true);
                    storage.Obs[3].img[0][16] = BitmapFactory.decodeResource(getResources(), R.drawable.k17);
                    storage.Obs[3].img[0][16] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][16], w, h, true);
                    storage.Obs[3].img[0][17] = BitmapFactory.decodeResource(getResources(), R.drawable.k18);
                    storage.Obs[3].img[0][17] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][17], w, h, true);
                    storage.Obs[3].img[0][18] = BitmapFactory.decodeResource(getResources(), R.drawable.k19);
                    storage.Obs[3].img[0][18] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][18], w, h, true);
                    storage.Obs[3].img[0][19] = BitmapFactory.decodeResource(getResources(), R.drawable.k20);
                    storage.Obs[3].img[0][19] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][19], w, h, true);
                    storage.Obs[3].img[0][20] = BitmapFactory.decodeResource(getResources(), R.drawable.k21);
                    storage.Obs[3].img[0][20] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][20], w, h, true);
                    storage.Obs[3].img[0][21] = BitmapFactory.decodeResource(getResources(), R.drawable.k22);
                    storage.Obs[3].img[0][21] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][21], w, h, true);
                    storage.Obs[3].img[0][22] = BitmapFactory.decodeResource(getResources(), R.drawable.k23);
                    storage.Obs[3].img[0][22] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][22], w, h, true);
                    storage.Obs[3].img[0][23] = BitmapFactory.decodeResource(getResources(), R.drawable.k1);
                    storage.Obs[3].img[0][23] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][23], w, h, true);
                }
            } else {
                storage.Obs[3].img = new Bitmap[1][1];
                storage.Obs[3].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.k1);
                storage.Obs[3].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[3].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[6] = new Ob();
            storage.Obs[6].x = w / 8 / 2;
            storage.Obs[6].y = 100;
            storage.Obs[6].location = 2;
            storage.Obs[6].next_location = 1;
            storage.Obs[6].option = "use";
            storage.Obs[6].option_text = "это дверь";
            storage.Obs[6].number_cards = -1;
            storage.Obs[6].num = 1;
            storage.Obs[6].img = new Bitmap[1][1];
            storage.Obs[6].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room2door1);
            storage.Obs[6].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[6].img[0][0], w, h, true);
        }
        {
            storage.Obs[7] = new Ob();
            storage.Obs[7].x = (w / 8 * 6) + (w / 8 / 3);
            storage.Obs[7].y = 100;
            storage.Obs[7].location = 2;
            storage.Obs[7].next_location = 3;
            storage.Obs[7].option = "use";
            storage.Obs[7].option_text = "это лестница";
            storage.Obs[7].number_cards = -1;
            storage.Obs[7].num = 1;
            storage.Obs[7].img = new Bitmap[1][1];
            storage.Obs[7].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room2door2);
            storage.Obs[7].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[7].img[0][0], w, h, true);
        }
        {
            storage.Obs[9] = new Ob();
            storage.Obs[9].x = (w / 8) * 2 - (w / 8 / 2);
            storage.Obs[9].y = (h / 6) * 2;
            storage.Obs[9].location = 2;
            storage.Obs[9].next_location = -1;
            storage.Obs[9].option = "use";
            storage.Obs[9].option_text = "Это игрушки";
            storage.Obs[9].number_cards = 0;
            storage.Obs[9].num = 1;
            storage.Obs[9].img = new Bitmap[1][1];
            storage.Obs[9].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room2pred3);
            storage.Obs[9].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[9].img[0][0], w, h, true);
        }
        {
            storage.Obs[10] = new Ob();
            storage.Obs[10].x = (w / 8 * 2) + (w / 8 / 2) + (w / 8 / 4);
            storage.Obs[10].y = (h / 6) * 4 - (h / 6 / 2);
            storage.Obs[10].location = 2;
            storage.Obs[10].next_location = -1;
            storage.Obs[10].option = "use";
            storage.Obs[10].option_text = "Это тыквенный сок";
            storage.Obs[10].number_cards = 1;
            storage.Obs[10].num = 1;
            storage.Obs[10].img = new Bitmap[1][1];
            storage.Obs[10].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room2pred1);
            storage.Obs[10].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[10].img[0][0], w, h, true);
        }
        {
            storage.Obs[11] = new Ob();
            storage.Obs[11].x = (w / 8 * 3) + (w / 8 / 4);
            storage.Obs[11].y = (h / 6) * 4 - (h / 6 / 2);
            storage.Obs[11].location = 2;
            storage.Obs[11].next_location = -1;
            storage.Obs[11].option = "use";
            storage.Obs[11].option_text = "Это баночка";
            storage.Obs[11].number_cards = 2;
            storage.Obs[11].num = 1;
            storage.Obs[11].img = new Bitmap[1][1];
            storage.Obs[11].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room2pred2);
            storage.Obs[11].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[11].img[0][0], w, h, true);
        }
        {
            storage.Obs[12] = new Ob();
            storage.Obs[12].x = (w / 8 * 4) + (w / 8 / 2);
            storage.Obs[12].y = (h / 6) * 2;
            storage.Obs[12].location = 2;
            storage.Obs[12].next_location = -1;
            storage.Obs[12].option = "use";
            storage.Obs[12].option_text = "Это книга";
            storage.Obs[12].number_cards = 3;
            storage.Obs[12].num = 1;
            storage.Obs[12].img = new Bitmap[1][1];
            storage.Obs[12].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room2pred4);
            storage.Obs[12].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[12].img[0][0], w, h, true);
        }
        {
            storage.Obs[13] = new Ob();
            storage.Obs[13].x = (w / 8 * 5);
            storage.Obs[13].y = (h / 6) * 2;
            storage.Obs[13].location = 2;
            storage.Obs[13].next_location = -1;
            storage.Obs[13].option = "use";
            storage.Obs[13].option_text = "Это кулечек";
            storage.Obs[13].number_cards = 4;
            storage.Obs[13].num = 1;
            storage.Obs[13].img = new Bitmap[1][1];
            storage.Obs[13].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room2pred6);
            storage.Obs[13].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[13].img[0][0], w, h, true);
        }
        {
            storage.Obs[14] = new Ob();
            storage.Obs[14].x = (w / 8 * 6) - (w / 8 / 4);
            storage.Obs[14].y = (h / 6) * 5 - (h / 6 / 2);
            storage.Obs[14].location = 2;
            storage.Obs[14].next_location = -1;
            storage.Obs[14].option = "use";
            storage.Obs[14].option_text = "Это ведро";
            storage.Obs[14].number_cards = 5;
            storage.Obs[14].num = 1;
            storage.Obs[14].img = new Bitmap[1][1];
            storage.Obs[14].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room2pred5);
            storage.Obs[14].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[14].img[0][0], w, h, true);
        }
        {
            storage.Obs[24] = new Ob();
            storage.Obs[24].x = (w / 8 * 4) - (w / 8 / 4);
            storage.Obs[24].y = 100;
            storage.Obs[24].location = 2;
            storage.Obs[24].next_location = -1;
            storage.Obs[24].option = "blue";
            storage.Obs[24].option_text = "";
            storage.Obs[24].num = 1;
            storage.Obs[24].img = new Bitmap[1][1];
            storage.Obs[24].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room2hide);
            storage.Obs[24].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[24].img[0][0], w, h, true);
        }

        //ROOM3
        {
            storage.Obs[8] = new Ob();
            storage.Obs[8].x = 0;
            storage.Obs[8].y = 0;
            storage.Obs[8].location = 3;
            storage.Obs[8].option = "background";
            storage.Obs[8].num = 0;
            storage.Obs[8].frame = 0;
            if (anime) {
                storage.Obs[8].img = new Bitmap[1][8];
                storage.Obs[8].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1);
                storage.Obs[8].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][0], w, h, true);
                storage.Obs[8].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.room2);
                storage.Obs[8].img[0][1] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][1], w, h, true);
                storage.Obs[8].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.room3);
                storage.Obs[8].img[0][2] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][2], w, h, true);
                storage.Obs[8].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.room4);
                storage.Obs[8].img[0][3] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][3], w, h, true);
                storage.Obs[8].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.room5);
                storage.Obs[8].img[0][4] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][4], w, h, true);
                storage.Obs[8].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.room6);
                storage.Obs[8].img[0][5] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][5], w, h, true);
                storage.Obs[8].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.room7);
                storage.Obs[8].img[0][6] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][6], w, h, true);
                storage.Obs[8].img[0][7] = BitmapFactory.decodeResource(getResources(), R.drawable.room8);
                storage.Obs[8].img[0][7] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][7], w, h, true);
            } else {
                storage.Obs[8].img = new Bitmap[1][1];
                storage.Obs[8].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1);
                storage.Obs[8].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][0], w, h, true);
            }


            for (int i = 0; i < storage.Obs[8].img[0].length; i++) {
                storage.Obs[8].img[0][i] = Bitmap.createScaledBitmap(storage.Obs[8].img[0][i], w, h, true);
            }
        }
        {
            storage.Obs[17] = new Ob();
            storage.Obs[17].x = (w / 8) * 2 + (w / 8) / 4;
            storage.Obs[17].y = 100;
            storage.Obs[17].location = 3;
            storage.Obs[17].next_location = 6;
            storage.Obs[17].option = "use";
            storage.Obs[17].option_text = "Это дверь";
            storage.Obs[17].number_cards = -1;
            storage.Obs[17].num = 1;
            storage.Obs[17].img = new Bitmap[1][1];
            storage.Obs[17].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room3door2);
            storage.Obs[17].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[17].img[0][0], w, h, true);
        }
        {
            storage.Obs[18] = new Ob();
            storage.Obs[18].x = (w / 8 * 6) + (w / 8 / 3);
            storage.Obs[18].y = 100;
            storage.Obs[18].location = 3;
            storage.Obs[18].next_location = 2;
            storage.Obs[18].option = "use";
            storage.Obs[18].option_text = "Это лестница";
            storage.Obs[18].number_cards = -1;
            storage.Obs[18].num = 1;
            storage.Obs[18].img = new Bitmap[1][1];
            storage.Obs[18].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room3door1);
            storage.Obs[18].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[18].img[0][0], w, h, true);
        }
        {
            storage.Obs[19] = new Ob();
            storage.Obs[19].x = w / 8 / 4;
            storage.Obs[19].y = 100;
            storage.Obs[19].location = 3;
            storage.Obs[19].next_location = 4;
            storage.Obs[19].option = "use";
            storage.Obs[19].option_text = "Это дверь";
            storage.Obs[19].number_cards = -1;
            storage.Obs[19].num = 1;
            storage.Obs[19].img = new Bitmap[1][1];
            storage.Obs[19].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room3door3);
            storage.Obs[19].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[19].img[0][0], w, h, true);
        }
        {
            storage.Obs[25] = new Ob();
            storage.Obs[25].x = (w / 8 * 4) + (w / 8 / 2) + (w / 8 / 3) + (w / 8 / 5);
            storage.Obs[25].y = 100;
            storage.Obs[25].location = 3;
            storage.Obs[25].next_location = -1;
            storage.Obs[25].option = "blue";
            storage.Obs[25].option_text = "столб3";
            storage.Obs[25].num = 1;
            storage.Obs[25].img = new Bitmap[1][1];
            storage.Obs[25].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room3hide);
            storage.Obs[25].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[25].img[0][0], w, h, true);
        }
        {
            storage.Obs[52] = new Ob();
            storage.Obs[52].x = (w / 8);
            storage.Obs[52].y = (h / 6);
            storage.Obs[52].location = 3;
            storage.Obs[52].next_location = -1;
            storage.Obs[52].option = "use";
            storage.Obs[52].option_text = "кукла";
            storage.Obs[52].number_cards = 11;
            storage.Obs[52].num = 0;
            storage.Obs[52].frame = 0;
            storage.Obs[52].img = new Bitmap[1][1];
            {
                storage.Obs[52].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room3pred1);
                storage.Obs[52].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[52].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[53] = new Ob();
            storage.Obs[53].x = (w / 8) * 4;
            storage.Obs[53].y = (h / 6) * 3 - (h / 6 / 4);
            storage.Obs[53].location = 3;
            storage.Obs[53].next_location = -1;
            storage.Obs[53].option = "use";
            storage.Obs[53].option_text = "картина";
            storage.Obs[53].number_cards = 11;
            storage.Obs[53].num = 0;
            storage.Obs[53].frame = 0;
            storage.Obs[53].img = new Bitmap[1][1];
            {
                storage.Obs[53].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room3pred2);
                storage.Obs[53].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[53].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[54] = new Ob();
            storage.Obs[54].x = (w / 8) * 4 + (w / 8 / 2) - (w / 8 / 5);
            storage.Obs[54].y = (h / 6);
            storage.Obs[54].location = 3;
            storage.Obs[54].next_location = -1;
            storage.Obs[54].option = "uses";
            storage.Obs[54].option_text = "плакат розыска";
            storage.Obs[54].number_cards = 11;
            storage.Obs[54].num = 0;
            storage.Obs[54].frame = 0;
            storage.Obs[54].img = new Bitmap[1][1];
            {
                storage.Obs[54].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room3pred3);
                storage.Obs[54].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[54].img[0][0], w, h, true);
            }
        }

        //ROOM4
        {
            storage.Obs[20] = new Ob();
            storage.Obs[20].x = 0;
            storage.Obs[20].y = 0;
            storage.Obs[20].location = 4;
            storage.Obs[20].option = "background";
            storage.Obs[20].num = 0;
            storage.Obs[20].frame = 0;
            storage.Obs[20].img = new Bitmap[1][8];
            {
                storage.Obs[20].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.roomv51);
                storage.Obs[20].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[20].img[0][0], w, h, true);
                storage.Obs[20].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.roomv52);
                storage.Obs[20].img[0][1] = Bitmap.createScaledBitmap(storage.Obs[20].img[0][1], w, h, true);
                storage.Obs[20].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.roomv53);
                storage.Obs[20].img[0][2] = Bitmap.createScaledBitmap(storage.Obs[20].img[0][2], w, h, true);
                storage.Obs[20].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.roomv54);
                storage.Obs[20].img[0][3] = Bitmap.createScaledBitmap(storage.Obs[20].img[0][3], w, h, true);
                storage.Obs[20].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.roomv55);
                storage.Obs[20].img[0][4] = Bitmap.createScaledBitmap(storage.Obs[20].img[0][4], w, h, true);
                storage.Obs[20].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.roomv56);
                storage.Obs[20].img[0][5] = Bitmap.createScaledBitmap(storage.Obs[20].img[0][5], w, h, true);
                storage.Obs[20].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.roomv57);
                storage.Obs[20].img[0][6] = Bitmap.createScaledBitmap(storage.Obs[20].img[0][6], w, h, true);
                storage.Obs[20].img[0][7] = BitmapFactory.decodeResource(getResources(), R.drawable.roomv58);
                storage.Obs[20].img[0][7] = Bitmap.createScaledBitmap(storage.Obs[20].img[0][7], w, h, true);

                for (int i = 0; i < storage.Obs[20].img[0].length; i++) {
                    storage.Obs[20].img[0][i] = Bitmap.createScaledBitmap(storage.Obs[20].img[0][i], w, h, true);
                }
            }
        }
        {
            storage.Obs[21] = new Ob();
            storage.Obs[21].x = w / 8 / 3;
            storage.Obs[21].y = 100;
            storage.Obs[21].location = 4;
            storage.Obs[21].next_location = 3;
            storage.Obs[21].option = "use";
            storage.Obs[21].option_text = "Это дверь";
            storage.Obs[21].number_cards = -1;
            storage.Obs[21].num = 1;
            storage.Obs[21].img = new Bitmap[1][1];
            storage.Obs[21].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room4door1);
            storage.Obs[21].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[21].img[0][0], w, h, true);
        }
        {
            storage.Obs[22] = new Ob();
            storage.Obs[22].x = (w / 8) * 7 - (w / 8 / 2);
            storage.Obs[22].y = 100;
            storage.Obs[22].location = 4;
            storage.Obs[22].next_location = 5;
            storage.Obs[22].option = "use";
            storage.Obs[22].option_text = "Это дверь";
            storage.Obs[22].number_cards = -1;
            storage.Obs[22].num = 1;
            storage.Obs[22].img = new Bitmap[1][1];
            storage.Obs[22].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room4door2);
            storage.Obs[22].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[22].img[0][0], w, h, true);
        }
        {
            storage.Obs[26] = new Ob();
            storage.Obs[26].x = w / 8;
            storage.Obs[26].y = 100;
            storage.Obs[26].location = 4;
            storage.Obs[26].next_location = -1;
            storage.Obs[26].option = "blue";
            storage.Obs[26].option_text = "столб4";
            storage.Obs[26].number_cards = -1;
            storage.Obs[26].num = 1;
            storage.Obs[26].img = new Bitmap[1][1];
            storage.Obs[26].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room4hide);
            storage.Obs[26].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[26].img[0][0], w, h, true);
        }
        {
            storage.Obs[36] = new Ob();
            storage.Obs[36].x = (w / 8) * 2 - (w / 8 / 2);
            storage.Obs[36].y = (h / 6) * 3;
            storage.Obs[36].location = 4;
            storage.Obs[36].next_location = -1;
            storage.Obs[36].option = "use";
            storage.Obs[36].option_text = "горшок";
            storage.Obs[36].number_cards = 11;
            storage.Obs[36].num = 0;
            storage.Obs[36].frame = 0;
            storage.Obs[36].img = new Bitmap[1][1];
            {
                storage.Obs[36].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room4pred4);
                storage.Obs[36].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[36].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[37] = new Ob();
            storage.Obs[37].x = (w / 8) * 4 + (w / 8 / 3) + (w / 8 / 4);
            storage.Obs[37].y = (h / 6) * 3;
            storage.Obs[37].location = 4;
            storage.Obs[37].next_location = -1;
            storage.Obs[37].option = "use";
            storage.Obs[37].option_text = "джем";
            storage.Obs[37].number_cards = 12;
            storage.Obs[37].num = 0;
            storage.Obs[37].frame = 0;
            storage.Obs[37].img = new Bitmap[1][1];
            {
                storage.Obs[37].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room4pred3);
                storage.Obs[37].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[37].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[38] = new Ob();
            storage.Obs[38].x = (w / 8) * 5 + (w / 8 / 2) + (w / 8 / 4);
            storage.Obs[38].y = (h / 6) * 3;
            storage.Obs[38].location = 4;
            storage.Obs[38].next_location = -1;
            storage.Obs[38].option = "use";
            storage.Obs[38].option_text = "джем2";
            storage.Obs[38].number_cards = 13;
            storage.Obs[38].num = 0;
            storage.Obs[38].frame = 0;
            storage.Obs[38].img = new Bitmap[1][1];
            {
                storage.Obs[38].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room4pred2);
                storage.Obs[38].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[38].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[39] = new Ob();
            storage.Obs[39].x = (w / 8) * 3 - (w / 8 / 3);
            storage.Obs[39].y = (h / 6) * 3;
            storage.Obs[39].location = 4;
            storage.Obs[39].next_location = -1;
            storage.Obs[39].option = "use";
            storage.Obs[39].option_text = "тарелка";
            storage.Obs[39].number_cards = 14;
            storage.Obs[39].num = 0;
            storage.Obs[39].frame = 0;
            storage.Obs[39].img = new Bitmap[1][1];
            {
                storage.Obs[39].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room4pred1);
                storage.Obs[39].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[39].img[0][0], w, h, true);
            }
        }
        /*{
            storage.Obs[31] = new Ob();
            storage.Obs[31].x = (w / 8)*2-(w/8/4);
            storage.Obs[31].y = 100;
            storage.Obs[31].location = 1;
            storage.Obs[31].next_location = -1;
            storage.Obs[31].option = "use";
            storage.Obs[31].option_text = "коробочка";
            storage.Obs[31].number_cards = -1;
            storage.Obs[31].num = 1;
            storage.Obs[31].img = new Bitmap[1][1];
            storage.Obs[31].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room1yel5);
            storage.Obs[31].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[31].img[0][0], w, h, true);
        }

         */

        //ROOM5
        {
            storage.Obs[35] = new Ob();
            storage.Obs[35].x = 0;
            storage.Obs[35].y = 0;
            storage.Obs[35].location = 5;
            storage.Obs[35].option = "background";
            storage.Obs[35].num = 0;
            storage.Obs[35].frame = 0;
            if(anime) {
                storage.Obs[35].img = new Bitmap[1][10];
                {
                    storage.Obs[35].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp1);
                    storage.Obs[35].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp2);
                    storage.Obs[35].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp3);
                    storage.Obs[35].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp4);
                    storage.Obs[35].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp5);
                    storage.Obs[35].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp6);
                    storage.Obs[35].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp7);
                    storage.Obs[35].img[0][7] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp8);
                    storage.Obs[35].img[0][8] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp9);
                    storage.Obs[35].img[0][9] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp10);
                    for (int i = 0; i < storage.Obs[35].img[0].length; i++) {
                        storage.Obs[35].img[0][i] = Bitmap.createScaledBitmap(storage.Obs[35].img[0][i], w, h, true);
                    }
                }
            }else{
                storage.Obs[35].img = new Bitmap[1][1];
                storage.Obs[35].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp1);
                storage.Obs[35].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[35].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[40] = new Ob();
            storage.Obs[40].x = w / 8 / 3;
            storage.Obs[40].y = 100;
            storage.Obs[40].location = 5;
            storage.Obs[40].next_location = 7;
            storage.Obs[40].option = "use";
            storage.Obs[40].option_text = "Это дверь";
            storage.Obs[40].number_cards = -1;
            storage.Obs[40].num = 1;
            storage.Obs[40].img = new Bitmap[1][1];
            storage.Obs[40].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp5door2);
            storage.Obs[40].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[40].img[0][0], w, h, true);
        }
        {
            storage.Obs[41] = new Ob();
            storage.Obs[41].x = (w / 8) * 7 - (w / 8 / 2);
            storage.Obs[41].y = 100;
            storage.Obs[41].location = 5;
            storage.Obs[41].next_location = 4;
            storage.Obs[41].option = "use";
            storage.Obs[41].option_text = "Это лестница";
            storage.Obs[41].number_cards = -1;
            storage.Obs[41].num = 1;
            storage.Obs[41].img = new Bitmap[1][1];
            storage.Obs[41].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp5door1);
            storage.Obs[41].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[41].img[0][0], w, h, true);
        }
        {
            storage.Obs[42] = new Ob();
            storage.Obs[42].x = (w / 8) * 2 + (w / 8 / 3);
            storage.Obs[42].y = 100;
            storage.Obs[42].location = 5;
            storage.Obs[42].next_location = -1;
            storage.Obs[42].option = "blue";
            storage.Obs[42].option_text = "столб5";
            storage.Obs[42].number_cards = 3;
            storage.Obs[42].num = 1;
            storage.Obs[42].img = new Bitmap[1][1];
            storage.Obs[42].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp5hide);
            storage.Obs[42].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[42].img[0][0], w, h, true);
        }
        {
            storage.Obs[43] = new Ob();
            storage.Obs[43].x = (w / 8) * 5;
            storage.Obs[43].y = (h / 6) * 5;
            storage.Obs[43].location = 5;
            storage.Obs[43].next_location = -1;
            storage.Obs[43].option = "use";
            storage.Obs[43].option_text = "кукла";
            storage.Obs[43].number_cards = 15;
            storage.Obs[43].num = 0;
            storage.Obs[43].frame = 0;
            storage.Obs[43].img = new Bitmap[1][1];
            {
                storage.Obs[43].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp5pred1);
                storage.Obs[43].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[43].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[44] = new Ob();
            storage.Obs[44].x = (w / 8) * 3 + (w / 8 / 2) + (w / 8 / 3);
            storage.Obs[44].y = (h / 6) * 3;
            storage.Obs[44].location = 5;
            storage.Obs[44].next_location = -1;
            storage.Obs[44].option = "use";
            storage.Obs[44].option_text = "кастрюля";
            storage.Obs[44].number_cards = 16;
            storage.Obs[44].num = 0;
            storage.Obs[44].frame = 0;
            storage.Obs[44].img = new Bitmap[1][1];
            {
                storage.Obs[44].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp5pred2);
                storage.Obs[44].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[44].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[45] = new Ob();
            storage.Obs[45].x = (w / 8) * 2 - (w / 8 / 4);
            storage.Obs[45].y = (h / 6) * 3 - (h / 6 / 3);
            storage.Obs[45].location = 5;
            storage.Obs[45].next_location = -1;
            storage.Obs[45].option = "use";
            storage.Obs[45].option_text = "тарелки";
            storage.Obs[45].number_cards = 17;
            storage.Obs[45].num = 0;
            storage.Obs[45].frame = 0;
            storage.Obs[45].img = new Bitmap[1][1];
            {
                storage.Obs[45].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.roomp5pred3);
                storage.Obs[45].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[45].img[0][0], w, h, true);
            }
        }


        //ROOM6
        {
            storage.Obs[31] = new Ob();
            storage.Obs[31].x = 0;
            storage.Obs[31].y = 0;
            storage.Obs[31].location = 6;
            storage.Obs[31].option = "background";
            storage.Obs[31].num = 0;
            storage.Obs[31].frame = 0;
            storage.Obs[31].img = new Bitmap[1][1];

            storage.Obs[31].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room666);
            storage.Obs[31].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[31].img[0][0], w, h, true);
        }
        {
            storage.Obs[55] = new Ob();
            storage.Obs[55].x = (w / 8) * 2 + (w / 8) / 4;
            storage.Obs[55].y = 100;
            storage.Obs[55].location = 6;
            storage.Obs[55].next_location = 3;
            storage.Obs[55].option = "use";
            storage.Obs[55].option_text = "Это дверь";
            storage.Obs[55].number_cards = -1;
            storage.Obs[55].num = 1;
            storage.Obs[55].img = new Bitmap[1][1];
            storage.Obs[55].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room6door1);
            storage.Obs[55].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[55].img[0][0], w, h, true);
        }

        {
            storage.Obs[56] = new Ob();
            storage.Obs[56].x = (w / 8) * 4;
            storage.Obs[56].y = (h / 6) * 3;
            storage.Obs[56].location = 6;
            storage.Obs[56].next_location = -1;
            storage.Obs[56].option = "use";
            storage.Obs[56].option_text = "зеркало";
            storage.Obs[56].number_cards = 15;
            storage.Obs[56].num = 0;
            storage.Obs[56].frame = 0;
            storage.Obs[56].img = new Bitmap[1][1];
            {
                storage.Obs[56].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room6mirrow);
                storage.Obs[56].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[56].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[57] = new Ob();
            storage.Obs[57].x = (w / 8) * 4 + (w / 8 / 2);
            storage.Obs[57].y = (h / 6) * 2 - (h / 6 / 3);
            storage.Obs[57].location = 6;
            storage.Obs[57].next_location = -1;
            storage.Obs[57].option = "use";
            storage.Obs[57].option_text = "картина";
            storage.Obs[57].number_cards = 15;
            storage.Obs[57].num = 0;
            storage.Obs[57].frame = 0;
            storage.Obs[57].img = new Bitmap[1][1];
            {
                storage.Obs[57].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room6pred4);
                storage.Obs[57].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[57].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[58] = new Ob();
            storage.Obs[58].x = (w / 8);
            storage.Obs[58].y = (h / 6) * 5;
            storage.Obs[58].location = 6;
            storage.Obs[58].next_location = -1;
            storage.Obs[58].option = "use";
            storage.Obs[58].option_text = "сапоги";
            storage.Obs[58].number_cards = 15;
            storage.Obs[58].num = 0;
            storage.Obs[58].frame = 0;
            storage.Obs[58].img = new Bitmap[1][1];
            {
                storage.Obs[58].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room6pred3);
                storage.Obs[58].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[58].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[59] = new Ob();
            storage.Obs[59].x = (w / 8) * 6;
            storage.Obs[59].y = (h / 6) * 5;
            storage.Obs[59].location = 6;
            storage.Obs[59].next_location = -1;
            storage.Obs[59].option = "use";
            storage.Obs[59].option_text = "куружка";
            storage.Obs[59].number_cards = 15;
            storage.Obs[59].num = 0;
            storage.Obs[59].frame = 0;
            storage.Obs[59].img = new Bitmap[1][1];
            {
                storage.Obs[59].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room6pred2);
                storage.Obs[59].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[59].img[0][0], w, h, true);
            }
        }
        {
            storage.Obs[60] = new Ob();
            storage.Obs[60].x = (w / 8) * 5 - (w / 8 / 4);
            storage.Obs[60].y = (h / 6) * 2;
            storage.Obs[60].location = 6;
            storage.Obs[60].next_location = -1;
            storage.Obs[60].option = "use";
            storage.Obs[60].option_text = "одежда";
            storage.Obs[60].number_cards = 15;
            storage.Obs[60].num = 0;
            storage.Obs[60].frame = 0;
            storage.Obs[60].img = new Bitmap[1][1];
            {
                storage.Obs[60].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room6pred1);
                storage.Obs[60].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[60].img[0][0], w, h, true);
            }
        }


        //ROOM7
        {
            storage.Obs[46] = new Ob();
            storage.Obs[46].x = 0;
            storage.Obs[46].y = 0;
            storage.Obs[46].location = 7;
            storage.Obs[46].option = "background";
            storage.Obs[46].num = 0;
            storage.Obs[46].frame = 0;
            storage.Obs[46].img = new Bitmap[1][7];

            {
                storage.Obs[46].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room81);
                storage.Obs[46].img[0][1] = BitmapFactory.decodeResource(getResources(), R.drawable.room82);
                storage.Obs[46].img[0][2] = BitmapFactory.decodeResource(getResources(), R.drawable.room83);
                storage.Obs[46].img[0][3] = BitmapFactory.decodeResource(getResources(), R.drawable.room84);
                storage.Obs[46].img[0][4] = BitmapFactory.decodeResource(getResources(), R.drawable.room85);
                storage.Obs[46].img[0][5] = BitmapFactory.decodeResource(getResources(), R.drawable.room86);
                storage.Obs[46].img[0][6] = BitmapFactory.decodeResource(getResources(), R.drawable.room87);
                for (int i = 0; i < storage.Obs[46].img[0].length; i++) {
                    storage.Obs[46].img[0][i] = Bitmap.createScaledBitmap(storage.Obs[46].img[0][i], w, h, true);
                }
            }
        }
        {
            storage.Obs[47] = new Ob();
            storage.Obs[47].x = (w / 8) * 6;
            storage.Obs[47].y = 100;
            storage.Obs[47].location = 7;
            storage.Obs[47].next_location = 1;
            storage.Obs[47].option = "use";
            storage.Obs[47].option_text = "Это дверь";
            storage.Obs[47].number_cards = -1;
            storage.Obs[47].num = 1;
            storage.Obs[47].img = new Bitmap[1][1];
            storage.Obs[47].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room7door2);
            storage.Obs[47].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[47].img[0][0], w, h, true);
        }
        {
            storage.Obs[48] = new Ob();
            storage.Obs[48].x = w / 8 / 3;
            storage.Obs[48].y = 100;
            storage.Obs[48].location = 7;
            storage.Obs[48].next_location = 5;
            storage.Obs[48].option = "use";
            storage.Obs[48].option_text = "Это дверь";
            storage.Obs[48].number_cards = -1;
            storage.Obs[48].num = 1;
            storage.Obs[48].img = new Bitmap[1][1];
            storage.Obs[48].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room7door1);
            storage.Obs[48].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[48].img[0][0], w, h, true);
        }
        {
            storage.Obs[49] = new Ob();
            storage.Obs[49].x = (w / 8) + (w / 8 / 2);
            storage.Obs[49].y = (h / 6) * 3;
            storage.Obs[49].location = 7;
            storage.Obs[49].next_location = -1;
            storage.Obs[49].option = "use";
            storage.Obs[49].option_text = "клетка";
            storage.Obs[49].number_cards = 16;
            storage.Obs[49].num = 0;
            storage.Obs[49].frame = 0;
            storage.Obs[49].img = new Bitmap[1][1];
            {
                storage.Obs[49].img[0][0] = BitmapFactory.decodeResource(getResources(), R.drawable.room7cell);
                storage.Obs[49].img[0][0] = Bitmap.createScaledBitmap(storage.Obs[49].img[0][0], w, h, true);
            }
        }
    }




    public void set_rooms(){

        tr = new tree_rooms(1);
        tree_rooms tr2 = new tree_rooms(2);
        tree_rooms tr3 = new tree_rooms(3);
        tree_rooms tr4 = new tree_rooms(4);

        tr.next_room.add(tr2);
        tr2.next_room.add(tr);
        tr2.next_room.add(tr3);
        tr3.next_room.add(tr2);
        tr3.next_room.add(tr4);
        tr4.next_room.add(tr);
        tr4.next_room.add(tr3);


        tr.go_objects.add(storage.Obs[2]);
        tr2.go_objects.add(storage.Obs[6]);
        tr2.go_objects.add(storage.Obs[7]);
        tr3.go_objects.add(storage.Obs[16]);
        tr3.go_objects.add(storage.Obs[17]);
        tr4.go_objects.add(storage.Obs[22]);
        tr4.go_objects.add(storage.Obs[21]);
        storage.Obs[15].room = tr4;
    }

    boolean table(double getx, double gety) {
        But[] buttons =games.gui.Bu;
        if ((getx - buttons[0].x) * (getx - buttons[0].x) + (gety - buttons[0].y) * (gety - buttons[0].y) <= buttons[0].R * buttons[0].R) {
            if (storage.Obs[4].pos_table==0) {
                setContentView(R.layout.maps);
                games.pos="in book";
            }
        }
        return false;
    }


    void cart(float x, float y) {
        But[] buttons =games.gui.Bu;
        if ((x - buttons[3].x) * (x - buttons[3].x) + (y - buttons[3].y) * (y - buttons[3].y) <= buttons[3].R * buttons[3].R) {
            if (storage.Obs[32].pos_table==0){
                storage.Obs[32].pos_table=1;


            }else{
                storage.Obs[32].pos_table=0;

            }
        }
    }
    void step(){
        storage.Obs[32].toch_girl=storage.Obs[15].location;
        storage.Obs[32].toch_hero=storage.Obs[0].location;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        {
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        setContentView(R.layout.activity_main);
        //SongStep = MediaPlayer.create(MainActivity.this, R.raw.godova);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        w=metrics.widthPixels;
        h=metrics.heightPixels;





            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card1));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card2));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card3));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card4));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card5));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card6));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card7));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card8));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card9));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card10));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card11));
            card_img.add(BitmapFactory.decodeResource(getResources(), R.drawable.card12));
            for (int i = 0; i < card_img.size(); i++) {
                card_img.set(i, Bitmap.createScaledBitmap((Bitmap) card_img.get(i), 60, 115, true));
            }





        MainActivity ctx = this;
        handler = new Handler();

        //play_step();



        runnable = new Runnable() {
            @Override
            public void run() {
                if (start) {
                    if (games.pos == "in home") {
                        games.animate();
                        games.T16();
                        games.animate_girls();
                        games.use_chek();
                        games.check();
                        games.move_cards();
                        step();

                        DrawView drawView = new DrawView(ctx, storage, games);
                        setContentView(drawView);

                    }
                    if (games.pos == "in book") {
                        button_cards();
                    } else if (games.pos == "end") {
                        setContentView(R.layout.end);
                    }
                    Log.i("yyy", games.pos);


                }
                handler.postDelayed(this, kk);
            }

        };
        handler.postDelayed(runnable, 100);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        But[] buttons=games.gui.Bu;
        switch (event.getAction()) {
            case (MotionEvent.ACTION_DOWN):
                if (games.pos == "in home"& (games.state == "in game"  | games.state=="sits") ) {
                    cart(event.getX(), event.getY());
                }
                if (games.state == "in game" & games.pos == "in home") {
                    if ((event.getX()- buttons[1].x) * (event.getX() - buttons[1].x) + (event.getY() - buttons[1].y) * (event.getY()  - buttons[1].y) <= buttons[1].R * buttons[1].R) {
                        games.v = games.step * (-1);

                    }
                    if((event.getX()- buttons[2].x) * (event.getX() - buttons[2].x) + (event.getY() - buttons[2].y) * (event.getY()  - buttons[2].y) <= buttons[2].R * buttons[2].R){
                        games.v = games.step;

                    }
                break;
            }
            case (MotionEvent.ACTION_UP):
                if (games.pos == "in home"& (games.state == "in game"  | games.state=="sits") ){
                    games.v = 0;

                    Log.i("rerere", "mishka");
                    if (games.v == 0) {
                        this.table(event.getX(), event.getY());
                        //games.tab_chek(event.getX());

                    }

                    games.double_click(last_time, event.getY());
                }
                if (2*buttons[1].R<event.getY() & event.getY()<h-2*buttons[1].R) {
                    last_time = System.currentTimeMillis();
                }

                break;
        }
        return true;
    }

    public void start(){
        games.pos="not in home";
        setContentView(R.layout.activity_main);
    }


    public void startgame(View view) {

        SetStor();
        storage.set_cards(card_img, w, h);
        for (int i = 0; i<storage.cards.size(); i ++){
            ArrayList k = (ArrayList)storage.cards.get(i);
        }
        games = new game(storage, w, h, kk);
        set_rooms();
        games.pos = "in home";
        start = true;


    }

    public void exit_the_book(View view) {
    }
    public void close_table(View view) {
        games.pos="in home";
    }

    public void off_anime(View view) {
            anime=true;
    }

    public void B1(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("Говорят, что ведьмы бывают природные и ученые.\n Ученые ведьмы перенимают чары у колдуний, нечаянно взяв у умирающей какой-то предмет или нарочно вступив в сговор с нечистой силой. \n Та женщина, которая хочет сделаться ведьмой, должна отречься от всех родных.\n При этом она должна стоять на перекрестке (это нечистое место, где всегда много клубится чертей)\n, бросив под ноги ликом вниз икону. После отречения перед ведьмой появится громаднейшая жаба \n с разинутой пастью, в которую нужно влезть. \n Если женщина испугается и вернется домой, то непременно умрет.");//прям здесь могу написать текст для карты 5
    }

    public void B2(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }

    public void B3(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }

    public void B4(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }

    public void B5(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }

    public void B6(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }

    public void B7(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }

    public void B8(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }
    public void B9(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }
    public void B10(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }
    public void B11(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }
    public void B12(View view) {
        TextView text=(TextView) findViewById(R.id.textView4);
        text.setText("text");//прям здесь могу написать текст для карты 5
    }

}

