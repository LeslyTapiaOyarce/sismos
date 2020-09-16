package com.ejemplo.consume.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sismos")
public class Sismo implements Serializable{
	
	private static final long serialVersionUID = 7022106456337991762L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int idSismo;
		private String type;
		
		@OneToOne(cascade= CascadeType.ALL)
		@JoinColumn(name="properties_id",unique=true)
		private Propertie properties;
		
		@OneToOne(cascade= CascadeType.ALL)
		@JoinColumn(name="geometry_id",unique=true)
		private Geometry geometry;
		
		@Column(unique=true)
		private String id;
		
		
		
	
		public int getIdSismo() {
			return idSismo;
		}

		public void setIdSismo(int idSismo) {
			this.idSismo = idSismo;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Propertie getProperties() {
			return properties;
		}

		public void setProperties(Propertie properties) {
			this.properties = properties;
		}

		public Geometry getGeometry() {
			return geometry;
		}

		public void setGeometry(Geometry geometry) {
			this.geometry = geometry;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
		 

}
