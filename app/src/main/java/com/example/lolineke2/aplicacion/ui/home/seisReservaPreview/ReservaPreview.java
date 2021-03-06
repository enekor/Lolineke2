package com.example.lolineke2.aplicacion.ui.home.seisReservaPreview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.aplicacion.Home;
import com.example.lolineke2.aplicacion.ui.home.AlquilarActivity;
import com.example.lolineke2.databinding.FragmentReservaPreviewBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ReservaPreview#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReservaPreview extends Fragment {

    private FragmentReservaPreviewBinding binding;

    public ReservaPreview() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ReservaPreview.
     */
    // TODO: Rename and change types and number of parameters
    public static ReservaPreview newInstance(String param1, String param2) {
        ReservaPreview fragment = new ReservaPreview();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentReservaPreviewBinding.inflate(inflater,container,false);

        setOnClick();

        return binding.getRoot();
    }

    private void setOnClick(){
        binding.aceptarPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Reserva creada con exito", Toast.LENGTH_SHORT).show();

                Intent homeActivity = new Intent(getActivity(), Home.class);
                startActivity(homeActivity);
                getActivity().finish();
            }
        });
        binding.backPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }
}