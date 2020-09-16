package com.ejemplo.consume.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="roots")
public class Root{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRoot;
	
    public String type;
    
    @OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="metadata_id",unique=true)
    public Metadata metadata;
    
    @OneToMany(cascade= CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="root_id")
    public List<Sismo> features;
    
   

	public int getIdRoot() {
		return idRoot;
	}

	public void setIdRoot(int idRoot) {
		this.idRoot = idRoot;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public List<Sismo> getFeatures() {
		return features;
	}

	public void setFeatures(List<Sismo> features) {
		this.features = features;
	}
    
    
}