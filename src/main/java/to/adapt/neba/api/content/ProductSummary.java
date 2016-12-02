package to.adapt.neba.api.content;

import io.neba.api.annotations.PostMapping;
import io.neba.api.annotations.ResourceModel;
import io.neba.api.annotations.This;
import lombok.Data;
import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.resource.Resource;

@Data
@ResourceModel(types = "neba-sample/components/productSummary")
public class ProductSummary {
    @This
    Resource pageResource;

    String heroAlt;

    Image heroImage;

    @PostMapping
    public void initialize() {
        if (StringUtils.isNotEmpty(heroAlt)) {
            heroImage.setAlt(heroAlt);
        }
    }
}
