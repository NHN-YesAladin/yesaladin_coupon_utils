package shop.yesaladin.coupon.message;

import shop.yesaladin.coupon.code.TriggerTypeCode;

/**
 * 쿠폰 발행 요청을 위한 메시지 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
public class CouponIssuanceRequestMessage {

    private String requestId;
    private TriggerTypeCode triggerType;
    private Long couponId;

    public CouponIssuanceRequestMessage() {
    }

    public CouponIssuanceRequestMessage(
            String requestId,
            TriggerTypeCode triggerType,
            Long couponId
    ) {
        this.requestId = requestId;
        this.triggerType = triggerType;
        this.couponId = couponId;
    }

    public String getRequestId() {
        return requestId;
    }

    public TriggerTypeCode getTriggerType() {
        return triggerType;
    }

    public Long getCouponId() {
        return couponId;
    }
}
