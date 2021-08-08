package net.codejava;

import java.sql.*;
import java.sql.Statement;
public class SQLite_Demo {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:/D:\\Movies\\src\\main\\java\\loginapp\\movies.sqlite";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl);//SELECT * FROM MOVIES WHERE DIRECTOR_NAME='FRANCIS FORD COPPOLA';, query could be used.
            String sql="SELECT * FROM movies";//can operate various sql queries like - insert into,DELETE,etc.
            Statement statement=connection.createStatement();
            ResultSet result=statement.executeQuery(sql);
            while(result.next()){
                String movie_name=result.getString("movie_name");
                String actor_name=result.getString("actor_name");
                String actress_name=result.getString("actress_name");
                String year_of_release=result.getString("year_of_release");
                String directors_name=result.getString("directors_name");
                System.out.println(movie_name+"|"+actor_name+"|"+actress_name+"|"+year_of_release+"|"+directors_name);
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to SQLite database");
            e.printStackTrace();
        }
    }
        }


