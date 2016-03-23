package storage;

public class BagsTest {

//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Test
//    public void should_add_a_green_ball_to_the_bag() throws BagIsFullException, BallColorIsFullException {
//        Bag bag = new Bag(2);
//        bag.put(new Ball(BallColor.GREEN));
//        assertEquals(1, bag.size());
//    }

//    @Test
//    public void can_add_multiple_balls() throws BagIsFullException, BallColorIsFullException {
//        Bag bag = new Bag(4);
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.GREEN));
//        assertEquals(3, bag.size());
//    }
//
//    @Test
//    public void can_add_twelve_balls_only() throws BagIsFullException, BallColorIsFullException {
//        Bag bag = new Bag(12);
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.RED));
//        bag.put(new Ball(BallColor.RED));
//        bag.put(new Ball(BallColor.RED));
//        bag.put(new Ball(BallColor.RED));
//        bag.put(new Ball(BallColor.RED));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//
//        thrown.expect(BagIsFullException.class);
//        thrown.expectMessage("Bag is full");
//
//        bag.put(new Ball(BallColor.BLUE));
//    }
//
//    @Test
//    public void can_add_only_three_green_balls() throws BagIsFullException, BallColorIsFullException {
//        Bag bag = new Bag(5);
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.GREEN));
//
//        thrown.expect(BallColorIsFullException.class);
//        bag.put(new Ball(BallColor.GREEN));
//    }
//
//    @Test
//    public void can_add_blue_balls_as_many_as_possible() throws BagIsFullException, BallColorIsFullException {
//        Bag bag = new Bag(12);
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        bag.put(new Ball(BallColor.BLUE));
//        assertEquals(12, bag.size());
//    }
//
//    @Test
//    public void can_add_1_blue_ball_when_there_is_1_green_ball() throws BagIsFullException, BallColorIsFullException {
//        Bag bag = new Bag(3);
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.RED));
//        assertEquals(2, bag.size());
//    }
//
//    @Test
//    public void can_add_2_yellow_balls_when_there_are_5_other_color_balls() throws BagIsFullException, BallColorIsFullException {
//        Bag bag = new Bag(10);
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.GREEN));
//        bag.put(new Ball(BallColor.RED));
//        bag.put(new Ball(BallColor.RED));
//        bag.put(new Ball(BallColor.YELLOW));
//        bag.put(new Ball(BallColor.YELLOW));
//        assertEquals(7, bag.size());
//
//        thrown.expect(BallColorIsFullException.class);
//        bag.put(new Ball(BallColor.YELLOW));
//
//    }
}