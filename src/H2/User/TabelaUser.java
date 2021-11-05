package H2.User;
import java.sql.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TabelaUser {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS usuarios; " +
            "CREATE TABLE usuarios " +
            "(id INT AUTO_INCREMENT PRIMARY KEY, " +
            "primeiroNome VARCHAR(16) NOT NULL, " +
            "sobrenome VARCHAR(32) NOT NULL)";

    private static final String sqlInsert = "INSERT INTO usuarios " +
            "(primeiroNome, sobrenome) VALUES " +
            "('Jardel', 'Silva'), " +
            "('Rener', 'Almeida'), " +
            "('Caio', 'Castro')";

    private static final String sqlDelete = "DELETE FROM usuarios WHERE id = 1";

    // Declaração  do Logger

    private static final Logger logger = Logger.getLogger(TabelaUser.class);

    public static void main(String[] args) throws Exception {

        BasicConfigurator.configure();
        Connection connection = null;

        try {

            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert);
            statement.execute(sqlDelete);
            showUsuarios(connection);
            logger.info("O usuário de id 1 foi excluído");

        } catch ( Exception e ) {

            e.printStackTrace();

        } finally {

            if (connection == null) {
                return;
            } else {
                connection.close();
            }
        }
    }

    public static void showUsuarios(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM usuarios";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        while (rs.next()) {
            System.out.println(rs.getInt(1) + "" + rs.getString(2) +
                    "" + rs.getString(3));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "" );
    }
}
