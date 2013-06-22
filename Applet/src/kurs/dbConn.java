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
    
    /** возвращает ID человека из базы по его имени */
    public int t_людиID_from_t_людиName(String name)
    {
        try
        {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_люди WHERE t_людиName = '" + name + "'");
            ResultSet rs = ps.executeQuery();
            int out_tmp = rs.getInt("t_людиID");
            ps.close();
            rs.close();
            return out_tmp;
        }
        catch(SQLException sqlEx)
        {
            System.err.println("t_людиID_from_t_людиName " +sqlEx.getMessage());
            return 0;
        }
    }
    
    /** возвращает полный список имен людей из базы */
    public String[] t_людиName_список()
    {
        LinkedList<String> lst_tmp = new LinkedList<String>();
        try
        {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM 't_люди'");
            ResultSet         rs = ps.executeQuery();
            while(rs.next())
            {
                lst_tmp.add(rs.getString("t_людиName"));
            }
            String[] arr_out = new String[lst_tmp.size()];
            for(int c=0;c<lst_tmp.size();c++)
            {
                arr_out[c] = lst_tmp.get(c);
            }
            ps.close();
            rs.close();
            return arr_out;
        }
        catch(SQLException sqlEx)
        {
             System.err.println("t_людиName_список " + sqlEx.getMessage());
             return new String[]{"na"};
        }
    }
    
    /** получает ID должность для указанного ID человека */
    public int t_должностьId_from_t_людиID(int IdPerson)
    {
        try
        {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_люди WHERE t_людиID = " + String.valueOf(IdPerson));
            ResultSet         rs = ps.executeQuery();
            int out_tmp = rs.getInt("t_людиДолжностьId");
            ps.close();
            rs.close();
            return out_tmp;
        }
        catch(SQLException sqlEx)
        {
             System.err.println("t_должностьId_from_t_людиID " + sqlEx.getMessage());
             return 0;
        }
    }
    
    /** возвращает имя должности по ее ID в базе */
    public String t_должностиName_from_t_должностьID(int IdДолжности)
    {
        try
        {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_должности WHERE t_должностиID = " + String.valueOf(IdДолжности));
            ResultSet         rs = ps.executeQuery();
            String out_tmp = rs.getString("t_должностиName");
            ps.close();
            rs.close();
            return out_tmp;
        }
        catch(SQLException sqlEx)
        {
             System.err.println("t_должностиName_from_t_должностьID " + sqlEx.getMessage());
             return "na";
        }  
    }
    /** возвращает ставку по должности по ее ID в базе */    
    public double t_должностиID_to_t_должностиСтавка(int IdДолжности)
    {
        try
        {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_должности WHERE t_должностиID = " + String.valueOf(IdДолжности));
            ResultSet         rs = ps.executeQuery();
            double out_tmp = rs.getDouble("t_должностиСтавка");
            ps.close();
            rs.close();
            return out_tmp;
        }
        catch(SQLException sqlEx)
        {
             System.err.println("t_должностиID_to_t_должностиСтавка " + sqlEx.getMessage());
             return 0.0;
        }  
    }
    
    public LinkedList<Integer> t_людиID_to_t_делаIDs(int IdЧеловека)
    {
        try
        {
            LinkedList<Integer> tmp_out = new LinkedList<Integer>();
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_дела WHERE id_человека = " + String.valueOf(IdЧеловека));
            ResultSet         rs = ps.executeQuery();
            //double out_tmp = rs.getDouble("t_должностиСтавка");
            while(rs.next())
            {
                tmp_out.add( rs.getInt("t_делаID") );
            }
            ps.close();
            rs.close();
            return tmp_out;
        }
        catch(SQLException sqlEx)
        {
             System.err.println("t_людиID_to_t_делаIDs " + sqlEx.getMessage());
             LinkedList<Integer> tmp_out = new LinkedList<Integer>();
             tmp_out.add(0);
             return tmp_out;
        }  
    }
    
    public String t_делаID_to_t_дела_статус(int Idдела)
    {
        try
        {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_дела WHERE t_делаID = " + String.valueOf(Idдела));
            ResultSet         rs = ps.executeQuery();
            String out_tmp = rs.getString("статус");
            ps.close();
            rs.close();
            return out_tmp;
        }
        catch(SQLException sqlEx)
        {
             System.err.println("t_делаID_to_t_дела_статус " + sqlEx.getMessage());
             return "na";
        }       
    }
    
    public int t_статьиId_from_t_дело_id(int Idдела)
    {
        try
        {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_дела WHERE t_делаID = " + String.valueOf(Idдела));
            ResultSet         rs = ps.executeQuery();
            int out_tmp = rs.getInt("id_статьи");
            ps.close();
            rs.close();
            return out_tmp;
        }
        catch(SQLException sqlEx)
        {
             System.err.println("t_статьиId_from_t_дело_id " + sqlEx.getMessage());
             return 0;
        }       
    }
    
    public String t_статьиName_from_t_статьи_id(int IdСтатьи)
    {
        try
        {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_статьи WHERE t_статьиID = " + String.valueOf(IdСтатьи));
            ResultSet         rs = ps.executeQuery();
            String out_tmp = rs.getString("t_статьиName");
            ps.close();
            rs.close();
            return out_tmp;
        }
        catch(SQLException sqlEx)
        {
             System.err.println("t_статьиName_from_t_статьи_id " + sqlEx.getMessage());
             return "na";
        }   
    }
    
    public LinkedList<Integer> t_экспертизы_from_id_человека(int IdЧеловека)
    {
        try
        {
            LinkedList<Integer> tmp_out = new LinkedList<Integer>();
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_эксперты_дела WHERE id_человека = " + String.valueOf(IdЧеловека));
            ResultSet         rs = ps.executeQuery();
            //double out_tmp = rs.getDouble("t_должностиСтавка");
            while(rs.next())
            {
                tmp_out.add( rs.getInt("id_экспертизы") );
            }
            ps.close();
            rs.close();
            //
            System.err.println(tmp_out.size());
            return tmp_out;
        }
        catch(SQLException sqlEx)
        {
             LinkedList<Integer> tmp_out = new LinkedList<Integer>();
             tmp_out.add(0);
             return tmp_out;
        }      
    }
    
    public String t_экспертизы_дата_from_t_экспертизы_id(int IdЭкспертизы)
    {
        try
        {
            PreparedStatement ps = this.connection.prepareStatement("SELECT * FROM t_экспертизы WHERE id_экспертизы = " + String.valueOf(IdЭкспертизы));
            ResultSet         rs = ps.executeQuery();
            String out_tmp = rs.getString("дата");
            ps.close();
            rs.close();
            return out_tmp;
        }
        catch(SQLException sqlEx)
        {
             System.err.println("t_экспертизы_дата_from_t_экспертизы_id " + sqlEx.getMessage());
             return "na";
        }        
    }
   // public double  t_людиID
}
