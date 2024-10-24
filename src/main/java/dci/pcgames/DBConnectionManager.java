package dci.pcgames;

import java.sql.Connection;

public interface DBConnectionManager {
    Connection getConnection();
}