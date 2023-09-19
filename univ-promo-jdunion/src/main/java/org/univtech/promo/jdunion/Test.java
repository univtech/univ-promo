package org.univtech.promo.jdunion;

import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.domain.kplunion.promotioncommon.PromotionService.request.get.PromotionCodeReq;
import com.jd.open.api.sdk.request.kplunion.UnionOpenPromotionCommonGetRequest;
import com.jd.open.api.sdk.response.kplunion.UnionOpenPromotionCommonGetResponse;

public class Test {

    public void dd() throws Exception {
        String serverUrl = "";
        String accessToken = "";
        String appKey = "";
        String appSecret = "";
        JdClient client = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret);

        UnionOpenPromotionCommonGetRequest request = new UnionOpenPromotionCommonGetRequest();
        PromotionCodeReq promotionCodeReq = new PromotionCodeReq();
        promotionCodeReq.setMaterialId("");
        promotionCodeReq.setSiteId("");
        request.setPromotionCodeReq(promotionCodeReq);
        request.setVersion("1.0");

        UnionOpenPromotionCommonGetResponse response = client.execute(request);
    }

}
