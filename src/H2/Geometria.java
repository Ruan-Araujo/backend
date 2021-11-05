package H2;
import java.sql.*;

public class Geometria {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS figura; " +
            "CREATE TABLE figura " +
            "(id AUTO_INCREMENT INT PRIMARY KEY, tipo VARCHAR(32), cor VARCHAR(16))";

    private static final String sqlInsert = "INSERT INTO figura (id, tipo, cor) " +
            "VALUES ('circulo', 'vermelho'), ('circulo', 'vermelho'), ('quadrado', 'azul'), " +
            "('quadrado'), ('verde'), ('quadrado'), ('amarelo')";

    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert);

            showFigura(connection);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
    private static void showFigura(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM figura WHERE cor = 'vermelho'";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        while (rs.next()) {
            System.out.println(rs.getInt(1) + "" + rs.getString(2) +
                    "" + rs.getString(3));
        }
    }
}
