package shop.yesaladin.coupon.message;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.yesaladin.coupon.code.CouponSocketRequestKind;

/**
 * 쿠폰 사용 / 지급 결과를 저장하는 DTO 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CouponResultDto {

    private CouponSocketRequestKind requestKind;

    private String requestId;

    private boolean success;

    private String message;

    private LocalDateTime issuedDateTime;

}
