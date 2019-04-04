package com.jrendon.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/3/search/{movie}")
    Call<MovieResults> listOfMovies(
            @Path("movie") String movie,
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );

}
