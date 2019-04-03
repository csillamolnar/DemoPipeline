
public class MainPersonGenerator {

  

    public static void main(String[] args) {

        Person child =
                new Person.Builder("FirstPerson", AgeGroup.CHILD).withHairColor(HairColor.BLACK)
                        .withEyeColor(EyeColor.BLUE).build();


        System.out.println("Simple hello to try"+child.getEyeColor());






    }
}
