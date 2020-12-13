package com.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {

	private JdbcTemplate jdbctemplate;

	/**
	 * @return the jdbctemplate
	 */
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	/**
	 * @param jdbctemplate the jdbctemplate to set
	 */
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public int SaveEmployee(Employee e)
	{
		String sql="insert into employee1 values("+e.getEid()+",'"+e.getEname()+"','"+e.getEaddres()+"')";
		return jdbctemplate.update(sql);
	}
	
	public List <Employee> getallEmployee()
	{
		String sql="select * from employee1";
		return jdbctemplate.query(sql, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int arg1)
					throws SQLException {
				// TODO Auto-generated method stub
				
				Employee e1=new Employee();
				e1.setEid(rs.getInt(1));
				e1.setEname(rs.getString(2));
				e1.setEaddres(rs.getString(3));
				
				return e1;
			}
			
			
				});
	}
	public int deleteEmployee(Employee e)
	{
		String sql=("delete * from employee1 where eid="+e.getEid()+"");
		return jdbctemplate.update(sql);
		
	}
}
