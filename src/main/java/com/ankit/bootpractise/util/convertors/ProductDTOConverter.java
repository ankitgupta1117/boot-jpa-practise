package com.ankit.bootpractise.util.convertors;

import com.ankit.bootpractise.data.entities.ProductEntity;
import com.ankit.bootpractise.modals.ProductDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProductDTOConverter implements Converter<ProductDTO, ProductEntity> {


    @Override
    public ProductEntity convert(ProductDTO source) {
        ProductEntity e  = new ProductEntity();
        e.setId(Long.parseLong(source.getProductId()));
        e.setPrice(100);
        e.setProductName(source.getProductName());
        return e;
    }
}
