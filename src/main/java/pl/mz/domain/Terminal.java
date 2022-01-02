/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Data;

/**
 *
 * @author Mateusz
 */
@Named
@RequestScoped
@Data
public class Terminal {
    
    public String commandHandler(String command, String[] params){
        if(command.equals("rc")){
            if(params.length >0){
                return params[0] + " param for rc";    
            }else{
                return "rc without param";
            }
        }else if(command.equals("date")){
            return new Date().toString();
        }else{
            return "not found";
        }
    }
}
