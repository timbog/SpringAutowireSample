package com.company.example.config;

import org.springframework.stereotype.Service;

/**
 * Created by Bogdan1 on 02.08.2017.
 */

@Service
public class NameService {

    public String politeName(String name) {
        return "Mr. " + name;
    }

}
