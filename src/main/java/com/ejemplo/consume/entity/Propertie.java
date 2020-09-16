package com.ejemplo.consume.entity;

//import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="properties")
public class Propertie //implements Serializable
{
    
	//private static final long serialVersionUID = -3942301109851918710L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPropetie;
	private Double mag;
	private String place;
    private long time;
    private long updated;
    private int tz;
    private String url;
    private String detail;
    private String felt;
    private String cdi;
    private String mmi;
    private String alert;
    private String status;
    private int tsunami;
    private int sig;
    private String net;
    private String code;
    private String ids;
    private String sources;
    private String types;
    private int nst;
	private Double dmin;
    private Double rms;
    private int gap;
    private String magType;
    private String type;
    private String title;
    
  
	public int getIdPropetie() {
		return idPropetie;
	}
	public void setIdPropetie(int idPropetie) {
		this.idPropetie = idPropetie;
	}
	public Double getMag() {
		return mag;
	}
	public void setMag(Double mag) {
		this.mag = mag;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public long getUpdated() {
		return updated;
	}
	public void setUpdated(long updated) {
		this.updated = updated;
	}
	public int getTz() {
		return tz;
	}
	public void setTz(int tz) {
		this.tz = tz;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getFelt() {
		return felt;
	}
	public void setFelt(String felt) {
		this.felt = felt;
	}
	public String getCdi() {
		return cdi;
	}
	public void setCdi(String cdi) {
		this.cdi = cdi;
	}
	public String getMmi() {
		return mmi;
	}
	public void setMmi(String mmi) {
		this.mmi = mmi;
	}
	public String getAlert() {
		return alert;
	}
	public void setAlert(String alert) {
		this.alert = alert;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTsunami() {
		return tsunami;
	}
	public void setTsunami(int tsunami) {
		this.tsunami = tsunami;
	}
	public int getSig() {
		return sig;
	}
	public void setSig(int sig) {
		this.sig = sig;
	}
	public String getNet() {
		return net;
	}
	public void setNet(String net) {
		this.net = net;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getSources() {
		return sources;
	}
	public void setSources(String sources) {
		this.sources = sources;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public int getNst() {
		return nst;
	}
	public void setNst(int nst) {
		this.nst = nst;
	}
	public Double getDmin() {
		return dmin;
	}
	public void setDmin(Double dmin) {
		this.dmin = dmin;
	}
	public Double getRms() {
		return rms;
	}
	public void setRms(Double rms) {
		this.rms = rms;
	}
	public int getGap() {
		return gap;
	}
	public void setGap(int gap) {
		this.gap = gap;
	}
	public String getMagType() {
		return magType;
	}
	public void setMagType(String magType) {
		this.magType = magType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
