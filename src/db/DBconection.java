package db;

public class DBConection {
    private static DBConection dbConection;

    private DBConection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static DBConection getInstance(){
        if(dbConection==null){
             dbConection=new DBConection();
        }
        return dbConection;
    }
}
