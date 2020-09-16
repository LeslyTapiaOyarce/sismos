package com.ejemplo.consume.controller;


import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ejemplo.consume.entity.Root;
import com.ejemplo.consume.service.RootService;

@ComponentScan("com.ejemplo.consume.config")
@RestController
public class ConsumeController {
	
	@Autowired
	RestTemplate rt;
	
	@Autowired
	RootService rr;
	
	@GetMapping(value="/getSismosFeciniFecfin/{fecini}/{fecfin}")
	public Root getSismosFeciniFecfin(@PathVariable String fecini,@PathVariable String fecfin) throws Exception {
		ResponseEntity <Root> respEnt;
		try {
			String url="https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime="+fecini+"&endtime="+fecfin;
			
			 respEnt= rt.exchange(url,HttpMethod.GET,null,Root.class);
			
			
			//System.out.println(respEnt.getBody());
			return respEnt.getBody();
		}catch(Exception e) {
			System.out.println( e.getMessage().toString());
			return null;
		}
		
	}
	
	
	
	@GetMapping(value="/getSismosMagminMagmax/{min}/{max}")
	public Root getSismosMagminMagmax(@PathVariable Double min ,@PathVariable Double max ) throws Exception {
		try {
			String url="https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude="+min.toString()+"&maxmagnitude="+max.toString();
			
			ResponseEntity <Root> respEnt= rt.exchange(url,HttpMethod.GET,null,Root.class);
			
			//System.out.println(respEnt.getBody());
			return respEnt.getBody();		
		}catch(Exception e) {
			System.out.println( e.getMessage().toString());
			return null;
		}
	}
	
	@GetMapping(value="/getSismosHoy")
	public String getSismosHoy() throws Exception {
		try {
		LocalDate hoy=LocalDate.now();	
		LocalDate hoyMasUno = LocalDate.now().plusDays(1); 
		
		String hoy2=String.valueOf(hoy.getYear()) +"-"+String.valueOf(hoy.getMonthValue())+"-"+String.valueOf(hoy.getDayOfMonth());
		String hoyMasUno2=String.valueOf(hoyMasUno.getYear()) +"-"+String.valueOf(hoyMasUno.getMonthValue())+"-"+String.valueOf(hoyMasUno.getDayOfMonth());
		
		System.out.println(hoy2);
	    
		String url="https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime="+hoy2+"&endtime="+hoyMasUno2;
		
		ResponseEntity <Root> respEnt= rt.exchange(url,HttpMethod.GET,null,Root.class);
		if (respEnt.getBody().getFeatures().isEmpty()) {
			return "No se encontraron datos";
		}else {
			rr.save(respEnt.getBody());
			return "Se insertaron : "+String.valueOf(respEnt.getBody().getFeatures().size())+" datos.";
		}
		
		//System.out.println(respEntstr.getBody());
		}catch(Exception e) {
			System.out.println( e.getMessage().toString());
			return e.getMessage().toString();
			
		}
		
		
	}

}
