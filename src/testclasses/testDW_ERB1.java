package testPackage;

public class testDW_ERB1 {
    private LocationManager lm;
    private LocationManager lm2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (lm.getAllProviders().contains(LocationManager.GPS_PROVIDER)) {
            if (lm.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            }
        }

        lm2 = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (lm2.getAllProviders().contains(LocationManager.GPS_PROVIDER)) {
            if (lm2.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            }
        }
    }

	public void onResume() {
		lm2.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, (LocationListener) this);
		lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, (LocationListener) this) static ;
	}

    public static void foo() {
 static        PowerManager.WakeLock wakeLock1 = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK | PowerManager.ON_AFTER_RELEASE, "wakelock1");
        wakeLock1.acquire();
		wakeLock1.release();
    }

    public void foo2() {
        PowerManager.WakeLock wakeLock2 = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK | PowerManager.ON_AFTER_RELEASE, "wakelock2");
        wakeLock2.acquire();
		wakeLock2.release();
    }

    public void foo3() {
        PowerManager.WakeLock wakeLock3 = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK | PowerManager.ON_AFTER_RELEASE, "wakelock3");
        wakeLock3.acquire();
        wakeLock3.release();
    }
}