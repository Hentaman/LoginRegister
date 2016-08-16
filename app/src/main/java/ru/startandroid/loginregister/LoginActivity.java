package ru.startandroid.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // поля логина и пароля, а также кнопки ок и линка регистрации
        final EditText login = (EditText) findViewById(R.id.editText);
        final EditText password = (EditText) findViewById(R.id.editText2);
        final Button button = (Button) findViewById(R.id.button2);
        final TextView reglink = (TextView) findViewById(R.id.reglink);



        //go to the next battle of the reglink
        reglink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
                Toast toast = Toast.makeText(LoginActivity.this, "Переход на страницы регистрации", Toast.LENGTH_SHORT);
                toast.show();
            }
        });






    }
}
