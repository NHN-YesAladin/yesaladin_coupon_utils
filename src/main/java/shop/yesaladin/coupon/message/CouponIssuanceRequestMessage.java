package shop.yesaladin.coupon.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.yesaladin.coupon.code.TriggerTypeCode;

/**
 * 쿠폰 발행 요청을 위한 메시지 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CouponIssuanceRequestMessage {

    private String requestId;
    private TriggerTypeCode triggerType;
    private Long couponId;

}
