package excercise;

public class Persona {
    private String document;
    private String name;
    private String country;
    
    //Sin parametros
    public Persona(){
        
    }
    
    public Persona(String name, String document, String country){
        this.name = name;
        this.document = document;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
    
}