/**
 *
 * @author Majus
 */
public class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private String user;
    private String rol;
    private String password;
    
    public Usuario(){
       
    }
    
    public Usuario(String id, String nombre, String apellido, String user, String rol, String password){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.rol = rol;
        this.password = password;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return "Id: " + this.id + " Nombre: " + this.nombre + " Apellido: " + this.apellido + " User: " + this.user + " Rol: " + this.rol + " Password: " + this.password;
    }
    
}
