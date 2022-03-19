package Var2.GetCRMTestTask;

class Place {
    private String name;
    private double value;
    private double timeToVisit;

    public Place(String name, double timeToVisit, int value) {
        this.name = name;
        this.value = value;
        this.timeToVisit = timeToVisit;
    }

    public double valuePerHours() {
        return value / timeToVisit;
    }

    public double getTimeToVisit() {
        return timeToVisit;
    }

    @Override
    public String toString() {
        return"Место: "+
                "'" + name + "\'" +
                ", Затраты времени на посещение: " + timeToVisit +
                ", Важность: " + value;
    }
}
