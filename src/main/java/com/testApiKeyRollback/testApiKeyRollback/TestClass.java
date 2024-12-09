package com.testApiKeyRollback.testApiKeyRollback;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class TestClass {

    @PostConstruct
    public void init() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void keystore(){
        String apiKey = "***REMOVED***";
        String password = "***REMOVED***";
    }
}
