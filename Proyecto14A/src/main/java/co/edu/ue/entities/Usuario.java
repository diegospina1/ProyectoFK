package co.edu.ue.entities;


public class Usuario {
   
    private int userId;
    private String names;
    private String lastNames;
    private String document;
    private String email;
    private String password;
    
    //2. Constructor (inicializar)

    public Usuario(String names, String lastNames, String document, String email, String password) {
        this.userId = userId;
        this.names = names;
        this.lastNames = lastNames;
        this.document = document;
        this.email = email;
        this.password = password;
    }

    //3. Métodos de acceso (Getter and Setter)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    //4. toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("userId=").append(userId);
        sb.append(", names=").append(names);
        sb.append(", lastNames=").append(lastNames);
        sb.append(", document=").append(document);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
