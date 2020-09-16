package com.ejemplo.consume.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="metadatas")
public class Metadata{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMeta;
	
    public long generated;
    public String url;
    public String title;
    public int status;
    public String api;
    public int count;
    
    
	
	public int getIdMeta() {
		return idMeta;
	}
	public void setIdMeta(int idMeta) {
		this.idMeta = idMeta;
	}
	public long getGenerated() {
		return generated;
	}
	public void setGenerated(long generated) {
		this.generated = generated;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
    
    
}
