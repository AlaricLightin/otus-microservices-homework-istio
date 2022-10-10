package com.example.appforistio.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VersionController {
    private final String versionString;

    public VersionController(
            @Value("${version.string}")
            String versionString) {
        this.versionString = versionString;
    }

    @GetMapping("/")
    @ResponseBody
    public String getVersion() {
        return "Version: " + versionString;
    }
}
