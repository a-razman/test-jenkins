/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aymaxconsulting.testjenkins;

/**
 *
 * @author Utilisateur
 */
public class HomeClass {
	public static final String msg = "Do it one more time";

    public HomeClass() {

    }

    public HomeClass(String name, String domain) {
        this.name = name;
        this.domain = domain;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain the domain to set
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    private String name;
    private String domain;
}
