package org.cookieandkakao.babting.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class deploytest {
    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
