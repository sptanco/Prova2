package com.spaghetti.postal.prova2.TilePK;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spaghetti.postal.prova2.R;

import org.xmlpull.v1.XmlPullParser;

/**
 * Created by postal on 25/04/17.
 */

public class TileFragment extends Fragment {



   // TileLayout layout = new TileLayout(getActivity(), "Trovato gatto a Zambana", "Alla fine ho trovato un gatto incima alla mia casa con del pelo molto bello che non mi dispiace anche perchè è bello morbido al tatto.", "http://www.solegemello.net/gatto.jpg", "Coriere di Postal - 18/04/2017");;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return  inflater.inflate(R.layout.tile_fragment, container, false);

        


    }


}
