package com.wsm.DormitoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wsm.DormitoryManagement.RowMapper.StudentBeanRowMapper;
import com.wsm.DormitoryManagement.bean.StudentBean;
import com.wsm.DormitoryManagement.dao.StudentDao;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

	public int insert(final StudentBean bean) {
		String sql = "insert into student values(student_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getDormitoryID());
				ps.setString(2, bean.getStudentNo());
				ps.setString(3, bean.getStudentPassword());
				ps.setString(4, bean.getStudentName());
				ps.setInt(5, bean.getStudentSex());
				ps.setInt(6, bean.getStudentState());
				ps.setString(7, bean.getStudentClass());
				ps.execute();
			}
			
		});
		return result;
	}

	public int delete(final StudentBean bean) {
		String sql = "delete from student where student_id = ?";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getStudentID());
				ps.execute();
			}
			
		});
		return result;
	}

	public int change(final StudentBean bean) {
		String sql = "update student set dormitory_id = ?, student_password = ?, student_state = ? where student_id = ?";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getDormitoryID());
				ps.setString(2, bean.getStudentPassword());
				ps.setInt(3, bean.getStudentState());
				ps.setInt(4, bean.getStudentID());
				ps.execute();
			}
			
		});
		return result;
	}

	public List<StudentBean> findAll() {
		String sql = "select * from student";
		return getJdbcTemplate().query(sql, new StudentBeanRowMapper());
	}

	public String findPassword(String StudentNo) {
		String sql = "select student_password from student where student_no = ?";
		return getJdbcTemplate().queryForObject(sql, new Object[]{StudentNo}, String.class);
	}

	public List<StudentBean> findByDormitory(int DormitoryNo) {
		String sql = "select * from student where dormitory_id = ?";
		return getJdbcTemplate().query(sql, new Object[]{DormitoryNo}, new StudentBeanRowMapper());
	}

}
