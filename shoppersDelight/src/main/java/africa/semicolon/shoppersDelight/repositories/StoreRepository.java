package africa.semicolon.shoppersDelight.repositories;

import africa.semicolon.shoppersDelight.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
