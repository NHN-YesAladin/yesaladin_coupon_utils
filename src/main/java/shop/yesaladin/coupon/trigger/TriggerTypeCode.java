package shop.yesaladin.coupon.trigger;

public enum TriggerTypeCode {

    SIGN_UP(1),
    BIRTHDAY(2),
    COUPON_OF_THE_MONTH(3),
    MEMBER_GRADE_WHITE(101),
    MEMBER_GRADE_BRONZE(102),
    MEMBER_GRADE_SILVER(103),
    MEMBER_GRADE_GOLD(104),
    MEMBER_GRADE_PLATINUM(105);

    private final int code;

    TriggerTypeCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}