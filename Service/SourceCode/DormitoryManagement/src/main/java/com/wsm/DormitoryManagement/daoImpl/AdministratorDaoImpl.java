package com.wsm.DormitoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wsm.DormitoryManagement.RowMapper.AdministratorBeanRowMapper;
import com.wsm.DormitoryManagement.bean.AdministratorBean;
import com.wsm.DormitoryManagement.dao.AdministratorDao;

public class AdministratorDaoImpl extends JdbcDaoSupport implements AdministratorDao {

	public int insert(final AdministratorBean bean) {
		String sql = "insert into Administrator values(admin_seq.nextval, ?, ?, ?, ?, ?)";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bean.getAdminNo());
				ps.setString(2, bean.getAdminPassword());
				ps.setString(3, bean.getAdminName());
				ps.setInt(4, bean.getAdminSex());
				ps.setString(5, bean.getAdminTel());
				ps.execute();
			}
		});
		return result;
	}
	
	//删除指定的管理员
	public int delete(final AdministratorBean args) {
		String sql = "delete from administrator where admin_id = ?";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, args.getAdminId());
				ps.execute();
			}
			
		});
		return result;
	}

	public int change(final AdministratorBean bean) {
		String sql = "update administrator set admin_password = ?, admin_name = ?, admin_tel = ? where admin_id = ?";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bean.getAdminPassword());
				ps.setString(2, bean.getAdminName());
				ps.setString(3, bean.getAdminTel());
				ps.setInt(4, bean.getAdminId());
				ps.execute();
			}
				
		});
		return result;
	}

	public List<AdministratorBean> findAll() {
		String sql = "select * from administrator";
		List<AdministratorBean> lists  = getJdbcTemplate().query(sql, new AdministratorBeanRowMapper());
		return lists;
	}

	public List<AdministratorBean> findBySex(int sex) {
		String sql = "select * from administrator where admin_sex = ?";
		List<AdministratorBean> lists  = getJdbcTemplate().query(sql, new Object[]{sex}, new AdministratorBeanRowMapper());
		return lists;
	}

}
