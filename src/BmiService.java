public class BmiService {
    public int calculate(int weightBody, double height) {
        double bodyMassIndex = weightBody / (height * height);
        int result = (int) bodyMassIndex;
        return result;
    }
}
