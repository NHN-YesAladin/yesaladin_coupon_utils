package shop.yesaladin.coupon.message;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.yesaladin.coupon.dto.CouponGiveDto;

/**
 * 쿠폰 지급 요청에 응답 시 사용되는 메시지 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CouponGiveRequestResponseMessage {

    private String requestId;
    private List<CouponGiveDto> coupons;
    private boolean success;
    private String errorMessage;
}
