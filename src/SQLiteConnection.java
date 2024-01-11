import java.sql.*;

public class SQLiteConnection {
    private static Connection connection;

    private SQLiteConnection() {}

    public static Connection getInstance() {
        if (connection == null) {
            String url = "jdbc:sqlite:path/to/your/database.db";
            try {
                connection = DriverManager.getConnection(url);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    // Outros métodos para operações no banco de dados aqui

    public static void main(String[] args) {
        Connection conn = SQLiteConnection.getInstance();
        // Faça operações no banco de dados usando 'conn'
    }
}
