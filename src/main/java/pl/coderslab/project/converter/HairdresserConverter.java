package pl.coderslab.project.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.project.entity.Hairdresser;
import pl.coderslab.project.repository.HairdresserRepository;

public class HairdresserConverter implements Converter<String, Hairdresser> {
	@Autowired
	private HairdresserRepository hr;
	
	public Hairdresser convert(String source) {
		long id = Long.parseLong(source);
		Hairdresser hairdresser = this.hr.findOne(id);
		return hairdresser;
	}

}
