package ru.tander.tandernews.interfaces;

/**
 * Created by Krat0S on 16.08.2017.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import ru.tander.tandernews.models.NewsModel;

public interface Network {
    @GET("get_news/")
    Call<List<NewsModel>> getData();
}
