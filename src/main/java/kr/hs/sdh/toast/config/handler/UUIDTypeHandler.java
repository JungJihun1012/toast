package kr.hs.sdh.toast.config.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

@MappedTypes(value = UUID.class)
public final class UUIDTypeHandler implements TypeHandler<UUID> {

    @Override
    public void setParameter(
        final PreparedStatement preparedStatement,
        final int index,
        final UUID parameter,
        final JdbcType jdbcType
    ) throws SQLException {
        preparedStatement.setString(index, parameter.toString());
    }

    @Override
    public UUID getResult(
        final ResultSet resultSet,
        final String columnName
    ) throws SQLException {
        final String uuidString = resultSet.getString(columnName);

        return UUID.fromString(uuidString);
    }

    @Override
    public UUID getResult(final ResultSet resultSet, int columnIndex) throws SQLException {
        final String uuidString = resultSet.getString(columnIndex);

        return UUID.fromString(uuidString);
    }

    @Override
    public UUID getResult(final CallableStatement callableStatement, int columnIndex) throws SQLException {
        final String uuidString = callableStatement.getString(columnIndex);

        return UUID.fromString(uuidString);
    }

}