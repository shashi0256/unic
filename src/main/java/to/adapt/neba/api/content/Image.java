package to.adapt.neba.api.content;

import io.neba.api.annotations.Path;
import io.neba.api.annotations.ResourceModel;
import io.neba.api.resourcemodels.Optional;

@ResourceModel(types = "neba-sample/components/image")
public class Image {
    @Path("..")
    private Optional<ImageProperties> overloadedProperties;

    private String alt;

    public String getAlt() {
        return overloadedProperties.isPresent() ? overloadedProperties.get().getAlt() : alt;
    }
}
