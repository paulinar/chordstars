package guitarheroes.com.chordstar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlayOnGuitarFrag extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // called by Android system so that fragment creates its UI; returns a View component placed in <fragment> element of layout

        return inflater.inflate(
                R.layout.play_on_guitar_frag, container, false); // inflate layout of XML file and return its view
    }
}
