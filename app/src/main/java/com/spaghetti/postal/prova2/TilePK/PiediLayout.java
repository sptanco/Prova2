package com.spaghetti.postal.prova2.TilePK;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by postal on 13/04/17.
 */

public class PiediLayout extends LinearLayout {

    private LinearLayout.LayoutParams params;

    public PiediLayout(Context context, String piedi) {
        super(context);

        this.setOrientation(LinearLayout.HORIZONTAL);


        params = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        this.setLayoutParams(params);

        //this.setBackgroundColor(Color.CYAN);

        TextView product = new TextView(context);
        product.setText(piedi);
        this.addView(product);
    }
}
