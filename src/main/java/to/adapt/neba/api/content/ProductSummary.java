package to.adapt.neba.api.content;

import io.neba.api.annotations.ResourceModel;
import lombok.Data;

@Data
@ResourceModel(types = "neba-sample/components/productSummary")
public class ProductSummary implements ImageProperties {
    String heroAlt;

    @Override
    public String getAlt() {
        return heroAlt;
    }
}
