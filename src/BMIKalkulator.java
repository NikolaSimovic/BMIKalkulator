import java.text.DecimalFormat;


public class BMIKalkulator {
    
  
    
    public String vrednostBMI(double tezina, double visina) {
    	
    	double bmi = (tezina/(visina*visina));
    	DecimalFormat formater = new DecimalFormat("0.00");
    	;
    	String s = "";
    	
    	 if (bmi <= 15)
            s = "Tvoj BMI je  "+formater.format(bmi);
          if ((bmi > 15) && (bmi <= 18.5))
            s="Tvoj BMI je "+formater.format(bmi);
          if ((bmi > 18.5) && (bmi <= 25))
            s="Tvoj BMI je "+formater.format(bmi);
            if ((bmi > 25) && (bmi <= 40))
             s="Tvoj BMI je "+formater.format(bmi);
             if (bmi > 40)
            	 s="Tvoj BMI je "+formater.format(bmi);
    	
    	return s;
    }
    
}