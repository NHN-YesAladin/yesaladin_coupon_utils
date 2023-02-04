package shop.yesaladin.coupon.message;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.yesaladin.coupon.code.TriggerTypeCode;

/**
 * 쿠폰 지급 요청 시 사용되는 메시지 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CouponGiveRequestMessage {

    private String requestId;
    private TriggerTypeCode triggerTypeCode;
    private Long couponId;
}
