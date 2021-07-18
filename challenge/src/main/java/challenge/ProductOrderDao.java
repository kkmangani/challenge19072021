package challenge;

public interface ProductOrderDao {

    public void save(ProductOrder data);

    public ProductOrder findById(String id);

}
