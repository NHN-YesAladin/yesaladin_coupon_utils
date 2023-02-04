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
    GIVE_REQUEST("지급 요청"), GIVE_REQUEST_RESPONSE("지급 요청 응답"), GIVEN("지급 완료"), GIVE_CANCEL("지급 취소"),
    USE_REQUEST("사용 요청"), USE_REQUEST_RESPONSE("사용 요청 응답"), USED("사용 완료"), USE_CANCEL("사용 취소");

    private final String description;
}
