package app04a.service;

import app04a.domain.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by yinxin on 16-11-23.
 */
public class ProductServiceImpl implements ProductService{
    private Map<Long,Product> products = new HashMap<Long,Product>();
    private AtomicLong generator = new AtomicLong();

    public ProductServiceImpl(){
        Product product = new Product();
        product.setName("JX1 Power Drill");
        product.setDescription("Powerful hand drill");
        product.setPrice(129.99F);
        add(product);
    }
    @Override
    public Product add(Product product) {
        long newID = generator.incrementAndGet();//?
        product.setId(newID);
        products.put(newID,product);
        return product;
    }

    @Override
    public Product get(long id) {
        return products.get(id);
    }
}
