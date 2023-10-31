package pe.edu.uni.proyectodemo.control;

import pe.edu.uni.proyectodemo.service.MateService;

public class MateController {

	public long factorial(int n) {
		return MateService.factorial(n);
	}

}
