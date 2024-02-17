package model;

/*Déclaration des mise à jour
History:
        1.0 : 17/02/2024
            déclaration des méthodes :
                *User : Le constructeur par défaut du Personnage
                *User(string username, string email, string password) : constructeur 1
                *Presentation : Affiche les info User
*/

public class User {
    protected String username;
    protected String email;
    protected String password;


    /*
    Déclaration des contructeurs
     */
    public User(){}

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    /*
    Déclaration des getters et setters
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}