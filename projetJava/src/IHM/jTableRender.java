package IHM;

import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import javax.swing.JTable;

public class jTableRender extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if((row%2) == 0){
            component.setBackground(Color.GRAY);
        }else{
            component.setBackground(Color.WHITE);
        }




        return component;
    }

}
