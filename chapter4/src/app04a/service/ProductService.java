package app04a.service;

import app04a.domain.Product;

/**
 * Created by yinxin on 16-11-23.
 */
public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
