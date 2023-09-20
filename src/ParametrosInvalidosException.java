public class ParametrosInvalidosException extends RuntimeException {

    private String menssage;

    public ParametrosInvalidosException(String menssage) {
        this.menssage = menssage;
    }

    public String geetMenssage() {
        return this.getMessage();
    }


}
