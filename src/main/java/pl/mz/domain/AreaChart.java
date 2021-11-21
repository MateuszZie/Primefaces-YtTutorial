/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Mateusz
 */
@Named
@Getter
@Setter
@RequestScoped
public class AreaChart {
    private LineChartModel lcm;
    
    @PostConstruct
    private void init(){
        createAreaModel();
    }

    private void createAreaModel() {
        lcm = new LineChartModel();
        
        LineChartSeries java = new LineChartSeries();
        java.setFill(false);
        java.setLabel("JAVA");
        java.set("2018", 50);
        java.set("2019", 120);
        java.set("2020", 80);
        java.set("2021", 250);
        java.set("2022", 215);
        
        LineChartSeries pythone = new LineChartSeries();
        pythone.setLabel("PYTHONE");
        pythone.set("2018", 200);
        pythone.set("2019", 180);
        pythone.set("2020", 90);
        pythone.set("2021", 200);
        pythone.set("2022", 180);
        
        lcm.addSeries(java);
        lcm.addSeries(pythone);
        
        lcm.setTitle("Programing Language");
        lcm.setLegendPosition("sw");
        lcm.setStacked(false);
        lcm.setShowPointLabels(true);
        
        Axis axis = new CategoryAxis("Years");
        lcm.getAxes().put(AxisType.X, axis);
        Axis yAxis = lcm.getAxis(AxisType.Y);
        yAxis.setLabel("Developers");
        yAxis.setMin(0);
               
    }
}
