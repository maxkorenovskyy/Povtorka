package ua.lviv.iot;

import ua.lviv.iot.enums.Season;
import ua.lviv.iot.enums.Sex;
import ua.lviv.iot.goods.Good;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BabyClothesStore {
    private String name;
    private String workingHours;
    private String location;
    private List<Good> goodList = new LinkedList<>();

    public BabyClothesStore(final String name, final String workingHours,
                            final String location) {
        setName(name);
        setWorkingHours(workingHours);
        setLocation(location);
    }

    @Override
    public final String toString() {
        return "BabyClothesStore{"
                + "name='" + getName() + '\''
                + ", workingHours='" + getWorkingHours()
                + '\'' + ", location=" + getLocation() + '\''
                + ", numberOfGoods='" + getNumberOfGoods()
                + '}';
    }

    public final List<Good> findBySeasonAndSex(final Season season,
                                               final Sex sex) {
        List<Good> result = new LinkedList<>();
        goodList.stream().filter(goodList -> ((goodList.getSex() == sex
                || goodList.getSex() == Sex.UNISEX)
                &&
                (goodList.getSeason() == season
                        || goodList.getSeason() == Season.DEMISEASON)))
                .forEachOrdered(result::add);
        return result;
    }

    public final void sortByPrice(final List<Good> list) {
        list.sort(Comparator.comparing(Good::getPrice).reversed());
    }

    public final void printList(final List<Good> list) {
        list.forEach((Good good) -> System.out.println(good.toString()));
    }

    public final void addGood(final Good good) {

        this.goodList.add(good);
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getWorkingHours() {
        return workingHours;
    }

    public final void setWorkingHours(final String workingHours) {
        this.workingHours = workingHours;
    }

    public final String getLocation() {
        return location;
    }

    public final void setLocation(final String location) {
        this.location = location;
    }

    public final int getNumberOfGoods() {
        return goodList.size();
    }

    public final List<Good> getGoodList() {
        return goodList;
    }

}
