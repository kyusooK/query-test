package kyusootest.domain;

import java.util.Date;
import lombok.Data;

@Data
public class GetOrderQuery {

    private String productName;
    private String productId;
}
