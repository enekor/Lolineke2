package com.example.lolineke2.loginRegister;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lolineke2.aplicacion.Home;
import com.example.lolineke2.aplicacion.ui.Intercambio;
import com.example.lolineke2.databinding.FragmentLoginBinding;
import com.example.lolineke2.aplicacion.rest.Api;
import com.example.lolineke2.aplicacion.rest.ApiConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Login extends Fragment {

    private FragmentLoginBinding binding;
    private Api api;

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
        api= ApiConfig.getClient().create(Api.class);
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
                    Call<String> login=api.loginWithoutToken(binding.etEmailLogin.getText().toString(),
                            binding.etPasswordLogin.getText().toString());
                    login.enqueue(new Callback<String>() {
                        @Override
                        public void onResponse(Call<String> call, Response<String> response) {
                            if(response.isSuccessful()&&response.code()==200){
                                String token=response.body();
                                openActivity(Home.class);
                                getActivity().finish();
                            }else{
                                Toast.makeText(getActivity(), "Error en petición", Toast.LENGTH_SHORT).show();
                            }
                        }
                        @Override
                        public void onFailure(Call<String> call, Throwable t) {
                            Toast.makeText(getActivity(), "Error en petición", Toast.LENGTH_SHORT).show();
                        }
                    });
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