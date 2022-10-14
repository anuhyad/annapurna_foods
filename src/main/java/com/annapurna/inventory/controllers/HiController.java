package com.annapurna.inventory.controllers;

import com.annapurna.inventory.entities.Provider;
import com.annapurna.inventory.services.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HiController {

    @Autowired
    HiService service;

    @GetMapping(value = "/mapping")
    public String getInfo() {
        System.out.println("Hello World");
        return "Hellos";
    }

    @GetMapping(value = "/provider/info")
    public List<Provider> getProviderInfo(@RequestParam Long providerId){
        return service.getProviderDetails(providerId);
    }

    @GetMapping(value="/hello")
    public Map<String, String> callAsyncMethod() {

        service.someAsyncMethod();

        return new HashMap<String, String>();  // returns empty braces
    }
}
