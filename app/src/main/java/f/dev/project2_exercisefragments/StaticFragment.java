package f.dev.project2_exercisefragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by sati on 30/06/2015.
 */
public class StaticFragment extends Fragment {

    OnPokemonClicked listener = null;

    ImageView imagePokemon;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        //Comunicaacion establecida de este fragmento con la actividad
        try{
            this.setListener((MainActivity)activity);
        }catch (ClassCastException e){
            e.printStackTrace();
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.static_fragment, container, false);

        //Despues de encontrar el image view

        imagePokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.pokemonClicked();
            }
        });

        return viewRoot;    }


    public void setListener(OnPokemonClicked listener) {
        this.listener = listener;
    }

    public interface OnPokemonClicked {

        void pokemonClicked();
    }
}
