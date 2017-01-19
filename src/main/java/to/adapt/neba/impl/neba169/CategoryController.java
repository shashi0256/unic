package to.adapt.neba.impl.neba169;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.LoginException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public List<Category> listCategory() throws LoginException {
        return Arrays.asList(new Category(), new Category());
    }
}