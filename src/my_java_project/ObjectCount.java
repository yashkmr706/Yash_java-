package my_java_project;

class ObjectCount {
    static int count = 0;   

    ObjectCount() {
        count++;
    }

    public static void main(String[] args) {

        new ObjectCount();
        new ObjectCount();
        new ObjectCount();
        new ObjectCount();
        new ObjectCount();
        new ObjectCount();
        new ObjectCount();

        System.out.println("Total objects " + count);
    }
}