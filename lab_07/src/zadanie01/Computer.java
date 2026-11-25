package zadanie01;

public class Computer {

    private final String model;

    public Computer(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public static class Specifications {

        private final int ramGb;
        private final int diskGb;
        private final String processor;

        public Specifications(int ramGb, int diskGb, String processor) {
            this.ramGb = ramGb;
            this.diskGb = diskGb;
            this.processor = processor;
        }

        public void print() {
            System.out.println("Procesor: " + processor + ", RAM: " + ramGb + " GB, dysk: " + diskGb + " GB");
        }

        // Does not compile: non-static variable model cannot be referenced from a static context
        // public void showModel() {
        //     System.out.println(model);
        // }

        // Works, because we have a concrete Computer. Private fields are visible inside the outer class.
        public void showModel(Computer computer) {
            System.out.println("Model: " + computer.model);
        }
    }
}
