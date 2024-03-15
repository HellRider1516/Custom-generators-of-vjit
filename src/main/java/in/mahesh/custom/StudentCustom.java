package in.mahesh.custom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class StudentCustom implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String suffix="19911A0";
		String prefix="";
		try {
			JdbcConnectionAccess connectionAccess = session.getJdbcConnectionAccess();
			Connection connection = connectionAccess.obtainConnection();
			Statement st = connection.createStatement();
			String sql="Select studentId from studentref";
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				int orderId = rs.getInt(1);
				prefix=String.valueOf(orderId);
				int i=orderId++;
				String sql2="update studentref set studentId=? where studentId=?";
				PreparedStatement pst = connection.prepareStatement(sql2);
				pst.setInt(1, i);
				pst.setInt(2, orderId);
				pst.executeUpdate();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return suffix+prefix;
	}

}
