package shop.yesaladin.coupon.message;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CouponIssuanceResponseMessage {

    private String requestId;
    private List<String> couponCodes;
    private boolean success;
    private String errorMessage;
}
