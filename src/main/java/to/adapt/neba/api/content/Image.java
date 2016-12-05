package to.adapt.neba.api.content;

import io.neba.api.annotations.Path;
import io.neba.api.annotations.ResourceModel;
import io.neba.api.resourcemodels.Optional;

@ResourceModel(types = "neba-sample/components/image")
public class Image {
    @Path("..")
    private Optional<ProductSummary> summary;

    private String alt;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
