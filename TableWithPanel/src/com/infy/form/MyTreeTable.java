package com.infy.form;

import java.awt.Dimension;

import javax.swing.JTable;

 
public class MyTreeTable extends JTable {
 
    private MyTreeTableCellRenderer tree;
     
     
    public MyTreeTable(MyAbstractTreeTableModel treeTableModel) {
        super();
 
        // JTree erstellen.
        tree = new MyTreeTableCellRenderer(this, treeTableModel);
         
        // Modell setzen.
        super.setModel(new MyTreeTableModelAdapter(treeTableModel, tree));
         
        // Gleichzeitiges Selektieren fuer Tree und Table.
        MyTreeTableSelectionModel selectionModel = new MyTreeTableSelectionModel();
        tree.setSelectionModel(selectionModel); //For the tree
        setSelectionModel(selectionModel.getListSelectionModel()); //For the table
 
         
        // Renderer fuer den Tree.
        setDefaultRenderer(MyTreeTableModel.class, tree);
        // Editor fuer die TreeTable
        setDefaultEditor(MyTreeTableModel.class, new MyTreeTableCellEditor(tree, this));
         
        // Kein Grid anzeigen.
        setShowGrid(true);
 
        // Keine Abstaende.
        setIntercellSpacing(new Dimension(5, 5));
       
        setDefaultRenderer(String.class, new CustomCellRenderer()); 
        getColumnModel().getColumn(1).setCellRenderer(new CustomCellRenderer());
    }

}
