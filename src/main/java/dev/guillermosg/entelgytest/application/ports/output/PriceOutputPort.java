package dev.guillermosg.entelgytest.application.ports.output;

import dev.guillermosg.entelgytest.domain.model.PriceResponse;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The interface Price output port.
 */

public interface PriceOutputPort {

    /**
     * @param productId
     * @param brandId
     * @return List<PriceResponse>
     */
    List<PriceResponse> _prices(Integer productId, Integer brandId, LocalDateTime date);
}
