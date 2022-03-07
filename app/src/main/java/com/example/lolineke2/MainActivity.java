package com.example.lolineke2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.lolineke2.aplicacion.Home;
import com.example.lolineke2.aplicacion.rest.Api;
import com.example.lolineke2.aplicacion.rest.ApiConfig;
import com.example.lolineke2.aplicacion.rest.model.Usuario;
import com.example.lolineke2.aplicacion.ui.FragmentHolder;
import com.example.lolineke2.aplicacion.ui.Intercambio;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.UUID;

public class MainActivity extends AppCompatActivity implements FragmentHolder {

    private FragmentTransaction transaction;
    private SharedPreferences sharedPreferences;
    private Api api;
    private boolean login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        api= ApiConfig.getClient().create(Api.class);

        sharedPreferences();
    }

    @Override
    public void changeFragment(Fragment f) {
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainerLR,f);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    private void sharedPreferences(){
        sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);

        if(!sharedPreferences.getString("token","null").equalsIgnoreCase("null")){
            checkToken(sharedPreferences.getString("usuario","null"),
                    sharedPreferences.getString("pass","null"),

                    UUID.fromString(sharedPreferences.getString("token","null")));

            if(login){
                finish();
                startActivity(new Intent(this, Home.class));
            }
        }else{
            Intercambio.getInstance().setFragmentHolder(this);
        }
    }

    private void checkToken(String usuario, String pass, UUID token){
        Call<Usuario> user = api.loginWithToken(token,usuario,pass);
        user.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                if(response.isSuccessful() && response.code()==200){
                    login = true;
                    Intercambio.getInstance().setUsuario(new Usuario());
                }else{
                    login = false;
                }
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                login = false;
            }
        });

    }
}