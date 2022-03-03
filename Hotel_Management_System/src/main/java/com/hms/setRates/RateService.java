package com.hms.setRates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateService {

	@Autowired
	private RateRepository raterepo;

	public Rates setrates(Rates rates) {
		return raterepo.insert(rates);
	}

	public Rates updateRates(Rates rates, String id) {
		return raterepo.save(rates);
	}

	public List<Rates> getRates() {
		return raterepo.findAll();

	}

}
