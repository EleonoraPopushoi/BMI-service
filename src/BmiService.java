public class BmiService {
    public double calculate(double weight,double height){
        double bmi = weight / height / height * 10000 ;

        return bmi;
    }
}
