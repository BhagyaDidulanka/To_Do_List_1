package db;

public class DBConection {
    private static DBConection dbConection;

    private DBConection(){

    }

    public static DBConection getInstance(){
        if(dbConection==null){
             dbConection=new DBConection();
        }
        return dbConection;
    }
}
