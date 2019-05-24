package com.lic37.annotation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "dev")
public class ProfileImpl_B implements ProfileInterface {
    @Override
    public String take() {
        return "take - called in ProfileImpl_B";
    }
}
