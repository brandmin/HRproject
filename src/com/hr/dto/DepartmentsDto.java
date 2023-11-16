package com.hr.dto;

public class DepartmentsDto {
	private Integer department_id;
	private Integer location_id;
	private String department_name;
	private Integer manager_id;
	
	public DepartmentsDto() {}

	public DepartmentsDto(Integer department_id, Integer location_id, String department_name, Integer manager_id) {
		super();
		this.department_id = department_id;
		this.location_id = location_id;
		this.department_name = department_name;
		this.manager_id = manager_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department_id == null) ? 0 : department_id.hashCode());
		result = prime * result + ((department_name == null) ? 0 : department_name.hashCode());
		result = prime * result + ((location_id == null) ? 0 : location_id.hashCode());
		result = prime * result + ((manager_id == null) ? 0 : manager_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentsDto other = (DepartmentsDto) obj;
		if (department_id == null) {
			if (other.department_id != null)
				return false;
		} else if (!department_id.equals(other.department_id))
			return false;
		if (department_name == null) {
			if (other.department_name != null)
				return false;
		} else if (!department_name.equals(other.department_name))
			return false;
		if (location_id == null) {
			if (other.location_id != null)
				return false;
		} else if (!location_id.equals(other.location_id))
			return false;
		if (manager_id == null) {
			if (other.manager_id != null)
				return false;
		} else if (!manager_id.equals(other.manager_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DepartmentsDto [department_id=" + department_id + ", location_id=" + location_id + ", department_name="
				+ department_name + ", manager_id=" + manager_id + "]";
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Integer getManager_id() {
		return manager_id;
	}

	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}
	
	
}
