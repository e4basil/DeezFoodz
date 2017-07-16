package com.raywenderlich.android.deezfoodz.dagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Basi on 16-07-2017.
 */

/**
 * @Module annotation tells Dagger that the AppModule class
 * will provide dependencies for a part of the application
 */
@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    /**
     * @return Context
     * @Provides annotation tells Dagger that the method
     * provides a certain type of dependency, in this case,
     * a Context object.
     * <p>
     * When a part of the app requests that Dagger inject a Context,
     * the @Provides annotation tells Dagger where to find it
     */
    @Provides
    @Singleton
    public Context provideContext() {
        return application;
    }
}
