package com.nt.sbeans;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("comp")
@Data
@ConfigurationProperties(prefix="org.nit")
public class Company {
	private Integer id;
	private String name;
	private String addrs;
	private String mail;
	
	private String[] color;
	private Set<Long> phones;
	private Map<String,Long> idDetails;
	
	private Suppliers suppliers;

}
