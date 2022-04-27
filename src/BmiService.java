public class BmiService {
    public float calculate(int height, int weight) {

        float heightInMeters = (float) height / 100;
        float imt = weight / (float) Math.pow(heightInMeters, 2);
        ;
        return (imt);

    }
}
