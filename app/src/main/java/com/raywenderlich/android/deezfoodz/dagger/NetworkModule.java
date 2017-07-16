package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.app.Constants;
import com.raywenderlich.android.deezfoodz.network.UsdaApi;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Basi on 16-07-2017.
 */

@Module
public class NetworkModule {

    private static final String NAME_BASE_URL = "NAME_BASE_URL";

    @Provides
    @Named(NAME_BASE_URL)
    String provideBaseUrlString() {
        return Constants.BASE_URL;
    }

    @Provides
    @Singleton
    Converter.Factory provideGsonConverter() {
        return GsonConverterFactory.create();
    }


    @Provides
    @Singleton
    Retrofit provideRetrofit(Converter.Factory factory, @Named(NAME_BASE_URL) String baseUrl) {

        return new Retrofit.Builder()
                .addConverterFactory(factory)
                .baseUrl(baseUrl)
                .build();
    }

    @Provides
    @Singleton
    UsdaApi provideUsdaApi(Retrofit retrofit) {
        return retrofit.create(UsdaApi.class);
    }
}
