package com.michalfujak.example.example.website.token.Utils;

import com.michalfujak.example.example.website.token.Retrofit.RetrofitClient;
import com.michalfujak.example.example.website.token.Retrofit.UserClient;

public class Common
{
    private static final String BASE_URL = "";

    public static UserClient getAPI()
    {
        return RetrofitClient.getRetrofitClient(BASE_URL).create(UserClient.class);
    }
}
