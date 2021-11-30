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
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Mateusz
 */
@Named
@Getter
@Setter
@RequestScoped
public class BarChart {
    
    private BarChartModel barChartModel;
    private HorizontalBarChartModel horizontalBarChartModel;
    
    @PostConstruct
    private void init(){
        barChartModel = createBarCharModel();
        horizontalBarChartModel = createHorizontalBarModel();
    }

    private BarChartModel createBarCharModel() {
        BarChartModel bar = new BarChartModel();
        
        ChartSeries java = new ChartSeries();
        java.setLabel("JAVA");
        java.set("2018", 50);
        java.set("2019", 120);
        java.set("2020", 80);
        java.set("2021", 250);
        java.set("2022", 215);
        
        ChartSeries pythone = new ChartSeries();
        pythone.setLabel("PYTHONE");
        pythone.set("2018", 200);
        pythone.set("2019", 180);
        pythone.set("2020", 90);
        pythone.set("2021", 200);
        pythone.set("2022", 180);
        
        bar.addSeries(java);
        bar.addSeries(pythone);
        bar.setTitle("Bar Char");
        bar.setLegendPosition("n");
        
        Axis axis = bar.getAxis(AxisType.X);
        axis.setLabel("Language");
        Axis axis2 = bar.getAxis(AxisType.Y);
        axis2.setLabel("Jobs");
        axis2.setMin(0);
        axis2.setMax(350);
        
        
        return bar;
               
        
    }

    private HorizontalBarChartModel createHorizontalBarModel() {
                HorizontalBarChartModel bar = new HorizontalBarChartModel();
        
        ChartSeries java = new ChartSeries();
        java.setLabel("JAVA");
        java.set("2018", 50);
        java.set("2019", 120);
        java.set("2020", 80);
        java.set("2021", 250);
        java.set("2022", 215);
        
        ChartSeries pythone = new ChartSeries();
        pythone.setLabel("PYTHONE");
        pythone.set("2018", 200);
        pythone.set("2019", 180);
        pythone.set("2020", 90);
        pythone.set("2021", 200);
        pythone.set("2022", 180);
        
        bar.addSeries(java);
        bar.addSeries(pythone);
        bar.setTitle("Horizontal Char");
      
                bar.setTitle("Bar Char");
        bar.setLegendPosition("e");
        bar.setStacked(true);
        Axis axis = bar.getAxis(AxisType.Y);
        axis.setLabel("Language");
        Axis axis2 = bar.getAxis(AxisType.X);
        axis2.setLabel("Jobs");

        return bar;
    }
}
