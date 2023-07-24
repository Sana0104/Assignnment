package OOPSAssignment;


abstract class Persistence {
    public abstract void persist();
}

class FilePersistence extends Persistence {
    @Override
    public void persist() {
        System.out.println("Data is being saved in File.");
    }
}
class DatabasePersistence extends Persistence {
    @Override
    public void persist() {
        System.out.println("Data is being saved in Database.");
    }
}

public class Client {
    public static void main(String[] args) {
        Persistence persistence;
        persistence = new FilePersistence();
        persistence.persist();
    }
}
