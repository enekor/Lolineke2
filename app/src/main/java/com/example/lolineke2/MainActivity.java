package com.example.lolineke2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.lolineke2.aplicacion.ui.FragmentHolder;
import com.example.lolineke2.aplicacion.ui.Intercambio;

public class MainActivity extends AppCompatActivity implements FragmentHolder {

    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intercambio.getInstance().setFragmentHolder(this);
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
}