/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mateusz
 */
@Setter
@Getter
@RequestScoped
@Named(value = "sor")
public class SelectOneRadio {
    
   String option;
}
