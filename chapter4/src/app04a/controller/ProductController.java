package app04a.controller;

/**
 * Created by yinxin on 16-11-23.
 */
import java.math.BigDecimal;

import app04a.domain.Product;
import app04a.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ProductController {

    private static final Log logger = LogFactory.getLog(ProductController.class);

    @RequestMapping(value="/product_input")
    public String inputProduct() {
        logger.info("inputProduct called");
        return "ProductForm";
    }

    @RequestMapping(value="/product_save")
    public String saveProduct(ProductForm productForm, Model model) {
        logger.info("saveProduct called");
        // no need to create and instantiate a ProductForm
        // create Product
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(productForm.getPrice());
        } catch (NumberFormatException e) {
        }

        // add product

        model.addAttribute("product", product);
        return "ProductDeatils";
    }
}