package my.sample;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("mock")
public class MockController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello mock";
    }

}
