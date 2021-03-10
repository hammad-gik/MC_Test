package com.example.test.networking;

import com.example.test.models.UsersResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api")
    Call<UsersResponse> getSingleUser();

}
