package com.example.lolineke2.aplicacion.rest;

import com.example.lolineke2.aplicacion.rest.model.Infraestructura;
import com.example.lolineke2.aplicacion.rest.model.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

import java.util.List;
import java.util.UUID;

public interface Api {
    @GET("/cliente/login")
    Call<Usuario> loginWithToken(@Query(value="token") UUID token,
                                @Query(value="mail")String mail,
                                @Query(value="password")String password);

    @GET("/cliente/login")
    Call<Usuario> loginWithoutToken(@Query(value="mail")String mail,
                                    @Query(value="password")String password);

    @GET("/infraestructura/tipoandroid")
    Call<List<Infraestructura>> getInfraestructurasByTipo(@Query(value = "tipo") String tipo);

    @PUT("/cliente/put")
    Call<Usuario> reservaUsuario(@Body Usuario usuario);

    @GET("/infraestructura/libres")
    Call<List<Integer>> getHorasLibres(@Query("id") UUID id,@Query("year") int year, @Query("mounth") int mounth, @Query("day") int day);
}
