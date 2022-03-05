package com.example.lolineke2.aplicacion.ui.home.cincoSelecHora;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.aplicacion.ui.Intercambio;
import com.example.lolineke2.aplicacion.ui.home.seisReservaPreview.ReservaPreview;
import com.example.lolineke2.databinding.FragmentSelecHoraBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SelecHora#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SelecHora extends Fragment {

    private FragmentSelecHoraBinding binding;

    public SelecHora() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment selecHora.
     */
    // TODO: Rename and change types and number of parameters
    public static SelecHora newInstance(String param1, String param2) {
        SelecHora fragment = new SelecHora();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSelecHoraBinding.inflate(inflater,container,false);

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReservaPreview preview = new ReservaPreview();
                Intercambio.getInstance().getFragmentHolder().changeFragment(preview);
            }
        });
        return binding.getRoot();
    }
}