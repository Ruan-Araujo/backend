package H2;
import java.sql.*;

public class App {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS animal; " +
            "CREATE TABLE animal " +
            "(id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(32) NOT NULL, tipo VARCHAR(32) NOT NULL)";

    private static final String sqlInsert = "INSERT INTO animal " +
                "(nome, tipo) VALUES " +
                "('meg', 'cachorro'), " +
                "('mingau', 'gato'), " +
                "('dumbo', 'elefante'), " +
                "('pup'), ('cachorro'), " +
                "('pe de pano'), ('cavalo')";

    private static final String sqlDelete = "DELETE FROM animal WHERE id = 2";

    public static void main(String[] args) throws Exception {

        Class.forName("org.h2.Driver");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert);

            showAnimal(connection);

            statement.execute(sqlDelete);

            showAnimal(connection);
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            if (connection == null) {
                return;
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    private static void showAnimal(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM animal";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        while (rs.next()) {
            System.out.println(rs.getInt(1) + "" + rs.getString(2) +
                   "" + rs.getString(3));
        }
    }

}
