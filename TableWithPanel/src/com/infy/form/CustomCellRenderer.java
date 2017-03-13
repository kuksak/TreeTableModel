package com.infy.form;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;



public class CustomCellRenderer extends DefaultTableCellRenderer {
	 public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
         setOpaque(isSelected);
         //use table's current modal to repaint the edited cell
         TableModel model = table.getModel();
         if (model instanceof MyDataModel) {
        	 MyDataModel myModel = (MyDataModel) model;
             //check if cell has changed and apply required transformations
             //if (myModel.hasChanged(row)) {
             
                 if (!isSelected) {
                     //setBackground(Color.RED);
                     setForeground(Color.GREEN);
                     setOpaque(true);
                 }
                 else{
                 	setForeground(Color.BLACK);
                 	  setOpaque(true);
                 }
             }
             else{
             	setForeground(Color.BLACK);
             }
         //}
         return this;
     }
 }
