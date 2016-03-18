import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ChanceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void not_should_give_chance_of_not_occurring() throws InvalidProbabilityException {
        Chance actualChance = Chance.create(0.25).not();
        Chance expectedChance = Chance.create(0.75);
        assertEquals(expectedChance,actualChance);
    }

    @Test
    public void and_should_give_chance_of_the_product_of_two_chances() throws InvalidProbabilityException {
        Chance actualChance = Chance.create(0.25).and(Chance.create(0.25));
        Chance expectedChance = Chance.create(0.0625);
        assertEquals(expectedChance, actualChance);
    }

    @Test
    public void or_should_give_chance_of_the_sum_of_two_chances() throws InvalidProbabilityException {
        Chance actualChance = Chance.create(0.25).or(Chance.create(0.25));
        Chance expectedChance = Chance.create(0.5);
        assertEquals(expectedChance, actualChance);
    }

    @Test
    public void create_should_throw_InvalidProbabilityException_when_the_value_given_is_greater_than_one() throws InvalidProbabilityException {
        thrown.expect(InvalidProbabilityException.class);
        thrown.expectMessage("Probability value must be between 0 and 1");
        Chance.create(1.2);
    }

    @Test
    public void create_should_throw_InvalidProbabilityException_when_the_value_given_is_less_than_zero() throws InvalidProbabilityException {
        thrown.expect(InvalidProbabilityException.class);
        thrown.expectMessage("Probability value must be between 0 and 1");
        Chance.create(-1);
    }
}