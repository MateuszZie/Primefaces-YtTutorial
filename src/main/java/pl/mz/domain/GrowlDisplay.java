/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Mateusz
 */
@Named
@RequestScoped
public class GrowlDisplay {
    public void displayMessage() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Called","Display message"));
    }
}
