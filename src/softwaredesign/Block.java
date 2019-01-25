package softwaredesign;


public class Block {
    
    private char letter;
    private String color;
        
        public Block(){
            letter = 'a';
            color = "blue";
            
    }

    Block(char c, String blue) {
        
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Letter: " + letter + " Color: " + color;
    }    
        
}
        
