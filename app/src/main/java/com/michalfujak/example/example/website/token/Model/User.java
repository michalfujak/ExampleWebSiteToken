package com.michalfujak.example.example.website.token.Model;

public class User
{
    // private vars
    private int id;
    private String email;
    private String token;

    // Get and Set

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }
}
