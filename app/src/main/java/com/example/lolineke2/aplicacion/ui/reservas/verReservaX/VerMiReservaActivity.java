package com.example.lolineke2.aplicacion.ui.reservas.verReservaX;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.lolineke2.aplicacion.Home;
import com.example.lolineke2.aplicacion.rest.model.Alquiler;
import com.example.lolineke2.aplicacion.ui.Intercambio;
import com.example.lolineke2.databinding.ActivityVerMiReservaBinding;

public class VerMiReservaActivity extends AppCompatActivity {

    private ActivityVerMiReservaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityVerMiReservaBinding.inflate(getLayoutInflater());

        Alquiler alquiler = Intercambio.getInstance().getAlquiler();
        //binding.tvAnombredeReservaInfo.setText(alquiler.getCliente().getNombre());
        binding.tvDescripcionReservaInfo.setText(alquiler.getInfraestructura().getDescripcion());
        binding.tvDiaReservaInfo.setText(alquiler.getFecha());
        binding.tvPistanameReservaInfo.setText(alquiler.getInfraestructura().getNombre());
        binding.tvPrecioReservaInfo.setText(String.valueOf(alquiler.getCoste()));
        binding.tvHoraReservaInfo.setText(alquiler.getInicio()+":00 - "+alquiler.getFin()+":00");

        setOnClick();

        setContentView(binding.getRoot());
    }

    private void setOnClick(){
        binding.buttonBackReservaInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.buttonDeleteReservaInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VerMiReservaActivity.this, "Reserva eliminada con exito", Toast.LENGTH_SHORT).show();

                Intent homeActivity = new Intent(VerMiReservaActivity.this, Home.class);
                startActivity(homeActivity);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent homeActivity = new Intent(VerMiReservaActivity.this, Home.class);
        startActivity(homeActivity);
        finish();
    }
}