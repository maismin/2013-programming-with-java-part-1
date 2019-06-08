public class Reformatory {
    private int numTimesWeightMeasured = 0;

    public int weight(Person person) {
        // return the weight of the person
        numTimesWeightMeasured += 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured() {
        return numTimesWeightMeasured;
    }

}
