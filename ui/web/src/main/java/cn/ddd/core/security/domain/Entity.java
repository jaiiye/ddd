package cn.ddd.core.security.domain;

import java.io.Serializable;

public class Entity implements Serializable {
	private Long id;

	private int version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}