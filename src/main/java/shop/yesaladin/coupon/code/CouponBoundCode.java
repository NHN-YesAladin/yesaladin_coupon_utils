package shop.yesaladin.coupon.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 쿠폰 적용 범위 코드 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
@Getter
@RequiredArgsConstructor
public enum CouponBoundCode {

    ALL(1, "전체 상품"), CATEGORY(2, "지정 카테고리"), PRODUCT(3, "지정 상품");

    private final int code;
    private final String displayName;
}
