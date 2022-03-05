package com.example.lolineke2.aplicacion.ui.reservas.verReservaX;

import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.lolineke2.databinding.ActivityVerMiReservaBinding;

public class VerMiReservaActivity extends AppCompatActivity {

    private ActivityVerMiReservaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityVerMiReservaBinding.inflate(getLayoutInflater());

        binding.buttonBackReservaInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        setContentView(binding.getRoot());
    }
}