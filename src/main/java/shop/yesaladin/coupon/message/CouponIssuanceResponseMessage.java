package shop.yesaladin.coupon.message;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 쿠폰 발행 요청에 응답하기 위한 메시지 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CouponIssuanceResponseMessage {

    private String requestId;
    private List<String> couponCodes;
    private boolean success;
    private String errorMessage;
}
