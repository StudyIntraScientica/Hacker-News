package id.sis.hackernews;

import android.app.Application;

import timber.log.Timber;

/**
 * Created on : November 27, 2015
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class HackerNewsApp extends Application {

    private static HackerNewsApp HARVEST;

    @Override
    public void onCreate() {
        super.onCreate();
        HARVEST = this;

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
            Timber.tag(getClass().getSimpleName());
        }
    }

    public static HackerNewsApp pluck() {
        return HARVEST;
    }
}
