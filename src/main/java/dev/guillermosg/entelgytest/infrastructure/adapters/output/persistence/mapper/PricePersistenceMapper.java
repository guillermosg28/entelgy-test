package dev.guillermosg.entelgytest.infrastructure.adapters.output.persistence.mapper;

import dev.guillermosg.entelgytest.domain.model.PriceResponse;
import dev.guillermosg.entelgytest.infrastructure.adapters.output.persistence.entity.PriceEntity;
import org.mapstruct.Mapper;

/**
 * The interface Price persistence mapper.
 */

@Mapper
public interface PricePersistenceMapper {

    /**
     * To price response.
     *
     * @param entity the entity
     * @return the price response
     */
    PriceResponse toPriceResponse(PriceEntity entity);
}
