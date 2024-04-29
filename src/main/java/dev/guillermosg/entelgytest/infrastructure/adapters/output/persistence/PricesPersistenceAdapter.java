package dev.guillermosg.entelgytest.infrastructure.adapters.output.persistence;

import dev.guillermosg.entelgytest.application.ports.output.PriceOutputPort;
import dev.guillermosg.entelgytest.domain.model.PriceResponse;
import dev.guillermosg.entelgytest.infrastructure.adapters.output.persistence.mapper.PricePersistenceMapper;
import dev.guillermosg.entelgytest.infrastructure.adapters.output.persistence.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The type Prices persistence adapter.
 */
@Component
@RequiredArgsConstructor
public class PricesPersistenceAdapter implements PriceOutputPort {

    private final PriceRepository priceRepository;
    private final PricePersistenceMapper pricePersistenceMapper;


    /**
     * @param productId
     * @param brandId
     * @return List<PriceResponse>
     */
    @Override
    public List<PriceResponse> _prices(Integer productId, Integer brandId, LocalDateTime date) {
        return priceRepository.findByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfter(productId, brandId, date, date).stream()
                .map(pricePersistenceMapper::toPriceResponse)
                .toList();
    }
}
