package com.spaghetti.postal.prova2.TilePK;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.spaghetti.postal.prova2.R;
import com.spaghetti.postal.prova2.Util.ScaricaImmagine;


/**
 * Created by postal on 13/04/17.
 */

public class CorpoLayout extends LinearLayout {

    private LinearLayout.LayoutParams params;

    public CorpoLayout(Context context, String corpo, String urlFoto) {
        super(context);

        this.setOrientation(LinearLayout.HORIZONTAL);


        params = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        this.setLayoutParams(params);

        //this.setBackgroundColor(Color.YELLOW);
        this.setPadding(0,0,0,20);

        TextView product = new TextView(context);
        product.setPadding(0,0,5,0);
        product.setText(corpo);
        product.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT,100.0f));
        this.addView(product);








        ImageView foto = new ImageView(context);

        foto.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));


        new ScaricaImmagine((ImageView) foto).execute(urlFoto);






        this.addView(foto);


    }


}
