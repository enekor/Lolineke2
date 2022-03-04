package com.example.lolineke2.aplicacion.ui.home.clickPista;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.R;
import com.example.lolineke2.aplicacion.ui.home.Intercambio;
import com.example.lolineke2.aplicacion.ui.home.selecDia.SelecDia;
import com.example.lolineke2.databinding.FragmentClickPistaBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ClickPista#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ClickPista extends Fragment {

    private FragmentClickPistaBinding binding;
    public ClickPista() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClickPista.
     */
    // TODO: Rename and change types and number of parameters
    public static ClickPista newInstance(String param1, String param2) {
        ClickPista fragment = new ClickPista();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentClickPistaBinding.inflate(inflater,container,false);

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelecDia selecDia = new SelecDia();
                Intercambio.getInstance().getAlquilarActivity().changeFragment(selecDia);
            }
        });
        return binding.getRoot();
    }
}