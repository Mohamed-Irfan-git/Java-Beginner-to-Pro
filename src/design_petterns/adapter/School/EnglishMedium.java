package design_petterns.adapter.School;

public class EnglishMedium implements SchoolSystem {
    private final TamilMedium tamilMedium;

    public EnglishMedium() {
       tamilMedium = new TamilMedium();
    }

    @Override
    public void medium(String name, int age) {
        tamilMedium.studentMedium(name);

    }
}
