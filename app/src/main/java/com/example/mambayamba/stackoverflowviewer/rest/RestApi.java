package com.example.mambayamba.stackoverflowviewer.rest;
import com.example.mambayamba.stackoverflowviewer.model.question.JsonQuestionResponse;
import com.example.mambayamba.stackoverflowviewer.model.question.featured.JsonFeaturedResponse;
import com.example.mambayamba.stackoverflowviewer.model.user.JsonUserResponse;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by mambayamba on 13.11.2016.
 */
public interface RestApi {
    @GET("/2.2/users?pagesize=3&order=desc&sort=reputation&site=stackoverflow")
    Observable<JsonUserResponse> loadDefaultUsers();

    @GET("/2.2/questions?pagesize=50&order=desc&sort=activity&site=stackoverflow")
    Observable<JsonQuestionResponse> loadDefaultQuestions();

    @GET("/2.2/search?sort=activity&order=desc &site=stackoverflow")
    Observable<JsonQuestionResponse> loadQuestions(@Query("tagged")String tag);

    @GET("/2.2/users/{ids}?order=desc&sort=name&site=stackoverflow")
    Observable<JsonUserResponse> loadUser(@Path("ids") String userId);

    @GET("/2.2/questions/featured?pagesize=50&order=desc&sort=activity&site=stackoverflow&filter=!3yXvh452nVOU1lo8U")
    Observable<JsonFeaturedResponse> loadFeaturedQuestions();

    @GET("/2.2/questions?pagesize=50&order=desc&sort=hot&site=stackoverflow")
    Observable<JsonQuestionResponse> loadHotQuestions();

    @GET("/2.2/questions?pagesize=50&order=desc&sort=week&site=stackoverflow")
    Observable<JsonQuestionResponse> loadWeekQuestions();
}
