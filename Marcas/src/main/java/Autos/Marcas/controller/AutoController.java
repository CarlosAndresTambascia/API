package Autos.Marcas.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import Autos.Marcas.converter.AutoConverter;
import Autos.Marcas.entities.Auto;
import Autos.Marcas.entities.Marca;
import Autos.Marcas.request.AutoRequest;
import Autos.Marcas.request.MarcaRequest;
import Autos.Marcas.response.AutoWrapper;
import Autos.Marcas.services.AutoService;
import Autos.Marcas.services.MarcaService;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)

public class AutoController {

	@Autowired
	AutoService autoService;
	@Autowired
	AutoConverter converter;
	@Autowired
	MarcaService marcaService;

	@RequestMapping("/{id}")
	public @ResponseBody ResponseEntity<AutoWrapper> getById(@PathVariable("id") int id) {
		Auto a = autoService.getAuto(id);
		if (a != null) {
			AutoWrapper wp = converter.convert(a);
			return new ResponseEntity<AutoWrapper>(wp, HttpStatus.OK);
		} else {
			return new ResponseEntity<AutoWrapper>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping("/")
	public @ResponseBody ResponseEntity<List<AutoWrapper>> getAll() {
		List<Auto> list = (List<Auto>) autoService.getAll();
		if (list.size() > 0) {
			return new ResponseEntity<List<AutoWrapper>>(this.convertList(list), HttpStatus.OK);
		} else {
			return new ResponseEntity<List<AutoWrapper>>(HttpStatus.NO_CONTENT);
		}
	}

	@RequestMapping(value = "/auto", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addAuto(@RequestBody AutoRequest request, @RequestBody MarcaRequest mrequest) {
		try {
			autoService.newAuto(marcaService.newMarca(mrequest.getDescripcion()),request.getModelo(), request.getKms(), request.getPatente(),
					request.getAnio());
			return new ResponseEntity(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/byMarca", method = RequestMethod.GET)
	public ResponseEntity<List<AutoWrapper>> getByMarca(@RequestParam("marca") Marca marca) {
		List<Auto> list = autoService.getByMarca(marca);
		if (list.size() > 0) {
			return new ResponseEntity<List<AutoWrapper>>(this.convertList(list), HttpStatus.OK);
		} else {
			return new ResponseEntity<List<AutoWrapper>>(HttpStatus.NO_CONTENT);
		}
	}

	private List<AutoWrapper> convertList(List<Auto> autos) {
		List<AutoWrapper> awList = new ArrayList<AutoWrapper>();
		for (Auto a : autos) {
			awList.add(converter.convert(a));
		}
		return awList;
	}
}
