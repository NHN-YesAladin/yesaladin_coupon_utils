package shop.yesaladin.coupon.message;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 쿠폰 코드 리스트를 가지는 메시지 클래스입니다. 쿠폰 지급 취소 혹은 쿠폰 사용 취소 메시지 발행 시 사용합니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
public class CouponCodesMessage {
    private List<String> couponCodes;
}
