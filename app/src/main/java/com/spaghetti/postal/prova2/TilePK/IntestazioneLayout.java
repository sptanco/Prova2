package com.spaghetti.postal.prova2.TilePK;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by postal on 13/04/17.
 */

public class IntestazioneLayout extends LinearLayout {


    private LinearLayout.LayoutParams params;

    public IntestazioneLayout(Context context, String intestazione) {
        super(context);

        this.setOrientation(LinearLayout.HORIZONTAL);


        params = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        this.setLayoutParams(params);

        //this.setBackgroundColor(Color.RED);

        this.setPadding(0,0,0,50);

        TextView titolo = new TextView(context);
        titolo.setText(intestazione);
        titolo.setTextSize(20);
        titolo.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT,1.0f));
        this.addView(titolo);




        Button opt = new Button(context);
        opt.setBackgroundColor(Color.WHITE);
        opt.setText("...");
        opt.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT,6.0f));
        this.addView(opt);




    }


}
