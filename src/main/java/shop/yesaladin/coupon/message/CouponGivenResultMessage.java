package shop.yesaladin.coupon.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 쿠폰 지급 결과 메시지 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CouponGivenResultMessage {

    private String couponCode;
    private boolean success;
}
