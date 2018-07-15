package net.xdevelop.template.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    private String version = "v0.0.2";
	
    @GetMapping(value = "/getVersion")
    public String getName() {
        return version;
    }
}
