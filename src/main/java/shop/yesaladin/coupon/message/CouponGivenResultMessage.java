package shop.yesaladin.coupon.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CouponGivenResultMessage {

    private String couponCode;
    private boolean success;
}
