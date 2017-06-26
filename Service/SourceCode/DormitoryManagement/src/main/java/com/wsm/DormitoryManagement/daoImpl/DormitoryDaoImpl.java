package com.wsm.DormitoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wsm.DormitoryManagement.RowMapper.DormitoryBeanRowMapper;
import com.wsm.DormitoryManagement.bean.DormitoryBean;
import com.wsm.DormitoryManagement.dao.DormitoryDao;

public class DormitoryDaoImpl extends JdbcDaoSupport implements DormitoryDao {

	public int insert(final DormitoryBean bean) {
		String sql = "insert into Dormitory values(Dormitory_seq.nextval, ?, ?, ?, ?, ?)";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getBuildingsID());
				ps.setString(2, bean.getDormitoryName());
				ps.setInt(3, bean.getDormitoryType());
				ps.setInt(4, bean.getDormitoryNo());
				ps.setString(5, bean.getDormitoryTel());
				ps.execute();
			}
		});
		return result;
	}

	public int delete(final DormitoryBean bean) {
		String sql = "delete from dormitory where dormitory_id = ?";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getDormitoryID());
				ps.execute();
			}
		});
		return result;
	}

	public int change(final DormitoryBean bean) {
		String sql = "update dormitory set dormitory_name = ?, domitory_tel = ? where dormitory_id = ?";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bean.getDormitoryName());
				ps.setString(2, bean.getDormitoryTel());
				ps.setInt(3, bean.getDormitoryID());
				ps.execute();
			}
		});
		return result;
	}

	public List<DormitoryBean> findAll() {
		String sql = "select * from dormitory";
		List<DormitoryBean> lists = getJdbcTemplate().query(sql, new DormitoryBeanRowMapper());
		return lists;
	}

	public List<DormitoryBean> findAll(int BuildingsID){
		String sql = "select * from dormitory where buildings_id = ?";
		List<DormitoryBean> lists = getJdbcTemplate().query(sql, 
				new Object[]{BuildingsID}, new DormitoryBeanRowMapper());
		return lists;
	}
	
}
