package com.wsm.DormitoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wsm.DormitoryManagement.RowMapper.OutRecodeBeanRowMapper;
import com.wsm.DormitoryManagement.bean.OutRecodeBean;
import com.wsm.DormitoryManagement.dao.OutRecodeDao;

public class OutRecodeDaoImpl extends JdbcDaoSupport implements OutRecodeDao {

	public int insert(final OutRecodeBean bean) {
		String sql = "insert into outrecode values(outrecode_seq.nextval, ?, ?, ?)";
		return getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getStudentID());
				ps.setDate(2, bean.getOutRecodeDate());
				ps.setString(3, bean.getOutRecodeContext());
				ps.execute();
			}
			
		});
	}

	public int delete(OutRecodeBean args) {
		throw new UnsupportedOperationException();
	}

	public int change(OutRecodeBean bean) {
		throw new UnsupportedOperationException();
	}

	public List<OutRecodeBean> findAll() {
		String sql = "select * from outrecode";
		return getJdbcTemplate().query(sql, new OutRecodeBeanRowMapper());
	}

	public List<OutRecodeBean> findByStudentID(int StudentID) {
		String sql = "select * from outrecode where student_id = ?";
		return getJdbcTemplate().query(sql, new Object[]{StudentID}, new OutRecodeBeanRowMapper());
	}

}
