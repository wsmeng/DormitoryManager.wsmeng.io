package com.wsm.DormitoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wsm.DormitoryManagement.RowMapper.LogBeanRowMapper;
import com.wsm.DormitoryManagement.bean.LogBean;
import com.wsm.DormitoryManagement.dao.LogDao;

public class LogDaoImpl extends JdbcDaoSupport implements LogDao {

	public int insert(final LogBean bean) {
		String sql = "insert into log_body values(log_body_seq.nextval, ?, ?, ?, ?)";
		return getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getStudentID());
				ps.setInt(2, bean.getTeacherID());
				ps.setDate(3, bean.getLogDate());
				ps.setString(4, bean.getLogContext());
				ps.execute();
			}
			
		});
	}

	public int delete(final LogBean args) {
		String sql = "delete from log_body where log_id = ?";
		return getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, args.getLogID());
				ps.execute();
			}
			
		});
	}

	public int change(LogBean bean) {
		throw new UnsupportedOperationException();
	}

	public List<LogBean> findAll() {
		String sql = "select * from log_body";
		return getJdbcTemplate().query(sql, new LogBeanRowMapper());
	}

}
