package shop.yesaladin.coupon.trigger;

public enum TriggerTypeCode {

    SIGN_UP(1, "회원가입 쿠폰"),
    BIRTHDAY(2, "생일자 쿠폰"),
    COUPON_OF_THE_MONTH(3, "이달의 쿠폰"),
    MEMBER_GRADE_WHITE(101, "등급 쿠폰(화이트)"),
    MEMBER_GRADE_BRONZE(102, "등급 쿠폰(브론즈)"),
    MEMBER_GRADE_SILVER(103, "등급 쿠폰(실버)"),
    MEMBER_GRADE_GOLD(104, "등급 쿠폰(골드)"),
    MEMBER_GRADE_PLATINUM(105, "등급 쿠폰(플래티넘)");

    private final int code;
    private final String displayName;

    TriggerTypeCode(int code, String displayName) {
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