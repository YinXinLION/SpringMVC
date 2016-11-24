/**
 * Created by yinxin on 16-11-23.
 */
package service;

import domain.Product;

public interface ProductService {
    Product add(Product product);
    Product get(long id);
}