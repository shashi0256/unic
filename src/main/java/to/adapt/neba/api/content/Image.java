package to.adapt.neba.api.content;

import io.neba.api.annotations.ResourceModel;

@ResourceModel(types = "neba-sample/components/image")
public class Image {
    private String alt;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
