public class Professor extends Usuarios {

    private String Professor;


    @Override
    public void getIdentificacao(String professor){
        System.out.println(this.getProfessor());
    }


    public String getProfessor() {
        return Professor;
    }


    public void setProfessor(String professor) {
        Professor = professor;
    }


}
    
