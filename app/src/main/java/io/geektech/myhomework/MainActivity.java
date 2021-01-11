package io.geektech.myhomework;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button btnSignIn, btnRegister;
    EditText login, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

        findViewById(R.id.btnSighIn).setOnClickListener(v -> {
            if (login.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this,"Введите логин или пароль" , Toast.LENGTH_SHORT).show();
            } else if (password.length() > 6)
                Toast.makeText(MainActivity.this, "Успешно", Toast.LENGTH_SHORT).show();
            else {
                Toast.makeText(MainActivity.this, "Пароль должен содержать более 6 символов", Toast.LENGTH_SHORT).show();
            }
        });
    }

}