package com.bottlerocketstudios.vault.test;

import android.test.AndroidTestCase;

public class RandomMultiThreadAccess extends AndroidTestCase {
    public static final String TAG = RandomMultiThreadAccess.class.getSimpleName();

    private static final String KEY_FILE_NAME = "randomMultiThreadKeyFile";
    private static final String PREF_FILE_NAME = "randomMultiThreadPrefFile";
    private static final String KEY_ALIAS_1 = "randomMultiThreadKeyAlias";
    private static final int KEY_INDEX_1 = 1;
    private static final String PRESHARED_SECRET_1 = "a;sdl564546a6s6w2828d4fsdfbsijd;saj;9dj9";

    private static final String TEST_KEY = "testKey";
    private static final String TEST_VALUE = "testValue";
    private static final int NUMBER_OF_SIMULTANEOUS_THREADS = 1000;
    private static final long FUTURE_GET_TIMEOUT = 100;
    private static final int NUMBER_OF_ITERATIONS = 1000;

    public void testRandomlyWithThreads() {

    }


}
