package com.ejemplo.consume.entity;

//import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="geometrys")
public class Geometry //implements Serializable
{
 
	//private static final long serialVersionUID = 3783781491312267446L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idGeometry;
	private String type;
	
	@ElementCollection
    @CollectionTable(name = "geometry_coordinates")
	private List<Double> coordinates;
	
	

	public int getIdGeometry() {
		return idGeometry;
	}

	public void setIdGeometry(int idGeometry) {
		this.idGeometry = idGeometry;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Double> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}

	
}