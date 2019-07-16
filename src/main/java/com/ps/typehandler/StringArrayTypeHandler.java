package com.ps.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *  varchar <----> string[]
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
public class StringArrayTypeHandler extends BaseTypeHandler<String[]> {
    /**
     * java -> jdbc
     *
     * string[]  --> varchar
     * @param preparedStatement
     * @param i
     * @param strings
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String[] strings, JdbcType jdbcType) throws SQLException {
        // string[]  --> a,b,c,d
        StringBuffer sb = new StringBuffer();
        for(String s  : strings) {
            sb.append(",").append(s);
        }
        preparedStatement.setString(i, sb.substring(1).toString());
    }

    @Override
    public String[] getNullableResult(ResultSet resultSet, String s) throws SQLException {
        // jdbc a,c,b,c   ->  [a,c,b,c]
        return resultSet.getString(s).split(",");
    }

    @Override
    public String[] getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getString(i).split(",");
    }
    /**
     * 调用存储过程....
     * @param callableStatement
     * @param i
     * @return
     * @throws SQLException
     */
    @Override
    public String[] getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return new String[0];
    }
}
