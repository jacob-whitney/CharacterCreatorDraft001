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
    /*public List<Character> getCharacters() {

        Character character = this.getCharacter(0);
        return characters;
    }*/

    public Character getCharacter(int index) {
        if (!characters.isEmpty() && index >= 0 && index < characters.size()) {
            return characters.get(index);
        } else {
            System.out.println("This list is empty");
            return null;
        }
    }

    public int getSize() {
        return characters.size();
    }

    public List<Character> addCharacter( Character character) {
        characters.add(character);
        return characters;
    }
}
