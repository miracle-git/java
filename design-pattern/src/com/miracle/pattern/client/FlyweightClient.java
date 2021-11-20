package com.miracle.pattern.client;

import com.miracle.pattern.flyweight.CloudWebsite;
import com.miracle.pattern.flyweight.Company;
import com.miracle.pattern.flyweight.WebsiteFactory;

public class FlyweightClient {
    public static void run() {
        WebsiteFactory factory = new WebsiteFactory();

        CloudWebsite website1 = factory.getWebsiteByCategory("企业官网");
        website1.run(new Company("华为"));

        CloudWebsite website2 = factory.getWebsiteByCategory("信息流");
        website2.run(new Company("字节"));

        CloudWebsite website3 = factory.getWebsiteByCategory("企业官网");
        website3.run(new Company("腾讯"));

        System.out.println("网站分类总数：" + factory.getWebsiteSize());
    }
}
