package net.xdevelop.template.helloworld;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "hello-world-service",fallback = VersionServiceHystric.class)
public interface IVersionService {
    @RequestMapping(value = "/getVersion", method = RequestMethod.GET)
    String getVersion();
}
