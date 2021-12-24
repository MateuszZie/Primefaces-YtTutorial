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
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mateusz
 */
@Named
@Getter
@Setter
@RequestScoped
public class AjaxSelector {

    private String firstName, lastName, gender;

    public void display() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                "Hello " + firstName + " " + lastName));
    }
}
