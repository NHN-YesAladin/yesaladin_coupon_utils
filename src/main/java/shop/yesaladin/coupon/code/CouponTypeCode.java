package shop.yesaladin.coupon.code;

/**
 * 쿠폰 타입 코드 클래스입니다.
 *
 * @author 김홍대
 * @since 1.0
 */
public enum CouponTypeCode {

    FIXED_PRICE(1, "정액쿠폰"), FIXED_RATE(2, "정률쿠폰"), POINT(3, "포인트 충전 쿠폰");  // 쿠폰 종류 코드
    private final int code;
    private final String displayName;

    CouponTypeCode(int code, String displayName) {
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
