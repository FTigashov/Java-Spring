package rest_part_2.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
@AllArgsConstructor
public class ProductFilter {

    BigDecimal minPrice;
    BigDecimal maxPrice;
    String partTitle;

}
