package shop.yesaladin.coupon.message;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 쿠폰 관련 메시지 발행 시 메시지의 key값이 될 enum 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@RequiredArgsConstructor
public enum MessageKey {
    GIVEN_REQUEST("지급 요청"), GIVEN_SUCCESS("지급 완료"), USE_SUCCESS("사용 완료");

    private final String description;
}
