package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> aSpiceList = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return aSpiceList;
    }

    public Map<Class<? extends Spice>, Integer> getSpiceCount() {
        Map<Class<? extends Spice>, Integer> spicyMap = new HashMap<>();

        for (Spice thing : aSpiceList)
        {
            if (!spicyMap.containsKey(thing.getClass())) {
                spicyMap.put(thing.getClass(), 1);
            }else{
                spicyMap.put(thing.getClass(),spicyMap.get(thing.getClass()) +1);
            }

        }
        return spicyMap;
    }

    public void applySpice(Spice spice) {
        aSpiceList.add(spice);
    }
}
