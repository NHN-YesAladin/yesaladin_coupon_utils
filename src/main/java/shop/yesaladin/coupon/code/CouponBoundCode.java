package shop.yesaladin.coupon.code;

/**
 * 쿠폰 적용 범위 코드 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
public enum CouponBoundCode {

    ALL(1, "전체 상품"), CATEGORY(2, "지정 카테고리"), PRODUCT(3, "지정 상품");

    private final int code;
    private final String displayName;

    CouponBoundCode(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }
}
