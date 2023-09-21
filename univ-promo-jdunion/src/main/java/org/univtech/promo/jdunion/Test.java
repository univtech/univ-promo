package org.univtech.promo.jdunion;

import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.domain.kplunion.ActivityService.request.query.*;
import com.jd.open.api.sdk.domain.kplunion.CategoryService.request.get.CategoryReq;
import com.jd.open.api.sdk.domain.kplunion.ChannelService.request.get.ChannelInviteReq;
import com.jd.open.api.sdk.domain.kplunion.ChannelService.request.get.ChannelRelationGetReq;
import com.jd.open.api.sdk.domain.kplunion.ChannelService.request.query.ChannelRelationQueryReq;
import com.jd.open.api.sdk.domain.kplunion.CouponService.request.get.CreateGiftCouponReq;
import com.jd.open.api.sdk.domain.kplunion.CouponService.request.stop.StopGiftCouponReq;
import com.jd.open.api.sdk.domain.kplunion.GoodsService.request.query.*;
import com.jd.open.api.sdk.domain.kplunion.IntelligenceService.request.query.IntelligencePromotionReq;
import com.jd.open.api.sdk.domain.kplunion.IntelligenceService.request.query.ToolsIntelligencePromotionReq;
import com.jd.open.api.sdk.domain.kplunion.OrderService.request.query.*;
import com.jd.open.api.sdk.domain.kplunion.PositionService.request.query.PositionReq;
import com.jd.open.api.sdk.domain.kplunion.SnapShopGoodsService.request.query.SnapShopGoodsReq;
import com.jd.open.api.sdk.domain.kplunion.StatisticsService.request.query.*;
import com.jd.open.api.sdk.domain.kplunion.UserService.request.get.PidReq;
import com.jd.open.api.sdk.domain.kplunion.UserService.request.validate.UserStateReq;
import com.jd.open.api.sdk.domain.kplunion.promotioncommon.PromotionService.request.get.PromotionCodeReq;
import com.jd.open.api.sdk.request.kplunion.*;
import com.jd.open.api.sdk.response.kplunion.*;

import java.util.ArrayList;
import java.util.List;

public class Test {

    String SERVER_URL = "";
    String accessToken = "";
    String appKey = "";
    String appSecret = "";

    /**
     * jd.union.open.goods.jingfen.query
     * 京粉精选商品查询接口【已开通】
     */
    public void queryJingfenGoods() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenGoodsJingfenQueryRequest request = new UnionOpenGoodsJingfenQueryRequest();
        JFGoodsReq goodsReq = new JFGoodsReq();
        request.setGoodsReq(goodsReq);
        request.setVersion("1.0");
        UnionOpenGoodsJingfenQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.goods.query
     * 关键词商品查询接口【申请】
     */
    public void queryGoods() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenGoodsQueryRequest request = new UnionOpenGoodsQueryRequest();
        GoodsReq goodsReqDTO = new GoodsReq();
        request.setGoodsReqDTO(goodsReqDTO);
        request.setVersion("1.0");
        UnionOpenGoodsQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.goods.material.query
     * 猜你喜欢商品推荐【已开通】
     */
    public void queryMaterialGoods() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenGoodsMaterialQueryRequest request = new UnionOpenGoodsMaterialQueryRequest();
        MaterialGoodsReq goodsReq = new MaterialGoodsReq();
        request.setGoodsReq(goodsReq);
        request.setVersion("1.0");
        UnionOpenGoodsMaterialQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.category.goods.get
     * 商品类目查询接口【已开通】
     */
    public void getGoodsCategory() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenCategoryGoodsGetRequest request = new UnionOpenCategoryGoodsGetRequest();
        CategoryReq req = new CategoryReq();
        request.setReq(req);
        request.setVersion("1.0");
        UnionOpenCategoryGoodsGetResponse response = client.execute(request);
    }

    /**
     * jd.union.open.goods.bigfield.query
     * 商品详情查询接口【已开通】
     */
    public void queryBigfieldGoods() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenGoodsBigfieldQueryRequest request = new UnionOpenGoodsBigfieldQueryRequest();
        BigFieldGoodsReq goodsReq = new BigFieldGoodsReq();
        request.setGoodsReq(goodsReq);
        request.setVersion("1.0");
        UnionOpenGoodsBigfieldQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.coupon.query
     * 优惠券领取情况查询接口【申请】
     */
    public void queryCoupon() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenCouponQueryRequest request = new UnionOpenCouponQueryRequest();
        List couponUrls = new ArrayList();
        couponUrls.add("http://coupon.jd.com/ilink/get/get_coupon.action?XXXXXXX");
        request.setCouponUrls(couponUrls);
        request.setVersion("1.0");
        UnionOpenCouponQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.activity.query
     * 活动查询接口【已开通】
     */
    public void queryActivity() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenActivityQueryRequest request = new UnionOpenActivityQueryRequest();
        ActivityReq activityReq = new ActivityReq();
        request.setActivityReq(activityReq);
        request.setVersion("1.0");
        UnionOpenActivityQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.activity.recommend.query
     * 活动推荐接口【申请】
     */
    public void queryRecommendActivity() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenActivityRecommendQueryRequest request = new UnionOpenActivityRecommendQueryRequest();
        RecommendActivityReq req = new RecommendActivityReq();
        request.setReq(req);
        request.setVersion("1.0");
        UnionOpenActivityRecommendQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.promotion.intelligence.query
     * 线报推广【申请】
     */
    public void queryIntelligencePromotion() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenPromotionIntelligenceQueryRequest request = new UnionOpenPromotionIntelligenceQueryRequest();
        IntelligencePromotionReq req = new IntelligencePromotionReq();
        request.setReq(req);
        request.setVersion("1.0");
        UnionOpenPromotionIntelligenceQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.promotion.tools.intelligence.query
     * 工具商线报推广【申请】
     */
    public void queryIntelligenceToolsPromotion() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenPromotionToolsIntelligenceQueryRequest request = new UnionOpenPromotionToolsIntelligenceQueryRequest();
        ToolsIntelligencePromotionReq req = new ToolsIntelligencePromotionReq();
        request.setReq(req);
        request.setVersion("1.0");
        UnionOpenPromotionToolsIntelligenceQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.goods.combination.query
     * 凑单商品物料查询接口【申请】
     */
    public void queryCombinationGoods() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenGoodsCombinationQueryRequest request = new UnionOpenGoodsCombinationQueryRequest();
        CombinationGoodsReq goodsReq = new CombinationGoodsReq();
        request.setGoodsReq(goodsReq);
        request.setVersion("1.0");
        UnionOpenGoodsCombinationQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.goods.snapshop.query
     * 拍照购选品接口【申请】
     */
    public void querySnapshopGoods() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenGoodsSnapshopQueryRequest request = new UnionOpenGoodsSnapshopQueryRequest();
        SnapShopGoodsReq SnapShopGoodsReq = new SnapShopGoodsReq();
        request.setSnapShopGoodsReq(SnapShopGoodsReq);
        request.setVersion("1.0");
        UnionOpenGoodsSnapshopQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.promotion.common.get
     * 网站/APP/流量媒体获取推广链接接口【已开通】
     */
    public void getCommonPromotion() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenPromotionCommonGetRequest request = new UnionOpenPromotionCommonGetRequest();
        PromotionCodeReq promotionCodeReq = new PromotionCodeReq();
        request.setPromotionCodeReq(promotionCodeReq);
        request.setVersion("1.0");
        UnionOpenPromotionCommonGetResponse response = client.execute(request);
    }

    /**
     * jd.union.open.promotion.bysubunionid.get
     * 社交媒体获取推广链接接口【申请】
     */
    public void getBysubunionidPromotion() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenPromotionBysubunionidGetRequest request = new UnionOpenPromotionBysubunionidGetRequest();
        com.jd.open.api.sdk.domain.kplunion.promotionbysubunioni.PromotionService.request.get.PromotionCodeReq promotionCodeReq = new com.jd.open.api.sdk.domain.kplunion.promotionbysubunioni.PromotionService.request.get.PromotionCodeReq();
        request.setPromotionCodeReq(promotionCodeReq);
        request.setVersion("1.0");
        UnionOpenPromotionBysubunionidGetResponse response = client.execute(request);
    }

    /**
     * jd.union.open.promotion.byunionid.get
     * 工具商获取推广链接接口【申请】
     */
    public void getByunionidPromotion() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenPromotionByunionidGetRequest request = new UnionOpenPromotionByunionidGetRequest();
        com.jd.open.api.sdk.domain.kplunion.promotionbyunionid.PromotionService.request.get.PromotionCodeReq promotionCodeReq = new com.jd.open.api.sdk.domain.kplunion.promotionbyunionid.PromotionService.request.get.PromotionCodeReq();
        request.setPromotionCodeReq(promotionCodeReq);
        request.setVersion("1.0");
        UnionOpenPromotionByunionidGetResponse response = client.execute(request);
    }

    /**
     * jd.union.open.order.row.query
     * 订单行查询接口【已开通】
     */
    public void queryRowOrder() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenOrderRowQueryRequest request = new UnionOpenOrderRowQueryRequest();
        OrderRowReq orderReq = new OrderRowReq();
        request.setOrderReq(orderReq);
        request.setVersion("1.0");
        UnionOpenOrderRowQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.order.bonus.query
     * 奖励订单查询接口【申请】
     */
    public void queryBonusOrder() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenOrderBonusQueryRequest request = new UnionOpenOrderBonusQueryRequest();
        BonusOrderReq orderReq = new BonusOrderReq();
        request.setOrderReq(orderReq);
        request.setVersion("1.0");
        UnionOpenOrderBonusQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.statistics.redpacket.query
     * 京享红包效果数据【已开通】
     */
    public void queryRedpacketStatistics() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenStatisticsRedpacketQueryRequest request = new UnionOpenStatisticsRedpacketQueryRequest();
        RedPacketEffectDataReq effectDataReq = new RedPacketEffectDataReq();
        request.setEffectDataReq(effectDataReq);
        request.setVersion("1.0");
        UnionOpenStatisticsRedpacketQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.order.agent.query
     * 工具商订单行查询接口【申请】
     */
    public void queryAgentOrder() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenOrderAgentQueryRequest request = new UnionOpenOrderAgentQueryRequest();
        OrderAgentReq orderReq = new OrderAgentReq();
        request.setOrderReq(orderReq);
        request.setVersion("1.0");
        UnionOpenOrderAgentQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.statistics.redpacket.agent.query
     * 工具商京享红包效果数据查询接口【申请】
     */
    public void queryAgentRedpacketStatistics() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenStatisticsRedpacketAgentQueryRequest request = new UnionOpenStatisticsRedpacketAgentQueryRequest();
        RedPacketEffectDataAgentReq effectDataAgentReq = new RedPacketEffectDataAgentReq();
        request.setEffectDataAgentReq(effectDataAgentReq);
        request.setVersion("1.0");
        UnionOpenStatisticsRedpacketAgentQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.activity.bonus.query
     * 奖励活动信息查询接口【申请】
     */
    public void queryBonusActivity() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenActivityBonusQueryRequest request = new UnionOpenActivityBonusQueryRequest();
        BonusActivityReq req = new BonusActivityReq();
        request.setReq(req);
        request.setVersion("1.0");
        UnionOpenActivityBonusQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.statistics.activity.bonus.query
     * 奖励活动奖励金额查询接口【申请】
     */
    public void queryBonusActivityStatistics() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenStatisticsActivityBonusQueryRequest request = new UnionOpenStatisticsActivityBonusQueryRequest();
        BonusEffectDataReq req = new BonusEffectDataReq();
        request.setReq(req);
        request.setVersion("1.0");
        UnionOpenStatisticsActivityBonusQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.order.row.supply.query
     * 供开订单行查询接口【申请】
     */
    public void querySupplyRowOrder() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenOrderRowSupplyQueryRequest request = new UnionOpenOrderRowSupplyQueryRequest();
        SupplyOrderRowReq orderReq = new SupplyOrderRowReq();
        request.setOrderReq(orderReq);
        request.setVersion("1.0");
        UnionOpenOrderRowSupplyQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.statistics.promotion.query
     * 推广效果数据查询接口【申请】
     */
    public void queryPromotionStatistics() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenStatisticsPromotionQueryRequest request = new UnionOpenStatisticsPromotionQueryRequest();
        PromotionEffectDataReq promotionEffectDataReq = new PromotionEffectDataReq();
        request.setPromotionEffectDataReq(promotionEffectDataReq);
        request.setVersion("1.0");
        UnionOpenStatisticsPromotionQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.coupon.gift.get
     * 礼金创建【已开通】
     */
    public void getGiftCoupon() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenCouponGiftGetRequest request = new UnionOpenCouponGiftGetRequest();
        CreateGiftCouponReq couponReq = new CreateGiftCouponReq();
        request.setCouponReq(couponReq);
        request.setVersion("1.0");
        UnionOpenCouponGiftGetResponse response = client.execute(request);
    }

    /**
     * jd.union.open.coupon.gift.stop
     * 礼金停止【已开通】
     */
    public void stopGiftCoupon() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenCouponGiftStopRequest request = new UnionOpenCouponGiftStopRequest();
        StopGiftCouponReq couponReq = new StopGiftCouponReq();
        request.setCouponReq(couponReq);
        request.setVersion("1.0");
        UnionOpenCouponGiftStopResponse response = client.execute(request);
    }

    /**
     * jd.union.open.statistics.giftcoupon.query
     * 礼金效果数据【已开通】
     */
    public void queryGiftcouponStatistics() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenStatisticsGiftcouponQueryRequest request = new UnionOpenStatisticsGiftcouponQueryRequest();
        GiftCouponEffectDataReq effectDataReq = new GiftCouponEffectDataReq();
        request.setEffectDataReq(effectDataReq);
        request.setVersion("1.0");
        UnionOpenStatisticsGiftcouponQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.user.register.validate
     * 实时RTA接口【申请】
     */
    public void validateRegisterUser() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenUserRegisterValidateRequest request = new UnionOpenUserRegisterValidateRequest();
        UserStateReq userStateReq = new UserStateReq();
        request.setUserStateReq(userStateReq);
        request.setVersion("1.0");
        UnionOpenUserRegisterValidateResponse response = client.execute(request);
    }

    /**
     * jd.union.open.activity.bonus.match.query
     * 用户奖励活动查询接口【申请】
     */
    public void queryMatchBonusActivity() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenActivityBonusMatchQueryRequest request = new UnionOpenActivityBonusMatchQueryRequest();
        UserMatchActivityRequest userMatchActivityRequest = new UserMatchActivityRequest();
        request.setUserMatchActivityRequest(userMatchActivityRequest);
        request.setVersion("1.0");
        UnionOpenActivityBonusMatchQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.activity.bonus.multimatch.query
     * 用户奖励活动批量查询接口【申请】
     */
    public void queryMultimatchBonusActivity() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenActivityBonusMultimatchQueryRequest request = new UnionOpenActivityBonusMultimatchQueryRequest();
        BatchUserMatchActivityRequest batchUserMatchActivityRequest = new BatchUserMatchActivityRequest();
        request.setBatchUserMatchActivityRequest(batchUserMatchActivityRequest);
        request.setVersion("1.0");
        UnionOpenActivityBonusMultimatchQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.position.create
     * 创建推广位【申请】
     */
    public void createPosition() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenPositionCreateRequest request = new UnionOpenPositionCreateRequest();
        com.jd.open.api.sdk.domain.kplunion.PositionService.request.create.PositionReq positionReq = new com.jd.open.api.sdk.domain.kplunion.PositionService.request.create.PositionReq();
        request.setPositionReq(positionReq);
        request.setVersion("1.0");
        UnionOpenPositionCreateResponse response = client.execute(request);
    }

    /**
     * jd.union.open.position.query
     * 查询推广位【申请】
     */
    public void queryPosition() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenPositionQueryRequest request = new UnionOpenPositionQueryRequest();
        PositionReq positionReq = new PositionReq();
        request.setPositionReq(positionReq);
        request.setVersion("1.0");
        UnionOpenPositionQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.user.pid.get
     * 获取PID【申请】【已开通】
     */
    public void getPidUser() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenUserPidGetRequest request = new UnionOpenUserPidGetRequest();
        PidReq pidReq = new PidReq();
        request.setPidReq(pidReq);
        request.setVersion("1.0");
        UnionOpenUserPidGetResponse response = client.execute(request);
    }

    /**
     * jd.union.open.channel.invitecode.get
     * 邀请码获取接口【申请】
     */
    public void getInvitecodeChannel() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenChannelInvitecodeGetRequest request = new UnionOpenChannelInvitecodeGetRequest();
        ChannelInviteReq channelInviteReq = new ChannelInviteReq();
        request.setChannelInviteReq(channelInviteReq);
        request.setVersion("1.0");
        UnionOpenChannelInvitecodeGetResponse response = client.execute(request);
    }

    /**
     * jd.union.open.channel.relation.get
     * 渠道关系ID生成接口【申请】
     */
    public void getRelationChannel() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenChannelRelationGetRequest request = new UnionOpenChannelRelationGetRequest();
        ChannelRelationGetReq channelRelationGetReq = new ChannelRelationGetReq();
        request.setChannelRelationGetReq(channelRelationGetReq);
        request.setVersion("1.0");
        UnionOpenChannelRelationGetResponse response = client.execute(request);
    }

    /**
     * jd.union.open.channel.relation.query
     * 渠道关系查询接口【申请】
     */
    public void queryRelationChannel() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenChannelRelationQueryRequest request = new UnionOpenChannelRelationQueryRequest();
        ChannelRelationQueryReq channelRelationQueryReq = new ChannelRelationQueryReq();
        request.setChannelRelationQueryReq(channelRelationQueryReq);
        request.setVersion("1.0");
        UnionOpenChannelRelationQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.selling.goods.query
     * 商羚商品查询【已开通】
     */
    public void queryGoodsSelling() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenSellingGoodsQueryRequest request = new UnionOpenSellingGoodsQueryRequest();
        SellingGoodsReq req = new SellingGoodsReq();
        request.setReq(req);
        request.setVersion("1.0");
        UnionOpenSellingGoodsQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.selling.promotion.get
     * 商羚转链获取【已开通】
     */
    public void getPromotionSelling() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenSellingPromotionGetRequest request = new UnionOpenSellingPromotionGetRequest();
        com.jd.open.api.sdk.domain.kplunion.PromotionService.request.get.PromotionCodeReq req = new com.jd.open.api.sdk.domain.kplunion.PromotionService.request.get.PromotionCodeReq();
        request.setReq(req);
        request.setVersion("1.0");
        UnionOpenSellingPromotionGetResponse response = client.execute(request);
    }

    /**
     * jd.union.open.selling.order.row.query
     * 商羚订单行查询【已开通】
     */
    public void queryRowOrderSelling() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenSellingOrderRowQueryRequest request = new UnionOpenSellingOrderRowQueryRequest();
        OrderRowReq req = new OrderRowReq();
        request.setReq(req);
        request.setVersion("1.0");
        UnionOpenSellingOrderRowQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.order.query
     * 订单查询接口【已开通】
     */
    public void queryOrder() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenOrderQueryRequest request = new UnionOpenOrderQueryRequest();
        OrderReq orderReq = new OrderReq();
        request.setOrderReq(orderReq);
        request.setVersion("1.0");
        UnionOpenOrderQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.goods.seckill.query
     * 秒杀商品查询接口【即将下线】
     */
    public void querySeckill() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenGoodsSeckillQueryRequest request = new UnionOpenGoodsSeckillQueryRequest();
        SecKillGoodsReq goodsReq = new SecKillGoodsReq();
        request.setGoodsReq(goodsReq);
        request.setVersion("1.0");
        UnionOpenGoodsSeckillQueryResponse response = client.execute(request);
    }

    /**
     * jd.union.open.goods.promotiongoodsinfo.query
     * 通过skuid查询推广商品的基本信息【已开通】
     */
    public void queryPromotiongoodsinfoGoods() throws Exception {
        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);
        UnionOpenGoodsPromotiongoodsinfoQueryRequest request = new UnionOpenGoodsPromotiongoodsinfoQueryRequest();
        request.setSkuIds("5225346,7275691");
        request.setVersion("1.0");
        UnionOpenGoodsPromotiongoodsinfoQueryResponse response = client.execute(request);
    }

}
