package com.wsm.DormitoryManagement.daoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wsm.DormitoryManagement.RowMapper.TBManageBeanRowMapper;
import com.wsm.DormitoryManagement.bean.TBManageBean;
import com.wsm.DormitoryManagement.dao.TBManageDao;

public class TBManageDaoImpl extends JdbcDaoSupport implements TBManageDao {

	public int insert(final TBManageBean bean) {
		String sql = "insert into tbmanage values(tbmanage_seq.nextval, ?, ?)";
		return getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getDormitoryID());
				ps.setInt(2, bean.getTeacherID());
				ps.execute();
			}
			
		});
	}

	public int delete(final TBManageBean args) {
		String sql = "delete from tbmanage where tbmanage_id = ?";
		return getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, args.getTBManageID());
				ps.execute();
			}
			
		});
	}

	public int change(final TBManageBean bean) {
		String sql = "update tbmanage set dormitory_id = ?, teacher_id = ? where tbmanage_id = ?";
		return getJdbcTemplate().update(sql, new PreparedStatementSetter(){

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, bean.getDormitoryID());
				ps.setInt(2, bean.getTeacherID());
				ps.setInt(3, bean.getTBManageID());
				ps.execute();
			}
		});
	}

	public List<TBManageBean> findAll() {
		String sql = "select * from tbmanage";
		return getJdbcTemplate().query(sql, new TBManageBeanRowMapper());
	}

}
