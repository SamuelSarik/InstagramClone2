package sk.sarik.samuel.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("O20zyTbTS40fMQqdeqG31OnaQ0YpJKYUgmDId62Z")
                // if defined
                .clientKey("Jnhnwq519MDZqavqoo8KMJtvoJbQS754pxFNvHW0")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
