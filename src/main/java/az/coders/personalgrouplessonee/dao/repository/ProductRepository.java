package az.coders.personalgrouplessonee.dao.repository;

import az.coders.personalgrouplessonee.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
