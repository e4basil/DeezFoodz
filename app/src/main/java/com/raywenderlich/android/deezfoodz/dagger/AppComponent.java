package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.ui.food.FoodActivity;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenter;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenterImpl;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzActivity;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenter;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Basi on 16-07-2017.
 */

/**
 * The @Component annotation takes a list of modules as an input,
 * and you’ve added AppModule to the list.
 * <p>
 * component is used to connect objects to their dependencies
 */
@Singleton
@Component(modules = {AppModule.class, PresenterModule.class, NetworkModule.class})
public interface AppComponent {

    /**
     * the FoodzActivity class will require injection from AppComponent
     *
     * @param target
     */
    void inject(FoodzActivity target);

    void inject(FoodActivity target);

    void inject(FoodzPresenterImpl target);

    void inject(FoodPresenterImpl target);
}
