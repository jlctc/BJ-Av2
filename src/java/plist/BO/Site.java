package plist.BO;

public class Site {
    private String Nome;
    private String LIMG;
    private String Link;
    private int Stars;
    private String Tipo;

    public String getNome() {
        return Nome;
    }
    public int getStars() {
        return Stars;
    }
    public String getLIMG() {
        return LIMG;
    }
    public String getLink() {
        return Link;
    }
    public String getTipo() {
        return Tipo;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public void setStars(int Stars) {
        this.Stars = Stars;
    }
    public void setLIMG(String LIMG) {
        this.LIMG = LIMG;
    }
    public void setLink(String Link) {
        this.Link = Link;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setID(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPass(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLog(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAdm(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
