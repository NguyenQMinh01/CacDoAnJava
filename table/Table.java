/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author E7440
 */
public class Table extends JFrame {

    public Table() {
        initComponents();
    }

    private void initComponents() {
        this.setTitle("");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Container con = getContentPane();

        DefaultTableModel df = new DefaultTableModel();

        df.addColumn("name");
        df.addColumn("maso");
        df.addColumn("sdt");

        String dong1[] = {"123", "345", "567"};
        String dong2[] = {"124", "346", "568"};
        String dong3[] = {"125", "347", "569"};

        df.addRow(dong1);
        df.addRow(dong2);
        df.addRow(dong3);
        
        JTable tb = new JTable(df);
        
        
        
        JScrollPane sc =new JScrollPane(tb);
        
        con.add(sc);
    }
}
