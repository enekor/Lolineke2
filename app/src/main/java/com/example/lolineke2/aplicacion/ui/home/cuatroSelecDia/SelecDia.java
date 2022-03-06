package com.example.lolineke2.aplicacion.ui.home.cuatroSelecDia;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.aplicacion.ui.Intercambio;
import com.example.lolineke2.aplicacion.ui.home.cincoSelecHora.SelecHora;
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

        setOnClick();

        return binding.getRoot();
    }

    private void setOnClick(){

        binding.selecHoraDia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkFields()){
                    Intercambio.getInstance().getFragmentHolder().changeFragment(new SelecHora());
                }else{
                    Toast.makeText(getActivity(), "Hay campos vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.backDia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }

    private boolean checkFields(){
        return !binding.nombreDeQuien.getText().toString().equalsIgnoreCase("");
    }
}