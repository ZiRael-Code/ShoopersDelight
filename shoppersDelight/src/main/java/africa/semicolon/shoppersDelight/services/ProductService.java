package africa.semicolon.shoppersDelight.services;

import africa.semicolon.shoppersDelight.dtos.request.AddProductRequest;
import africa.semicolon.shoppersDelight.dtos.response.AddProductResponse;
import africa.semicolon.shoppersDelight.dtos.response.ProductResponse;

import java.util.List;

public interface ProductService {
    AddProductResponse addProduct(AddProductRequest request);

    ProductResponse getProductBy(Long id);

    List<ProductResponse> getProducts(int page, int size);
}
