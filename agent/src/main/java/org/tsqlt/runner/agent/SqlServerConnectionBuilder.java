package org.tsqlt.runner.agent;

import jetbrains.buildServer.agent.BuildAgentConfiguration;
import jetbrains.buildServer.util.Bitness;
import org.jetbrains.annotations.NotNull;
import org.tsqlt.runner.common.PropertyNames;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;
import java.util.Vector;

public class SqlServerConnectionBuilder implements ConnectionBuilder {
    private final JdbcConnectionStringBuilder builder;

    public SqlServerConnectionBuilder(@NotNull Map<String, String> properties){
        ServerInstance server = ServerInstanceImpl.create(properties);
        String database = properties.get(PropertyNames.DATABASE);

        builder = new JdbcConnectionStringBuilder(server, database);
    }

    @NotNull
    @Override
    public Connection getConnection(@NotNull BuildAgentConfiguration configuration) throws SQLException, ClassNotFoundException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(builder.toString());
    }
}
