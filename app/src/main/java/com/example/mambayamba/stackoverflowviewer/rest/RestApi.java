package com.example.mambayamba.stackoverflowviewer.rest;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.average.QuestionListResponse;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.ExcerptQuestionListResponse;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.featured.FeaturedQuestionListResponse;
import com.example.mambayamba.stackoverflowviewer.model.questionpage.QuestionPageResponse;
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
    Observable<QuestionListResponse> loadDefaultQuestions();

    @GET("/2.2/search?sort=activity&order=desc &site=stackoverflow")
    Observable<QuestionListResponse> loadQuestions(@Query("tagged")String tag);

    @GET("/2.2/users/{ids}?order=desc&sort=name&site=stackoverflow")
    Observable<JsonUserResponse> loadUser(@Path("ids") String userId);

    @GET("/2.2/questions/featured?pagesize=50&order=desc&sort=activity&site=stackoverflow&filter=!3yXvh452nVOU1lo8U")
    Observable<FeaturedQuestionListResponse> loadFeaturedQuestions();

    @GET("/2.2/questions?pagesize=50&order=desc&sort=hot&site=stackoverflow")
    Observable<QuestionListResponse> loadHotQuestions();

    @GET("/2.2/questions?pagesize=50&order=desc&sort=week&site=stackoverflow")
    Observable<QuestionListResponse> loadWeekQuestions();

    @GET("/2.2/search/excerpts?pagesize=50&order=desc&sort=activity&site=stackoverflow&filter=!-*f(6qCVg2rb")
    Observable<ExcerptQuestionListResponse> searchExcerpts(@Query("q")String query);

    @GET("/2.2/questions/{ids}?order=desc&sort=activity&site=stackoverflow&filter=!BVNukwOPxSbQTFs76PVsHXnB**watn")
    Observable<QuestionPageResponse> loadQuestionPage(@Path("ids")String questionId);
}
