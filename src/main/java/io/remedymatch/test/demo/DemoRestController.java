package io.remedymatch.test.demo;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/kunde")
public class DemoRestController {

    @GetMapping
    @Secured("ROLE_admin")
    public String test(){
        return "test";
    }
}
