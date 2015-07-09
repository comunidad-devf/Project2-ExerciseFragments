package f.dev.project2_exercisefragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sati on 30/06/2015.
 */
public class DinamicFragment extends Fragment implements MainActivity.OnPokemonReceived{

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            ((MainActivity)activity).setListener(this);
        }catch (ClassCastException e){
            e.printStackTrace();
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View viewRoot = inflater.inflate(R.layout.dinamic_fragment, container, false);

        return viewRoot;
    }

    @Override
    public void pokemonReceived() {
        //Ejecutar
    }
}
