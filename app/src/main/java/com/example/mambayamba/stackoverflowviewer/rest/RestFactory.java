package com.example.mambayamba.stackoverflowviewer.rest;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by mambayamba on 13.11.2016.
 */
public class RestFactory {
    private static final String BASE_URL = "https://api.stackexchange.com";

    public static RestApi getRestFactory(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();
        return retrofit.create(RestApi.class);
    }
}
