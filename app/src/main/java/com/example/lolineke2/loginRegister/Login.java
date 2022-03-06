package com.example.lolineke2.loginRegister;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.R;
import com.example.lolineke2.aplicacion.Home;
import com.example.lolineke2.aplicacion.ui.Intercambio;
import com.example.lolineke2.databinding.FragmentLoginBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Login extends Fragment {

    private FragmentLoginBinding binding;
    public Login() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Login.
     */
    // TODO: Rename and change types and number of parameters
    public static Login newInstance(String param1, String param2) {
        Login fragment = new Login();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentLoginBinding.inflate(inflater,container,false);

       setOnClick();

        return binding.getRoot();
    }

    private void openActivity(Class clase){
        Intent intent = new Intent(getActivity(),clase);
        startActivity(intent);
    }

    private boolean checkFields(){
        return !binding.etEmailLogin.getText().toString().equalsIgnoreCase("") &&
                !binding.etPasswordLogin.getText().toString().equalsIgnoreCase("");
    }

    private void setOnClick(){
        binding.buttonLoggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkFields()){
                    openActivity(Home.class);
                    getActivity().finish();
                }else{
                    Toast.makeText(getActivity(), "Hay campos vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.buttonGoToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intercambio.getInstance().getFragmentHolder().changeFragment(new Register());
            }
        });
    }
}