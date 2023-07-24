public class Singleton {
        private static Singleton instance;
        private Singleton() {
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public void singletonMethod() {
            System.out.println("Singleton method is called.");
        }

}
