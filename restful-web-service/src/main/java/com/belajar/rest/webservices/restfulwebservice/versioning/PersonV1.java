/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.rest.webservices.restfulwebservice.versioning;

/**
 *
 * @author JJuriah
 */
public class PersonV1 {
    private String name;

    public PersonV1() {
        super();
    }
    
    public PersonV1(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
