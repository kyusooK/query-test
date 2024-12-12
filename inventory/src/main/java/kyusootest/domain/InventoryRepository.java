package kyusootest.domain;

import java.util.Date;
import java.util.List;
import kyusootest.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "inventories",
    path = "inventories"
)
public interface InventoryRepository
    extends PagingAndSortingRepository<Inventory, Long> {
    @Query(
        value = "select inventory " +
        "from Inventory inventory " +
        "where(:productName is null or inventory.productName like %:productName%) and (:productCode is null or inventory.productCode = :productCode)"
    )
    List<Inventory> getInventory(
        String productName,
        Code productCode,
        Pageable pageable
    );

    @Query(
        value = "select inventory " +
        "from Inventory inventory " +
        "where(:stock is null or inventory.stock = :stock) and (:productName is null or inventory.productName like %:productName%)"
    )
    Inventory stockHistory(Integer stock, String productName);
}
