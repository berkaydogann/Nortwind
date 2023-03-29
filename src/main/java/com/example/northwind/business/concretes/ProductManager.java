package com.example.northwind.business.concretes;

import com.example.northwind.business.abstracts.ProductService;
import com.example.northwind.core.utilities.result.DataResult;
import com.example.northwind.core.utilities.result.Result;
import com.example.northwind.core.utilities.result.SuccessDataResult;
import com.example.northwind.core.utilities.result.SuccessResult;
import com.example.northwind.dataAccess.abstracts.ProductRepository;
import com.example.northwind.entities.concretes.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public DataResult<List<Product>> getAll() {

        return new SuccessDataResult<List<Product>>
                (this.productRepository.findAll(), "Data listelendi.");

    }

    @Override
    public Result add(Product product) {
        this.productRepository.save(product);
        return new SuccessResult("Ürün eklendi.");
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>
                (this.productRepository.getByProductName(productName), "Data listelendi.");

    }

    @Override
    public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<Product>
                (this.productRepository.getByProductNameAndCategory(productName, categoryId), "Data listelendi.");
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>
                (this.productRepository.getByProductNameOrCategory(productName, categoryId), "Data listelendi.");

    }

    @Override
    public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>
                (this.productRepository.getByCategoryIn(categories), "Data listelendi.");

    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>
                (this.productRepository.getByProductNameContains(productName), "Data listelendi.");
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>
                (this.productRepository.getByProductNameStartsWith(productName), "Data listelendi.");

    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>
                (this.productRepository.getByNameAndCategory(productName, categoryId), "Data listelendi.");
    }
}
