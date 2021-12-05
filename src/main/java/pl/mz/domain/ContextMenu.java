/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;


/**
 *
 * @author Mateusz
 */
@Getter
@Setter
@RequestScoped
@Named
public class ContextMenu implements Serializable{
    
    private MenuModel menuModel;
    
    @PostConstruct
    public void init(){
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
        menuItem.setValue("Save");
        menuItem.setCommand("#{contextMenu.save}");
        menuItem.setUpdate("message");
        menuModel.getElements().add(menuItem);
    }
    
    public void back(){
        addMessage("Back", "Back Clicked");
    }
    public void forward() {
        addMessage("Forward", "Forward Clicked");
    }
    public void reload() {
        addMessage("Reload", "Reload Clicked");
    }
    public void save() {
        addMessage("Save", "Save Clicked");
    }
    
public void addMessage(String title, String details){
    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, title, details);
    FacesContext.getCurrentInstance().addMessage(null, message);
}
    
}
