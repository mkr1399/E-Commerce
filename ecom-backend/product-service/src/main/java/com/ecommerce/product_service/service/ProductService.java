package com.ecommerce.product_service.service;

import com.ecommerce.product_service.dto.ProductDTO;
import com.ecommerce.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.ecommerce.product_service.entity.Product;



import java.util.UUID;

@Service
public class ProductService {

   @Autowired
   private ProductRepository productRepository;

    public ProductDTO getProductById(UUID id) {
        Product product = productRepository.findById(id).orElseThrow();
        return mapToDTO(product);
    }

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream().map(this::mapToDTO).toList();
    }

    public ProductDTO createProduct(ProductDTO dto) {
        Product product = Product.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .build();

        product = productRepository.save(product); // save returns the saved entity with ID

        return mapToDTO(product);
    }

    public ProductDTO updateProduct(UUID id, ProductDTO dto) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

        product.setName(dto.getName());
        product.setId(dto.getId());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());

        product = productRepository.save(product);

        return mapToDTO(product);
    }

    public void deleteProduct(UUID id) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Product not found with id: " + id);
        }
        productRepository.deleteById(id);
    }

    private ProductDTO mapToDTO(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

    }
}

