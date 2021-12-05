/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Mateusz
 */
@Getter
@Setter
@RequestScoped
@Named
public class PanelMenu implements Serializable{
    
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
