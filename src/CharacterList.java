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
    public List<Character> getCharacters() {
        return characters;
    }

    public List<Character> addCharacter( Character character) {
        characters.add(character);
        return characters;
    }
}
