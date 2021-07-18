package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductOrderService {

    @Autowired
    private ProductOrderDao dao;

    public ProductOrder save(ProductOrder po) {
    }

    public ProductOrder getProductOrderById(String id) {
    }
}
