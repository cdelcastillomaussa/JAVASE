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



        /**
         * Descripcion general de este constructor
         * @autor Carlos Alberto Del Castillo Maussa <maussac13@gmail.com>
         * @param id Descripcion: identificacion del doctor
         * @param  name Descripcion: nombre del doctor
         * @param especiality Descripcion: especialidad del doctor
         * @param email Descipcion: correo del doctor
         * @return Descipcion: Este es otro método constructor de la clase Doctor solo que
         * esta parametrizado
         * */
        public Doctor(int id, String name, String especiality, String email){
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
