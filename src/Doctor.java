public class Doctor {
    private int id;
    private String name;
    private String especiality;
    private String email;


    public Doctor(){
            this.id = id;
            this.name = name;
            this.especiality = especiality;
            this.email = email;
        }

        public void setId(int identificacion){
        this.id = identificacion;
        }
        public int getId(){
        return id;
        }

    public void setName(String nombre) {
        this.name = nombre;
    }
    public String getName(){
        return name;
    }

    public void setEspeciality(String especializacion) {
        this.especiality = especializacion;
    }
    public String getEspeciality(){
        return especiality;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

}
