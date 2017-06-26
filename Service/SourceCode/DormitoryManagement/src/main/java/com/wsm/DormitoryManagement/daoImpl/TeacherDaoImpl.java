package com.wsm.DormitoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wsm.DormitoryManagement.RowMapper.TeacherBeanRowMapper;
import com.wsm.DormitoryManagement.bean.TeacherBean;
import com.wsm.DormitoryManagement.dao.TeacherDao;

public class TeacherDaoImpl extends JdbcDaoSupport implements TeacherDao {

	public int insert(final TeacherBean bean) {
		String sql = "insert into teacher(teacher_seq.nextval, ?, ?, ?, ?, ?)";
		return getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bean.getTeacherName());
				ps.setString(2, bean.getTeacherPassword());
				ps.setString(3, bean.getTeacherNo());
				ps.setInt(4, bean.getTeacherSex());
				ps.setString(5, bean.getTeacherTel());
				ps.execute();
			}
			
		});
	}

	public int delete(final TeacherBean bean) {
		String sql = "delete from teacher where teacher_id = ?";
		return getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getTeacherID());
				ps.execute();
			}
		
		});
	}

	public int change(final TeacherBean bean) {
		String sql = "update teacher set teacher_password = ?, teacher_tel = ? where teacher_id = ?";
		return getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bean.getTeacherPassword());
				ps.setString(2, bean.getTeacherTel());
				ps.setInt(3, bean.getTeacherID());
				ps.execute();
			}
			
		});
	}

	public List<TeacherBean> findAll() {
		String sql = "select * from teacher";
		return getJdbcTemplate().query(sql, new TeacherBeanRowMapper());
	}

}
