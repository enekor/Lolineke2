package com.example.lolineke2.aplicacion.ui.home.selecDia;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.R;
import com.example.lolineke2.aplicacion.ui.home.Intercambio;
import com.example.lolineke2.aplicacion.ui.home.selecHora.SelecHora;
import com.example.lolineke2.databinding.FragmentSelecDiaBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SelecDia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SelecDia extends Fragment {

    private FragmentSelecDiaBinding binding;

    public SelecDia() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SelecDia.
     */
    // TODO: Rename and change types and number of parameters
    public static SelecDia newInstance(String param1, String param2) {
        SelecDia fragment = new SelecDia();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSelecDiaBinding.inflate(inflater,container,false);
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelecHora selecHora = new SelecHora();
                Intercambio.getInstance().getAlquilarActivity().changeFragment(selecHora);
            }
        });
        return binding.getRoot();
    }
}