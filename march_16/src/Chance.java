/*
    Job of Chance:
        - to calculate the chance,  given total space
 */
public class Chance {

    private double value;

    private Chance(double value) {
        this.value = value;
    }

    public Chance not() throws InvalidProbabilityException {
        return create(1 - value);
    }

    public static Chance create(double value) throws InvalidProbabilityException {
        if(value < 0 || value > 1)
            throw new InvalidProbabilityException();
        return new Chance(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance = (Chance) o;

        return Double.compare(chance.value, value) == 0;
    }

    public Chance and(Chance givenChance) throws InvalidProbabilityException {
        return create(givenChance.value * this.value);
    }

    public Chance or(Chance givenChance) throws InvalidProbabilityException {
        return create(givenChance.value + this.value);
    }
}
