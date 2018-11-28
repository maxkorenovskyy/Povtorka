package ua.lviv.iot;

import ua.lviv.iot.enums.Season;
import ua.lviv.iot.enums.Sex;
import ua.lviv.iot.enums.Size;
import ua.lviv.iot.goods.*;

import java.util.List;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) {
        BabyClothesStore myStore = new BabyClothesStore("Antoshka",
                "10:00 - 22:00", "Naukova str. 35A");

        myStore.addGood(new Hat("Hat 1", Sex.MALE, Season.SPRING,
                57.0, "Chicco", Size.S));
        myStore.addGood(new Hat("Hat 2", Sex.FEMALE, Season.AUTUMN,
                88.0, "Boy & Girl", Size.XS));
        myStore.addGood(new Hat("Hat 3", Sex.UNISEX, Season.DEMISEASON,
                71.0, "C & A", Size.M));
        myStore.addGood(new Gloves("Gloves 1", Sex.UNISEX, Season.WINTER,
                32.0, "Anika", Size.L));
        myStore.addGood(new Gloves("Gloves 2", Sex.MALE, Season.WINTER,
                41.0, "5.10.15", Size.M));
        myStore.addGood(new Gloves("Gloves 3", Sex.UNISEX, Season.AUTUMN,
                44.0, "Beezy", Size.S));
        myStore.addGood(new Socks("Socks 1", Sex.UNISEX, Season.SUMMER,
                20.0, "DUNA", 28));
        myStore.addGood(new Socks("Socks 2", Sex.FEMALE, Season.DEMISEASON,
                23.0, "YO!", 24));
        myStore.addGood(new Socks("Socks 3", Sex.MALE, Season.WINTER,
                31.0, "H&M", 31));
        myStore.addGood(new Tights("Tights 1", Sex.FEMALE, Season.SPRING,
                56.0, "5.10.15", 27));
        myStore.addGood(new Tights("Tights 2", Sex.UNISEX, Season.AUTUMN,
                49.0, "Chicco", 30));
        myStore.addGood(new Tights("Tights 3", Sex.UNISEX, Season.WINTER,
                60.0, "YO!", 32));


        System.out.println("\nAll available repairs:");
        myStore.printList(myStore.getGoodList());

        System.out.println("\nSearched by material type:");
        List<Good> result = myStore.findBySeasonAndSex(Season.AUTUMN,
                Sex.FEMALE);
        for (Good good : result) {
            System.out.println(good);
        }

        System.out.println("\nSorted by price:");
        myStore.sortByPrice(result);
        for (Good good : result) {
            System.out.println(good);
        }
    }
}
