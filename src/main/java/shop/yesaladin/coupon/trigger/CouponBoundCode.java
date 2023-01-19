package shop.yesaladin.coupon.trigger;

/**
 * 쿠폰 범위 코드 입니다.
 *
 * @author 서민지
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
