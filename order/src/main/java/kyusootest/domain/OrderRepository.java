package kyusootest.domain;

import java.util.Date;
import java.util.List;
import kyusootest.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface OrderRepository
    extends PagingAndSortingRepository<Order, Long> {
    @Query(
        value = "select order " +
        "from Order order " +
        "where(:productName is null or order.productName like %:productName%) and (:productId is null or order.productId like %:productId%)"
    )
    List<Order> getOrder(
        String productName,
        String productId,
        Pageable pageable
    );
}
