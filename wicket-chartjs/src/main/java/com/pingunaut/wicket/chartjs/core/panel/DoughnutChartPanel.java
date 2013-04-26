package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Doughnut;
import com.pingunaut.wicket.chartjs.core.SimpleChartPanel;

public class DoughnutChartPanel extends SimpleChartPanel<Doughnut> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7460695892808795726L;

	public DoughnutChartPanel(String id, IModel<Doughnut> c, int width, int height) {
		super(id, c, width, height);
	}

	public DoughnutChartPanel(String id, IModel<Doughnut> c) {
		super(id, c);
	}
}