package com.example.lolineke2.aplicacion.ui.reservas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.R;
import com.example.lolineke2.aplicacion.ui.Intercambio;
import com.example.lolineke2.aplicacion.ui.reservas.verReservaX.VerMiReservaActivity;
import com.example.lolineke2.databinding.FragmentReservasBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Reservas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Reservas extends Fragment {

    private FragmentReservasBinding binding;
    private List<String> pistas;
    private ArrayAdapter<String> pistasLista;

    public Reservas() { }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Reservas.
     */
    // TODO: Rename and change types and number of parameters
    public static Reservas newInstance(String param1, String param2) {
        Reservas fragment = new Reservas();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentReservasBinding.inflate(inflater,container,false);

        setListInfo();
        setOnClick();

        return binding.getRoot();
    }

    private void setListInfo(){
        pistas = new ArrayList<>(Arrays.asList("uno","dos","tres"));
        pistasLista = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,pistas);
        Log.i("size",""+pistasLista.getCount());
        binding.rvMisReservas.setAdapter(pistasLista);
    }

    private void setOnClick(){
        binding.buttonBackMisReservas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });

        binding.rvMisReservas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent verLaReservaSeleccionada = new Intent(getActivity(),VerMiReservaActivity.class);
                startActivity(verLaReservaSeleccionada);
                getActivity().finish();
            }
        });
    }
}