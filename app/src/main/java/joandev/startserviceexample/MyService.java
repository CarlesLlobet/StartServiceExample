package joandev.startserviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import java.util.Timer;

/**
 * Created by joanbarroso on 3/2/15.
 */
public class MyService extends Service {


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        try {
            Thread.sleep(5000);
            Toast.makeText(getApplicationContext(),"I'M ALIVE :D!", Toast.LENGTH_SHORT).show();
            //stopSelf(); sirve para parar el servicio
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
