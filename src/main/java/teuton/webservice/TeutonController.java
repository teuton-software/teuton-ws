package teuton.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeutonController {
	
    @RequestMapping("/version")
    @GetMapping
    public Version version() {
        return new Version();
    }

}
