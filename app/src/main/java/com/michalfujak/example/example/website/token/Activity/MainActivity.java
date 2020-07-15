package com.michalfujak.example.example.website.token.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.michalfujak.example.example.website.token.Model.Login;
import com.michalfujak.example.example.website.token.Model.User;
import com.michalfujak.example.example.website.token.R;
import com.michalfujak.example.example.website.token.Retrofit.UserClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    UserClient IUserClientService;
    //
    private static String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call Retrofit...

    }

    private void LoginAction()
    {
        Login objLogin = new Login("Michal", "0000");
        //
        Call<User> callLogin = IUserClientService.login(objLogin);
        callLogin.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful())
                {
                    // Login success
                    Toast.makeText(MainActivity.this, "Token: " + response.body().getToken() + " ", Toast.LENGTH_SHORT).show();
                    // token is save, write in database.
                    token = response.body().getToken();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login is not correct. ", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                // Error
                Toast.makeText(MainActivity.this, "Login is error!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}