package com.michalfujak.example.example.website.token.Retrofit;

import com.michalfujak.example.example.website.token.Model.Login;
import com.michalfujak.example.example.website.token.Model.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserClient
{
    // interface
    @POST("login")
    Call<User> login(@Body Login login);

    // Response token
    @GET("secretinfo")
    Call<ResponseBody> getSecret(@Header("Autorization") String getToken);

}
