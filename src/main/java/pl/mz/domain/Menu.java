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
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;


/**
 *
 * @author Mateusz
 */
@Getter
@Setter
@RequestScoped
@Named
public class Menu implements Serializable{
    
    private MenuModel model;
    
    @PostConstruct
    private void init(){
        model = new DefaultMenuModel();
        
        DefaultSubMenu submenu = new DefaultSubMenu();
        submenu.setLabel("Riples Code");
        
        DefaultMenuItem menuItem = new DefaultMenuItem();
        menuItem.setValue("Prime Faces");
        menuItem.setUrl("#");
        submenu.getElements().add(menuItem);
        model.getElements().add(submenu);
        
        submenu = new DefaultSubMenu();
        submenu.setLabel("Options");
        
        menuItem = new DefaultMenuItem();
        menuItem.setValue("File");
        menuItem.setCommand("#{menu.file}");
        menuItem.setUpdate("message");
        submenu.getElements().add(menuItem);
        
        menuItem = new DefaultMenuItem();
        menuItem.setValue("Edit");
        menuItem.setCommand("#{menu.edit}");
        menuItem.setUpdate("message");
        submenu.getElements().add(menuItem);
        
        menuItem = new DefaultMenuItem();
        menuItem.setValue("View");
        menuItem.setCommand("#{menu.view}");
        menuItem.setUpdate("message");
        submenu.getElements().add(menuItem);
        model.getElements().add(submenu);
    }
    
    public void file(){
        addMessage("File", "File Clicked");
    }
    public void edit() {
        addMessage("Edit", "Edit Clicked");
    }
    public void view() {
        addMessage("View", "View Clicked");
    }
    
public void addMessage(String title, String details){
    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, title, details);
    FacesContext.getCurrentInstance().addMessage(null, message);
}
    
}
