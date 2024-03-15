package africa.semicolon.shoppersDelight.repositories;

import africa.semicolon.shoppersDelight.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
