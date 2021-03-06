package org.omnirom.device;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;
import org.omnirom.device.MiSoundAudioEnhancerUtils;

public class MiSoundAudioEnhancerService extends Service {

   public static MiSoundAudioEnhancerUtils du;

   @Override
   public IBinder onBind(Intent arg0) {
      return null;
   }

   @Override
   public int onStartCommand(Intent intent, int flags, int startId) {
      // Let it continue running until it is stopped.
      du = new MiSoundAudioEnhancerUtils();
      du.initialize();
      //Toast.makeText(this, "Audio Enhancer Started", Toast.LENGTH_LONG).show();
      return START_STICKY;
   }


   @Override
   public void onDestroy() {
      super.onDestroy();
      Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
   }
}
