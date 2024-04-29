package dev.guillermosg.entelgytest.infrastructure.adapters.output.persistence.repository;

import dev.guillermosg.entelgytest.infrastructure.adapters.output.persistence.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The interface Price repository.
 */

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {

    /**
     * Find by product id and brand id list.
     *
     * @param productId the product id
     * @param brandId   the brand id
     * @return the list
     */
    List<PriceEntity> findByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfter(Integer productId, Integer brandId, LocalDateTime startDateTime, LocalDateTime endDateTime);
}
