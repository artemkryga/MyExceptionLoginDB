package ua.kryha.model.db;

        import ua.kryha.controller.InputData;
        import ua.kryha.model.entity.MyException;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;

public class ConnectionDB {
    private final String SQL_SELECT_ALL = "SELECT * FROM sweetness";
    private Connection connection;

    public ConnectionDB(String dbUrl, String name, String password) {
        try {
            this.connection = DriverManager.getConnection(dbUrl, name, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void addLoginIntoDB(InputData inputData) throws MyException {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO " + "accounts(login , password) VALUES (?, ?)");
                preparedStatement.setString(1, inputData.getInputLogin());
                preparedStatement.setString(2, inputData.getInputPassword());
                preparedStatement.execute();

            } catch (SQLException e) {
                throw new MyException(e.getMessage() , inputData.getInputLogin());
            }


    }

}
