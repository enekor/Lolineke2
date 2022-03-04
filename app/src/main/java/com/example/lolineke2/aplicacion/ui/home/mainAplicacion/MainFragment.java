package com.example.lolineke2.aplicacion.ui.home.mainAplicacion;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.R;
import com.example.lolineke2.aplicacion.ui.home.Intercambio;
import com.example.lolineke2.aplicacion.ui.home.clickTipoPista.ClickTipoPista;
import com.example.lolineke2.databinding.FragmentMainBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {

    private FragmentMainBinding binding;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
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

        binding.logoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClickTipoPista clickTipoPista = new ClickTipoPista();
                Intercambio.getInstance().getAlquilarActivity().changeFragment(clickTipoPista);
            }
        });
        return binding.getRoot();
    }
}