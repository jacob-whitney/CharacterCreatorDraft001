import java.util.ArrayList;
import java.util.List;

public class CharacterList {
    // Attributes
    private List<Character> characters;

    //Constructors
    public CharacterList(List<Character> characters) {
        this.characters = new ArrayList<>(characters);
    }

    public CharacterList() {
        this.characters = new ArrayList<>();
    }

    // Methods
    public Character getCharacter(int index) {
        if (!characters.isEmpty() && index >= 0 && index < characters.size()) {
            return characters.get(index);
        } else {
            System.out.println("This list is empty");
            return null;
        }
    }

    public String getCharactersString() {
        if (!characters.isEmpty()) {
            String charList = "";
            for (int i = 0; i < characters.size(); i++) {
                Character c = characters.get(i);
                charList = charList + c.getId()             + "  |  ";
                charList = charList + c.getName()           + "  |  ";
                charList = charList + c.getClassification() + "  |  ";
                charList = charList + c.getStr()            + "  |  ";
                charList = charList + c.getDex()            + "  |  ";
                charList = charList + c.getCon()            + "\n";
            }
            return charList;
        } else {
            return "List is empty";
        }
    }

    public List<Character> addCharacter( Character character) {
        characters.add(character);
        return characters;
    }
}
