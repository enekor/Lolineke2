package com.example.lolineke2.aplicacion.ui.home.cincoSelecHora;

import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.aplicacion.ui.Intercambio;
import com.example.lolineke2.aplicacion.ui.home.seisReservaPreview.ReservaPreview;
import com.example.lolineke2.databinding.FragmentSelecHoraBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SelecHora#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SelecHora extends Fragment {

    private FragmentSelecHoraBinding binding;
    private List<String> pistas;
    private ArrayAdapter<String> pistasLista;

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

        setListInfo();
        setOnClick();

        return binding.getRoot();
    }

    private void setListInfo(){
        pistas = new ArrayList<>(Arrays.asList("uno","dos","tres"));
        pistasLista = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,pistas);
        Log.i("size",""+pistasLista.getCount());
        binding.horasLista.setAdapter(pistasLista);
    }

    private void setOnClick(){
        binding.horasLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intercambio.getInstance().getFragmentHolder().changeFragment(new ReservaPreview());
            }
        });

        binding.backHoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }
}