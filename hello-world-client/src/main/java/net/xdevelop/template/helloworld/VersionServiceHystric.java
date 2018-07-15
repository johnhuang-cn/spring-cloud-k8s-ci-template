package net.xdevelop.template.helloworld;

import org.springframework.stereotype.Component;

@Component
public class VersionServiceHystric implements IVersionService {
    @Override
    public String getVersion() {
        return "unknown version";
    }
}