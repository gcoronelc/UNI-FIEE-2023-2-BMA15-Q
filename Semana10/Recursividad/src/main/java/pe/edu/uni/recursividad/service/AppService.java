package pe.edu.uni.recursividad.service;

public class AppService {
	
	public double potencia(double base, int expo){
		if(expo == 0){
			return 1;
		}
		return base * potencia(base, expo-1);
	}

}
