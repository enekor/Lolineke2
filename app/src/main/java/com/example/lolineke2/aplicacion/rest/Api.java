package com.example.lolineke2.aplicacion.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("/cliente/login")
    Call<String> loginWithToken(@Query(value="token")String token,
                                @Query(value="mail")String mail,
                                @Query(value="password")String password);

    @GET("/cliente/login")
    Call<String> loginWithoutToken(@Query(value="mail")String mail,
                                   @Query(value="password")String password);
}
