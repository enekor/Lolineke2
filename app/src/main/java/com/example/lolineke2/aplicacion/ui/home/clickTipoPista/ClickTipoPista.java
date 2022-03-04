package com.example.lolineke2.aplicacion.ui.home.clickTipoPista;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.R;
import com.example.lolineke2.aplicacion.ui.home.Intercambio;
import com.example.lolineke2.aplicacion.ui.home.clickPista.ClickPista;
import com.example.lolineke2.databinding.FragmentClickTipoPistaBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ClickTipoPista#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ClickTipoPista extends Fragment {

    private FragmentClickTipoPistaBinding binding;
    public ClickTipoPista() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClickTipoPista.
     */
    // TODO: Rename and change types and number of parameters
    public static ClickTipoPista newInstance(String param1, String param2) {
        ClickTipoPista fragment = new ClickTipoPista();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentClickTipoPistaBinding.inflate(inflater,container,false);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClickPista clickPista = new ClickPista();
                Intercambio.getInstance().getAlquilarActivity().changeFragment(clickPista);
            }
        });
        return binding.getRoot();
    }
}