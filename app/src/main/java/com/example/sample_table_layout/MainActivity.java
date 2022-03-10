package com.example.sample_table_layout;

import android.content.Intent;
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

                String sUser = "admin";
                String sPass = "123";

                if(nama.isEmpty() || password.isEmpty()){
                    // bikin bubble message
                    Toast t = Toast.makeText(getApplicationContext(), "Username dan password wajib diisi!", Toast.LENGTH_LONG); //lengthlong?
                    t.show();
                }else {
                    if(nama.equals(sUser) && password.equals(sPass)) {
                        Toast t = Toast.makeText(getApplicationContext(), "Login Sukses!", Toast.LENGTH_LONG); //lengthlong?
                        t.show();
                        //intent
                        Intent i = new Intent(MainActivity.this,ActivityKedua.class);

                        // object bundle?
                        Bundle b = new Bundle();
                        //masukin string ke bundle untuk dikirim ke layout/activity lain dengan key yang ada
                        b.putString("a", nama.trim());
                        b.putString("b", password.trim());
                        //masukin bundle dan intent ke activity lain;
                        i.putExtras(b);
                        startActivity(i);
                    }else{
                        Toast b = Toast.makeText(getApplicationContext(), "Username atau Password salah!", Toast.LENGTH_LONG);
                        b.show();
                    }
                }

            }
        });

    }

}