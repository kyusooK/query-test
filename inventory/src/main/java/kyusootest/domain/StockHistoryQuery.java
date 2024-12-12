package kyusootest.domain;

import java.util.Date;
import lombok.Data;

@Data
public class StockHistoryQuery {

    private Integer stock;
    private String productName;
}
