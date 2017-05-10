package vn.asiantech.androidboilderplate.eventbus;

import com.squareup.otto.Bus;

/**
 * Copyright © AsianTech Co., Ltd
 * Created by kietva on 5/9/17.
 */
public final class BusProvider {

    private static BusProvider sBusProvider;
    private Bus mBus;

    private BusProvider() {
        mBus = new Bus();
    }

    public static BusProvider getInstance() {
        if (sBusProvider == null) {
            sBusProvider = new BusProvider();
        }
        return sBusProvider;
    }

    /**
     * Get Bus From Provider
     *
     * @return Bus Object
     */
    public Bus getBus() {
        return mBus;
    }
}
