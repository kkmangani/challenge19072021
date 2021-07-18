package challenge;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ProductOrderDaoImpl implements ProductOrderDao {

    String basepath = System.getProperty("java.io.tmpdir");
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void save(ProductOrder data) {
        ProductOrder po = null;
        try {
            FileUtils.writeStringToFile(new File(basepath, objectMapper.writeValueAsString(data));
        } catch (Exception e) {
            // TODO : no need to handle
        }
    }

    @Override
    public ProductOrder findById(String id) {
        ProductOrder po = null;
        try {
            String data = FileUtils.readFileToString(new File(basepath + "/" + id), "UTF-8");
            po = objectMapper.readValue(data, ProductOrder.class);
        } catch (Exception e) {
            // TODO : no need to handle
        }
        return po;
    }
}
