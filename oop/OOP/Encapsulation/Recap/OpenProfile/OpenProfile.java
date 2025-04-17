package OpenProfile;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class OpenProfile {

    private Map<String, List<String>> profileInfo;

    public OpenProfile() {
        this.profileInfo = populateMap();

    }

    private Map<String, List<String>> populateMap() {
        this.profileInfo = Map.of(
                "Zlati@gmail.com", Arrays.asList("Zlati Rachev", "7 photos")
                ,"Gosho@abv.bg", Arrays.asList("Gosho Ivanov", "15 photos")
                ,"Pesho@hotmail.com", Arrays.asList("Pesho Iliev", "2 photos")
        );
        return this.profileInfo;
    }

    public List<String> getInfo(String username) {

        return this.profileInfo.get(username);
    }

}


