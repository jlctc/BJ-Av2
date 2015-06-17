package plist.BO;

public class User {
    private String Name;
    private String Pass;
    private String Login;
    private int ID;
    private int Adm;

    public String getName() {
        return Name;
    }
    public int getID() {
        return ID;
    }
    public String getPass() {
        return Pass;
    }
    public String getLogin() {
        return Login;
    }
    public int getAdm() {
        return Adm;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    public void setLogin(String Login) {
        this.Login = Login;
    }
    public void setAdm(int Adm) {
        this.Adm = Adm;
    }
}
