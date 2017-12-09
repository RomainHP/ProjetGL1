package methods;

import java.util.ArrayList;
import java.util.List;

import prog.Traitement;

public class Tangente implements Traitement{
	
	List<Double> args = new ArrayList<>();

	@Override
	public double getResultat() {
		return Math.tan(Math.toRadians(args.get(0)));
	}

	@Override
	public void setArgs(List<Double> args) {
		for (double arg : args) {
			this.args.add(arg);
		}
	}

}
