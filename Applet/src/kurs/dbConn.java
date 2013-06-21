package kurs;

import java.sql.*;
import java.util.LinkedList;

public class dbConn 
{
    public  LinkedList<People>  lstPeople;
    String                      fdName;
    Connection                  connection;// = DriverManager.getConnection("jdbc:sqlite:" + "C:\\sqlitemanager_win_32_64\\skrf.db3" );
    boolean                     connected;
    PreparedStatement           statement;
    ResultSet                   res_set;
    //todo : add here lists with data from db
    
    public boolean get_connection_state()
    {
        return this.connected;
    }  
    public void close_connection()
    {
        try
        {
            this.connection.close();
            this.res_set.close();
            this.connected = false;
        }
        catch(SQLException sqlEx)
        {
            System.err.println(sqlEx.getMessage());
        }
    }
    
    public dbConn(String FD)
    {
        try
        {
            lstPeople = new LinkedList<People>();
            this.fdName     = FD;
            this.connection = DriverManager.getConnection("jdbc:sqlite:" + FD );
            this.connected  = true;
            
            this.statement = connection.prepareStatement( "SELECT * FROM t_checker" );
           // this.statement = connection.prepareStatement( "SELECT * FROM t_люди" );
            this.res_set = this.statement.executeQuery();
            
            //check if correct database file
            int checkField = this.res_set.getInt("t_checkerID");
            if(checkField!=666)
            {
                throw new SQLException();
            }
            
        }
        catch(SQLException sqlEx)
        {
            this.connected = false;
            System.err.println(sqlEx.getMessage() + " unable to resolve database file");
        }
    }
    
    //public void 
}
