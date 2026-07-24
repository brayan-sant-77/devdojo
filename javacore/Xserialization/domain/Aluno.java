package academy.devdojo.javacore.Xserialization.domain;


import java.io.*;

// quando serializamos um objeto, nós precisamos informar o Java que o objeto é serializável
// fazemos isso implementando a interface Serializable
public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -3730340447983871470L; // esse código define um meio que um id, informando que podemos desserializar
    private int id;
    private String name;
    private transient String password; // o transient significa que esse atributo não deve ser serializado
    private static final String NAME_ESCOLA = "DevDojo";
    private transient Turma turma;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno(int id, String name, String password) {
        System.out.println("dentro do construtor");
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeUTF(turma.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            String name = objectInputStream.readUTF() ;
            turma = new Turma(name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", NAME_ESCOLA='" + NAME_ESCOLA +
                ", Turma='" + turma +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
