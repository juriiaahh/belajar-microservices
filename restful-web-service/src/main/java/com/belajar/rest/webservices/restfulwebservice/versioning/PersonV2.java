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
public class PersonV2 {
    private Name name;

    public PersonV2() {
        super();
    }
    
    public PersonV2(Name name) {
        super();
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    
    
}
