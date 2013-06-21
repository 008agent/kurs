package kurs;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;


public class Kurs implements Runnable
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Kurs());
    }

    @Override
    public void run() 
    {
        try 
        {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(Kurs.class.getName()).log(Level.SEVERE, null, ex);
        }

        formMain frm    =       new formMain();   
        frm.setVisible(true);
    }
}
