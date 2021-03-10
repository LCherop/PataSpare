/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ui;

import java.awt.Component;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.*;

/**
 *
 * @author LauraC
 */
public class ImageRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected,boolean hasFocus, int row, int column)
    {
        JLabel label = new JLabel();
 
        if (value!=null) {
        label.setHorizontalAlignment(JLabel.CENTER);
        //value is parameter which filled by byteOfImage
        label.setIcon(new ImageIcon((byte[])value));
        }
        
        return label;
    }
    
}
