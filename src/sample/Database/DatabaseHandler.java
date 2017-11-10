package sample.Database;

import javax.swing.*;
import java.sql.*;

/**
 * Created by Mosab on 25/07/17.
 * To use this class you should inherit from it and use it
 * This class is for handling database connection and more
 * Functions :
 * createConnection
 * tableIsFound
 * execQuery
 * execAction
 * setupTables
 */
public class DatabaseHandler implements Setup {

    /*  DatabaseHandler instance can't make more than one instance from it    */
    private static DatabaseHandler handler;
    /*  Database url  */
    private static final String DB_URL = "jdbc:derby:database;create=true";
    /*  Database connection instance  */
    private static Connection conn = null;
    /*  Statement instance to execute database query  */
    private static Statement stmt = null;

    /*  DatabaseHandler constructor   */
    private DatabaseHandler()
    {
        this.createConnection();
        setupTables();
    }

    /*
     * DatabaseHandler v1.0
     * This method to make sure there is no more than one instance from this object  */
    public static DatabaseHandler getInctance()
    {
        if(handler == null)
        {
            handler = new DatabaseHandler();
        }

        return handler;
    }

    /*
     * createConnection v1.0
     * This method to create database connection  */
    private void createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection(DB_URL);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* * tableIsFound v1.0
       * This method check if there is table in the DB with this name or not
       * it will return true if the table is found
       * it will return false if the table is not found
       * Method parameters :
       * tableName(String)  => by this parameter you will pass the table name to check it
       * */
    public final boolean tableIsFound(String tableName)
    {
        try
        {
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet table = dbm.getTables(null, null, tableName.toUpperCase(), null);

            if (table.next())
            {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    /*
     * execQuery v1.0
     * This method get from you query and it will execute it and return
     * ResultSet instance
     * Method parameters:
     * Query(String)    => you passing the query string to getting result for your query
     */
    public final ResultSet execQuery(String query)
    {
        ResultSet resultSet ;

        try
        {
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return resultSet;

    }

    /*
    * execAction v1.0
    * This method is for executing query and it will return true if execution is done
    * and it return false if it can't be done for some reason
    * Method parameter :
    * qu(String)    =>
    * */
    public final boolean execAction(String qu)
    {
        try
        {
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }

    /*  SetupTable Function
      * This function for initiate the tables in the database
      * You should override this method in your subclass and reimplemented
      * */
    @Override
    public void setupTables() {

    }
}
