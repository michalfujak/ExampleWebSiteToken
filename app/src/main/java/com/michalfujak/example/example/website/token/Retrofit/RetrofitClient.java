package com.michalfujak.example.example.website.token.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient
{
    // private variable retrofit
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofitClient(String urlCommon)
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(urlCommon)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }


}
