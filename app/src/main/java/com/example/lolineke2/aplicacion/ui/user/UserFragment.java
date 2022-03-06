package com.example.lolineke2.aplicacion.ui.user;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.MainActivity;
import com.example.lolineke2.R;
import com.example.lolineke2.databinding.FragmentUserBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UserFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UserFragment extends Fragment {

    private FragmentUserBinding binding;

    public UserFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UserFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UserFragment newInstance(String param1, String param2) {
        UserFragment fragment = new UserFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentUserBinding.inflate(inflater,container,false);

        binding.buttonDarseDeBajaUprofile.setBackgroundColor(Color.RED);

        setOnClick();

        return binding.getRoot();
    }

    private void setOnClick(){
        binding.buttonDarseDeBajaUprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog();
            }
        });

        binding.buttonGoToEditUprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Never gonna give you up, never gonna let you down", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void alertDialog() {
        Dialog dialog = null;

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Desea borrar la cuenta?")
                .setCancelable(false)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                deleteAccount();
                            }
                        })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {}
                        });
        AlertDialog alert = builder.create();

        dialog = alert;
        dialog.show();
    }

    private void deleteAccount(){
        Toast.makeText(getActivity(), "Cuenta borrada con exito", Toast.LENGTH_SHORT).show();

        Intent mainActivity = new Intent(getActivity(),MainActivity.class);
        startActivity(mainActivity);
        getActivity().finish();
    }


}