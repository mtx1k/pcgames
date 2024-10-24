package dci.pcgames;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PCGameDAOImpl implements PCGameDAO {

    private final Connection connection;

    public PCGameDAOImpl(DBConnectionManager connectionManager) {
        this.connection = connectionManager.getConnection();
    }

    @Override
    public List<PCGame> getGames() {
        String sql = "SELECT * FROM pc_games";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);

            List<PCGame> games = new ArrayList<>();
            while (resultSet.next()) {
                PCGame game = new PCGame(
                        resultSet.getLong("id_game"),
                        resultSet.getString("name"),
                        resultSet.getLong("category_id"),
                        resultSet.getDouble("price")
                );
                games.add(game);
            }
            return games;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}