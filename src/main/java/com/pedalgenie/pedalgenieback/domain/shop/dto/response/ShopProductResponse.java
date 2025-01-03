package com.pedalgenie.pedalgenieback.domain.shop.dto.response;

import com.pedalgenie.pedalgenieback.domain.product.entity.Product;
import com.pedalgenie.pedalgenieback.domain.productImage.service.dto.ProductImageDto;

public record ShopProductResponse(
        String name,
        Double rentPricePerDay,
        String thumbnailImage

) {

    public static ShopProductResponse from(final Product product, ProductImageDto productImage){
        return new ShopProductResponse(
                product.getName(),
                product.getRentPricePerDay(),
                productImage != null ? productImage.imageUrl() : null
        );
    }
}
