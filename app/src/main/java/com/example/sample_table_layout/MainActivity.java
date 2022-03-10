package com.example.sample_table_layout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText eduser, edpassword;
    String nama , password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ID button di layout dibikin variable disini
        btnLogin = findViewById(R.id.btSign); // findviewbyid buat ngambil id dari layout
        eduser = findViewById(R.id.edUser);
        edpassword = findViewById(R.id.edPass);
        //Variabel yang masuk dari layout dimasukan ke menjadi variabel yang dideklarasikan dalam class ini

        //bikin onclick listener buat buttonya
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = eduser.getText().toString(); //mindahin inputan dari Edittext ke String
                password = edpassword.getText().toString();

                if(nama.equals("uyun") && password.equals("123")){
                    Toast t = Toast.makeText(getApplicationContext(), "Login Sukses!", Toast.LENGTH_LONG); //lengthlong?
                    t.show();
                }else {
                    Toast b = Toast.makeText(getApplicationContext(), "Username atau Password salah!",Toast.LENGTH_LONG);
                    b.show();
                }

                // bikin bubble message


            }
        });

    }

}