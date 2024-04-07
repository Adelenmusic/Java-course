package Collections;

import java.util.ArrayList;

public class ArrCreate {
    public static void main(String[] args) {

        ArrayList<String> pass = new ArrayList<>();
        pass.add("Ivanov");
        pass.add("Petrov");
        pass.add("Sidorov");
        pass.add("Stepanov");
        pass.add("Aleshina");
        pass.add(1,"Sergeeva");

        String secondPass = pass.get(1);

        System.out.println(secondPass);

        pass.set(1,"Sergeeva");

        System.out.println(pass);

        pass.remove(0);

        System.out.println(pass);

        ArrayList<String> pass2 = new ArrayList<>();
        pass2.addAll(pass);

        System.out.println(pass2);
    }
}
