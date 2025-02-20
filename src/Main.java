public class Main {
    public static void main(String[] args) {
        // Test CharacterList
        Character c1 = new Character(
                1,
                "Jim Henson",
                "Rogue",
                "Gnome",
                12,
                13,
                14
        );
        Character c2 = new Character(
                2,
                "Darth Vader",
                "Wizard",
                "Half-Giant",
                15,
                15,
                15
        );
        Character c3 = new Character(
                3,
                "Frodo Baggins",
                "Rogue",
                "Halfling",
                11,
                18,
                12
        );

        // 2 Make these user entered
        CharacterList list = new CharacterList();
        list.addCharacter(c1);
        list.addCharacter(c2);
        list.addCharacter(c3);

        System.out.println(list.getCharactersString());

        c3.setName("Samwise Gamji");

        System.out.println(list.getCharactersString());



        // Test Character
        /*
        Character c1 = new Character(
                1,
                "Jim Henson",
                "Rogue",
                "Gnome",
                12,
                13,
                14
        );
        
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getClassification());
        System.out.println(c1.getStr());
        System.out.println(c1.getDex());
        System.out.println(c1.getCon());

        c1.setId(2);
        c1.setName("John Smith");
        c1.setClassification("Dwarf");
        c1.setStr(19);
        c1.setDex(18);
        c1.setCon(17);

        System.out.println();
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getClassification());
        System.out.println(c1.getStr());
        System.out.println(c1.getDex());
        System.out.println(c1.getCon());
         */
    }
}