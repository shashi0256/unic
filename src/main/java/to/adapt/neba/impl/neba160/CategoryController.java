package to.adapt.neba.impl.neba160;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CategoryController {
    @RequestMapping(value = "/category/list", method = RequestMethod.GET)
    public List sayHello() {
        return Arrays.asList("A", "B", "C");
    }
}
