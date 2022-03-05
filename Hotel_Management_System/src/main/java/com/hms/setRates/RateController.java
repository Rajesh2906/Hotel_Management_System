package com.hms.setRates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/manager")
public class RateController {
	@Autowired
	RateService rateservice;

	// @RequestMapping(value = "/setrate", method = RequestMethod.POST)
	public void setRates(@RequestBody Rates rate) {
		rateservice.setrates(rate);
	}

	// @RequestMapping("/getrates")
	public List<Rates> getRates() {
		return rateservice.getRates();
	}

	// @RequestMapping(value = "/updaterates/{Id}", method = RequestMethod.PUT)
	public void updateRates(Rates rates, @PathVariable("Id") String id) {
		rateservice.updateRates(rates, id);
	}

}
