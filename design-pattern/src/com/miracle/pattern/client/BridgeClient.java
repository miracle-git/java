package com.miracle.pattern.client;

import com.miracle.pattern.bridge.RedColor;
import com.miracle.pattern.bridge.YellowColor;
import com.miracle.pattern.bridge.BlueColor;
import com.miracle.pattern.bridge.Phone;
import com.miracle.pattern.bridge.HuaweiPhone;
import com.miracle.pattern.bridge.ApplePhone;

public class BridgeClient {
    public static void run() {
        Phone redHuaweiPhone = new HuaweiPhone(new RedColor());
        redHuaweiPhone.run();

        Phone yellowHuaweiPhone = new HuaweiPhone(new YellowColor());
        yellowHuaweiPhone.run();

        Phone blueApplePhone = new ApplePhone(new BlueColor());
        blueApplePhone.run();
    }
}
