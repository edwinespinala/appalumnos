package hn.uth2.appalumnos2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import hn.uth2.appalumnos2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btnSaludar.setOnClickListener(v ->{

             if(binding.edtNombre.getText().toString().isEmpty()){
                 binding.imgSaludar.setVisibility(View.INVISIBLE);
            //  Snackbar.make(binding.layaoutBienvenida, R.string.mesnaje_error_nombre,
             //         Snackbar.LENGTH_LONG).show();
                 Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();

             }else {
                 binding.imgSaludar.setVisibility(View.VISIBLE);
                 String mensajeBienvenida= getString(R.string.mensaje_bienvenida, binding.edtNombre.getText());
                 binding.txtTitulo.setText(mensajeBienvenida);
                 //binding.txtTitulo.setText("Bienvenido" + binding.edtNombre.getText());
             }
        });

    }
}