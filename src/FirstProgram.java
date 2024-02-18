import FirstPackage.FirstPackage;


 class FirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        System.out.println("------");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("------");
        FirstPackage o = new FirstPackage(4, 7);
        int i, j;

        System.out.println("A start value = " + o.getA());
        System.out.println("B start value = " + o.getB());
        System.out.println("------");
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setA(i);
                o.setB(j);
                System.out.println("A + B = (" + o.getA() + " + " + o.getB() + ") = " + o.sum(o.getA(), o.getB()));
                System.out.println("A - B = (" + o.getA() + " - " + o.getB() + ") = " + o.sub(o.getA(), o.getB()));
                System.out.println();
            }
            System.out.println("------");
        }

    }
}

