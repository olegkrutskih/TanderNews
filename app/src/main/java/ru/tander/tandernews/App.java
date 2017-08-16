package ru.tander.tandernews;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.tander.tandernews.interfaces.Network;

/**
 * Created by Krat0S on 16.08.2017.
 */

public class App extends Application {

    private static Network mNetwork;
    private Retrofit mRetrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        mRetrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:5000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mNetwork = mRetrofit.create(Network.class);
    }

    public static Network getApi() {
        return mNetwork;
    }
}
