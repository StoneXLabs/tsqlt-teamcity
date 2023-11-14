package org.tsqlt.runner.agent;

import org.jetbrains.annotations.NotNull;
import java.util.Map;

public class JdbcConnectionStringBuilder {
    private final String server;
    private final String database;
    private final int port;

    public JdbcConnectionStringBuilder(@NotNull ServerInstance serverInstance, @NotNull String database) {
        server = serverInstance.getServer();
        port = serverInstance.getPort();
        this.database = database;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("jdbc:sqlserver://");
        sb.append(server).append(":").append(port);
        sb.append(";databaseName=").append(database);
        sb.append(";integratedSecurity=true");

        return sb.toString();
    }
}
