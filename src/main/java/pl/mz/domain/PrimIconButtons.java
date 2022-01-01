/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import lombok.Data;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author Mateusz
 */
@Named
@Data
@RequestScoped
public class PrimIconButtons {
    
    private MenuModel menuModel;
    
    @PostConstruct
    public void init(){
         menuModel = new DefaultMenuModel();
         
         DefaultMenuItem item = DefaultMenuItem.builder()
                 .value("Google")
                 .url("http://www.google.pl")
                 .build();
         
         DefaultSubMenu submenu = DefaultSubMenu.builder()
                 .label("Dynamic Submenu")
                 .addElement(item)
                 .build();
         
         menuModel.getElements().add(submenu);
         
        item = DefaultMenuItem.builder()
                .value("Save")
                .icon("pi pi-save")
                .function((i) -> save())
                .update("msg")
                .build();

        submenu = DefaultSubMenu.builder()
                .label("Dynamic Action")
                .addElement(item)
                .build();
        
        item = DefaultMenuItem.builder()
                .value("Delete")
                .icon("pi pi-times")
                .command("#{primIconButtons.delete}")
                .ajax(false)
                .build();
        
        submenu.getElements().add(item);

        menuModel.getElements().add(submenu);
             
    }
    
    public String save(){
        addMessage("Save");
        return null;
    }
    
    public void update() {
        addMessage("Updated");
    }
    
    public void delete() {
        addMessage("Deleted");
    }
    
    public void action() {
        addMessage("Some Actions");
    }
    
    public void addMessage(String title){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(title, null));
    }
}
