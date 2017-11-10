package sample.Database;

import java.sql.ResultSet;

/**
 * Created by mosab on 26/07/17.
 */
public class DatabaseOperation {

    private DatabaseHandler databaseHandler;

    /*
    * This constructor to initiate databaseHandler instance
    * */
    public DatabaseOperation(DatabaseHandler databaseHandler)
    {
        this.databaseHandler = databaseHandler;
    }

    /*
    * select function v1.0
    * This function make select query depend on the two parameter that you passing in
    * It could be modified (override) to meet your need
    * Parameters :
    * col(String)   => This parameter for the column name in the database that you wont to select it
    * from(String)  => This parameter for the table name that you wont to select from
    * where(String) => This parameter for the column that you wont to check it
    * key(String)   => This parameter for the key or the value that you search for or looking for
    * */
    public ResultSet select(String col, String from, String where, String key)
    {
        String qu = "SELECT " + col + " FROM " + from + "WHERE " + where + " ='" + key + "'";
        return databaseHandler.execQuery(qu);
    }

    /*
    * insert Function v1.0
    * This function for inserting data to the tables
    * It could be modified (override) to meet your need
    * Parameter :
    * values            => This is values that you wont to insert it in the table
    * table(String)     => This for table name that you wont the data to be inserted in
    * */
    public boolean insert(String val1, String val2, String val3, String table)
    {
        String qu = "INSERT INTO " + table + " VALUES ("
                + "'" + val1 + "',"
                + "'" + val2 + "',"
                + "'" + val3 + "',"
                + ")";

        return databaseHandler.execAction(qu);
    }


    /*
    * update Function v1.0
    * This function for update the data on the database base on the parameter that you pass it
    * The function will return true if the execution is done correctly and it will return false
    * if not
    * It could be modified (override) to meet your need
    * Function parameters :
    * table(String)     => This for the table that you wont to update it
    * setCol(String)    => This for the table column that you wont to set the data into it
    * setVal(String)    => This for the column value that you wont to reset(update) it
     * where(String)    => This for the column that you will update base on it
     * whereVal(String)    => This for the value that you will update base on it
    *
    * */
    public boolean update(String table, String setCol, String setVal, String where, String whereVal)
    {
        String str = "UPDATE " + table + " SET " + setCol + " = " + setVal + " WHERE " + where + " = '" + whereVal + "'";

        return databaseHandler.execAction(str) && databaseHandler.execAction(str);
    }


    /*
    * delete Function v1.0
    * This function delete row in database based on the value that you will pass it
    * it will return if the execution is done correctly and it will return false if it's not
    * Function parameter :
    * from(String)      => This for the table name that you wont to delete from it
    * where(string)     => This for the column that you will delete based on it
    * whereVal(String)  => This for the column value that we will delete based on it
    * */
    public boolean delete(String from, String where, String whereVal)
    {
        String query = "DELETE  FROM " + from + " WHERE " + where + "= '" + whereVal + " '";

        return databaseHandler.execAction(query) && databaseHandler.execAction(query);
    }



}
