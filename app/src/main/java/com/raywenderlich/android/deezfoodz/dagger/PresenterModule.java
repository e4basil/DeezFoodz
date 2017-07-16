package com.raywenderlich.android.deezfoodz.dagger;

import android.content.Context;

import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenter;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenterImpl;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenter;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Basi on 16-07-2017.
 */

/**
 * @Module annotation tells Dagger that the PresenterModule class
 * will provide dependencies for a part of the application
 */
@Module
public class PresenterModule {

    /**
     * @return
     * @Provides annotation tells Dagger that the method
     * provides a certain type of dependency, in this case,
     * a FoodzPresenter object.
     * <p>
     * When a part of the app requests that Dagger inject a FoodzPresenter,
     * the @Provides annotation tells Dagger where to find it
     */
    @Provides
    @Singleton
    FoodzPresenter provideFoodzPresenter(Context context) {
        return new FoodzPresenterImpl(context);
    }

    @Provides
    @Singleton
    FoodPresenter provideFoodPresenter(Context context) {
        return new FoodPresenterImpl(context);
    }
}
