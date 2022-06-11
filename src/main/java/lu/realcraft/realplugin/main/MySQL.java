package lu.realcraft.realplugin.main;

import java.sql.*;






public class MySQL {
    private String HOST;
    private String DATABASE;
    private String USER;
    private String PASSWORD;
    private int PORT;

    private Connection con;

    public MySQL(String host, String database, String user, String password, int PORT){
        this.HOST = host;
        this.DATABASE = database;
        this.USER = user;
        this.PASSWORD = password;
        this.PORT = PORT;
        connect();
        update("CREATE TABLE IF NOT EXISTS player_backgroundCOLOR(ID INT , UUID VARCHAR(100) , COLOR VARCHAR(100));");
        update("CREATE TABLE IF NOT EXISTS player_permissions(ID INT , UUID VARCHAR(100) , PERMISSIONS VARCHAR(100));");
        update("CREATE TABLE IF NOT EXISTS player_task_Item_save(ID INT , UUID VARCHAR(100) , ITEM VARCHAR(100));");
        update("CREATE TABLE IF NOT EXISTS player_task_ItemMata_save(ID INT , UUID VARCHAR(100) , ITEM VARCHAR(100));");
    }
    
    public void connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE + "?autoReconnect=true", USER, PASSWORD);
            System.out.println("[MySQL] Die Verbindung zur MySQL wurde hergestellt!");
        } catch (SQLException e) {
            System.out.println("[MySQL] Die Verbindung zur MySQL ist fehlgeschlagen! Fehler: " + e.getMessage());

        }
    }

    public void close() {
        try {
            if(con != null) {
                con.close();
                System.out.println("[MySQL] Die Verbindung zur MySQL wurde Erfolgreich beendet!");

            }
        } catch (SQLException e) {
            System.out.println("[MySQL] Fehler beim beenden der Verbindung zur MySQL! Fehler: " + e.getMessage());

        }
    }

    public void update(String qry) {
        try {
            Statement st = con.createStatement();
            st.executeUpdate(qry);
            st.close();
        } catch (SQLException e) {
            connect();
            System.err.println(e);
        }
    }

    public ResultSet query(String qry) {
        ResultSet rs = null;

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(qry);
        } catch (SQLException e) {
            connect();
            System.err.println(e);
        }
        return rs;
    }
    
    
}