package com.infy.form;

import java.util.Date;


public class MyDataModel extends MyAbstractTreeTableModel {
  
    static protected String[] columnNames = { "Address type", "Address Line", "Country Label", "Country Line","District Label","District" };
 
    static protected Class<?>[] columnTypes = { MyTreeTableModel.class, String.class, String.class, String.class , String.class, String.class };
 
    public MyDataModel(MyDataNode rootNode) {
        super(rootNode);
        root = rootNode;
    }
 
    public Object getChild(Object parent, int index) {
        return ((MyDataNode) parent).getChildren().get(index);
    }
 
 
    public int getChildCount(Object parent) {
        return ((MyDataNode) parent).getChildren().size();
    }
 
 
    public int getColumnCount() {
        return columnNames.length;
    }
 
 
    public String getColumnName(int column) {
        return columnNames[column];
    }
 
 
    public Class<?> getColumnClass(int column) {
        return columnTypes[column];
    }
 
    public Object getValueAt(Object node, int column) {
        switch (column) {
        case 0:
            return ((MyDataNode) node).getAddressType();
        case 1:
            return ((MyDataNode) node).getAddressLine();
        case 2:
            return ((MyDataNode) node).getCountryLabel();
        case 3:
           return ((MyDataNode) node).getCountry();
        case 4:
        	 return ((MyDataNode) node).getDistrict();
        case 5:
        	return ((MyDataNode) node).getDistrict();
        default:
            break;
        }
        return null;
    }
 
    public boolean isCellEditable(Object node, int column) {
        return true; // Important to activate TreeExpandListener
    }
    /* public boolean hasChanged(int rowIndex) {
        //check if data has changed for given row
        //MyDataNode myDataNode = (MyDataNode) getValueAt(getRoot(), rowIndex);
    //MyDataNode myDataNode = (MyDataNode)
    	
        System.out.println("sakshi"+myDataNode.hasChanged());
        return myDataNode.hasChanged();
    }*/
    public void setValueAt(Object aValue, Object node, int column) {
    	switch (column){
    		case 1:
    	((MyDataNode) node).setAddressLine((String)aValue);
    	break;
    		case 2:
    			((MyDataNode) node).setCountryLabel((String)aValue);
    			break;
    	}
    	
    		
    }
   

 
}