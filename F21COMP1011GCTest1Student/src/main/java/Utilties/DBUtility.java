package Utilties;

import com.example.f21comp1011gctest1student.NetflixShow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "student";
    private static String pw = "student";
    private static String connectURL = "jdbc:mysql://localhost:3306/javaTest";

    public static ArrayList<NetflixShow> getNetflixDetails() {
        ArrayList<NetflixShow> netflix = new ArrayList<>();
        String sql = "SELECT 'showId', 'type', 'title', 'rating', 'director', 'cast' FROM 'netflix';";

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                String showID = resultSet.getString("showID");
                String type = resultSet.getString("type");
                String title = resultSet.getString("title");
                String rating = resultSet.getString("rating");
                String director = resultSet.getString("director");
                String cast = resultSet.getString("cast");

                NetflixShow netflixShow = new NetflixShow(showID, type, title, rating, director, cast);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return netflix;
    }

}
