/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
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
@Named
public class SelectCheckBoxMenu {

    private String[] selectColors, selectColors2, selectPrimaryColor;
    private List<String> colors;
    private List<SelectItem> primaryColors;

    @PostConstruct
    public void init() {
        colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");

        primaryColors = new ArrayList<SelectItem>();
        SelectItemGroup pc = new SelectItemGroup("Primary Colors");
        pc.setSelectItems(new SelectItem[]{
            new SelectItem("Red", "RED"),
            new SelectItem("Blue", "BLUE"),
            new SelectItem("Green", "GREEN")
        });
                SelectItemGroup rc = new SelectItemGroup("Rest Colors");
        rc.setSelectItems(new SelectItem[]{
            new SelectItem("Yellow", "YELLOW"),
            new SelectItem("Orange", "ORANGE"),
            new SelectItem("Purple", "PURPLE")
        });
        primaryColors.add(pc);
        primaryColors.add(rc);
    }

}
