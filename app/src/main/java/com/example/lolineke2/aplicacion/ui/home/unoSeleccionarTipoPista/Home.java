package com.example.lolineke2.aplicacion.ui.home.unoSeleccionarTipoPista;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.R;
import com.example.lolineke2.aplicacion.ui.Intercambio;
import com.example.lolineke2.aplicacion.ui.home.AlquilarActivity;
import com.example.lolineke2.aplicacion.ui.home.dosClickTipoPista.ClickTipoPista;
import com.example.lolineke2.databinding.FragmentMainBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home extends Fragment {

    private FragmentMainBinding binding;
    public Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters
    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMainBinding.inflate(inflater,container,false);

        binding.listaHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            String[] deportes = getResources().getStringArray(R.array.deportes);
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intercambio.getInstance().setDeporteSeleccionado(deportes[i]);
                Intent clickTipoPista = new Intent(getActivity(),AlquilarActivity.class);
                startActivity(clickTipoPista);
            }
        });
        return binding.getRoot();
    }
}