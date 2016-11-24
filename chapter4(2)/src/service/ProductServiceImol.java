/**
 * Created by yinxin on 16-11-23.
 */
package service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import domain.Product;

@Service
class ProductServiceImpl implements service.ProductService {

    private Map<Long, Product> products = new HashMap<Long, Product>();
    private AtomicLong generator = new AtomicLong();

    public ProductServiceImpl() {
        Product product = new Product();
        product.setName("JX1 Power Drill");
        product.setDescription("Powerful hand drill, made to perfection");
        product.setPrice(new BigDecimal(129.99));
        add(product);
    }

    @Override
    public Product add(Product product) {
        long newId = generator.incrementAndGet();//当前值加1
        product.setId(newId);
        products.put(newId, product);
        return product;
    }

    @Override
    public Product get(long id) {
        return products.get(id);
    }
}