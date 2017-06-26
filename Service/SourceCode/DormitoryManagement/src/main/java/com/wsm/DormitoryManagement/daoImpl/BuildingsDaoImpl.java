package com.wsm.DormitoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wsm.DormitoryManagement.RowMapper.BuildingBeanRowMapper;
import com.wsm.DormitoryManagement.bean.BuildingsBean;
import com.wsm.DormitoryManagement.dao.BuildingsDao;

public class BuildingsDaoImpl extends JdbcDaoSupport implements BuildingsDao {

	public int insert(final BuildingsBean bean) {
		String sql = "insert into buildings values(buildings_seq.nextval, ?, ?)";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bean.getBuildingsName());
				ps.setString(2, bean.getBuildingsDesc());
				ps.execute();
			}
			
		});
		return result;
	}

	public int delete(final BuildingsBean bean) {
		String sql = "delete from buildings where buildings_id = ?";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getBuildingsId());
				ps.execute();
			}
		});
		return result;
	}

	public int change(final BuildingsBean bean) {
		String sql = "update buildings set buildings_name = ?, buildings_desc = ? where buildings_id = ?";
		int result = getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bean.getBuildingsName());
				ps.setString(2, bean.getBuildingsDesc());
				ps.setInt(3, bean.getBuildingsId());
				ps.execute();
			}
				
		});
		return result;
	}

	public List<BuildingsBean> findAll() {
		String sql = "select * from buildings";
		List<BuildingsBean> lists = getJdbcTemplate().query(sql, new BuildingBeanRowMapper());
		return lists;
	}

}
