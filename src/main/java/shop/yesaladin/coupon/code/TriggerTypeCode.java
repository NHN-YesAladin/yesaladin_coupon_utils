package shop.yesaladin.coupon.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 쿠폰 발행 트리거 타입 코드 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@RequiredArgsConstructor
public enum TriggerTypeCode {

    SIGN_UP(1, "회원가입"),
    BIRTHDAY(2, "생일"),
    COUPON_OF_THE_MONTH(3, "이달의 쿠폰"),
    MEMBER_GRADE_WHITE(101, "등급(화이트)"),
    MEMBER_GRADE_BRONZE(102, "등급(브론즈)"),
    MEMBER_GRADE_SILVER(103, "등급(실버)"),
    MEMBER_GRADE_GOLD(104, "등급(골드)"),
    MEMBER_GRADE_PLATINUM(105, "등급(플래티넘)");

    private final int code;
    private final String displayName;
}
