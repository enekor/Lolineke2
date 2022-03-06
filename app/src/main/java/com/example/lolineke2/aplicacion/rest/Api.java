package com.example.lolineke2.aplicacion.rest;

import com.example.lolineke2.aplicacion.rest.model.Usuario;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("/cliente/login")
    Call<Usuario> loginWithToken(@Query(value="token")String token,
                                @Query(value="mail")String mail,
                                @Query(value="password")String password);

    @GET("/cliente/login")
    Call<Usuario> loginWithoutToken(@Query(value="mail")String mail,
                                    @Query(value="password")String password);
}
