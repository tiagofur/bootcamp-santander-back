package mx.creapolis.santander.mapper;

import mx.creapolis.santander.model.Stock;
import mx.creapolis.santander.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setDate(dto.getDate());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        return stock;
    }

    public StockDTO toDto(Stock active) {
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(active.getId());
        stockDTO.setName(active.getName());
        stockDTO.setDate(active.getDate());
        stockDTO.setPrice(active.getPrice());
        stockDTO.setVariation(active.getVariation());
        return stockDTO;
    }

    public List<StockDTO> toDto(List<Stock> list) {
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }
}
