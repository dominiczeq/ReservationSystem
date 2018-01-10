package pl.coderslab.project.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.project.entity.Service;
import pl.coderslab.project.repository.ServiceRepository;

public class ServiceConverter implements Converter<String, Service>{
	
	@Autowired
	private ServiceRepository sr;
	
	public Service convert(String source) {
		long id = Long.parseLong(source);
		Service service = this.sr.findOne(id);
		
		return service;
	}

}
