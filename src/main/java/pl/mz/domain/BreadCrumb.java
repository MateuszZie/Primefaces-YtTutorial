/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author Mateusz
 */
@Named
@Getter
@Setter
@RequestScoped
public class BreadCrumb {

    private MenuModel menuModel;

    @PostConstruct
    private void init() {
        createMenuModel();
    }

    private void createMenuModel() {
        menuModel = new DefaultMenuModel();
        DefaultMenuItem menuItem = new DefaultMenuItem();
        menuItem.setValue("Home");
        menuItem.setUrl("http://localhost:8080/Primefaces-YtTutorial/");

        menuModel.getElements().add(menuItem);
        
        menuItem = new DefaultMenuItem();
        menuItem.setValue("Java");
        menuItem.setUrl("https://www.udemy.com/certificate/UC-4bedd3a4-24e3-4e9c-bc22-bb2447c3f100/");

        menuModel.getElements().add(menuItem);
        menuItem = new DefaultMenuItem();
        menuItem.setValue("Spring");
        menuItem.setUrl("https://www.udemy.com/certificate/UC-5337ba25-e124-48d8-bbe7-b1e3c60b80d6/");

        menuModel.getElements().add(menuItem);
        
        menuItem = new DefaultMenuItem();
        menuItem.setValue("Java EE");
        menuItem.setUrl("https://www.udemy.com/certificate/UC-05322145-952f-48cc-9af2-74d0fc6e7a86/");

        menuModel.getElements().add(menuItem);
    }
}
