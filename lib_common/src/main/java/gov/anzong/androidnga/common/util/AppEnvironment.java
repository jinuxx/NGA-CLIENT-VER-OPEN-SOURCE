package gov.anzong.androidnga.common.util;

import android.os.Environment;

public class AppEnvironment {

    public static String getExternalStoragePictureDirectory() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
    }
}
