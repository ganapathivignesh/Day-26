package com.src;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {

	JdbcTemplate jdbctemplate;

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
	
	public int SaveEmp(Employee e)
	{
		String query="insert into employee1 values("+e.getEid()+",'"+e.getEname()+"'"+",'"+e.getEaddres()+"')";
		return jdbctemplate.update(query);
	}
	
	public void updateEmp(Employee employee) {
			  String sqlQuery = "update employee1 set " + 
			                    " ename = ?, eaddres = ? " +
			                    "where eid = ?";
			  jdbctemplate.update(sqlQuery, employee.getEname(), employee.getEaddres(),employee.getEid());
	}
	 public boolean DeleteEmp(int eid) {
	        String sqlQuery = "delete from employee1 where eid = ?";
	        return jdbctemplate.update(sqlQuery, eid) > 0;
	      }
}
