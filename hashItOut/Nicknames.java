package hashItOut;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("micheal", "mix");
        nicknames.put("arthur", "artie");

        System.out.println(nicknames.get("matthew"));

    }
}
