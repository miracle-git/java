package com.miracle.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {
    private Map<String, CloudWebsite> map = new HashMap<>();

    public CloudWebsite getWebsiteByCategory(String category) {
        if (this.map.containsKey(category)) {
            return this.map.get(category);
        } else {
            CloudWebsite website = new ConcreteWebsite(category);
            this.map.put(category, website);
            return website;
        }
    }

    public int getWebsiteSize() {
        return this.map.size();
    }
}
