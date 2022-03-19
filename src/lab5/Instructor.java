package lab5;

public class Instructor {

    // TODO: implement this class
    private String name;
    private int phoneExt;
    private String email;

    public Instructor(String name, int phoneExt, String email){
        this.name = name;
        this.phoneExt = phoneExt;
        this.email = email;


    }
    public String getName() {
        return this.name;
    }

    public int getPhoneExtension() {
        return this.phoneExt;
    }

    public String getEmail() {
        return this.email;
    }

    public String getInformation() {
        return "Instructor " + this.name + " has campus phone extension " + this.phoneExt + " and contact email " + this.email;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPhoneExtension(int newphoneExt) {
        this.phoneExt = newphoneExt;
    }

    public void setEmail(String newemail) {
        this.email = newemail;
    }

}
