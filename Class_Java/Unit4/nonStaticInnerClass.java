class Engine {
    private int horsePower=200;
    private String type = "V8";

    class piston {
        int pistonNum;
        piston(int num){
            pistonNum = num;
        }

        void work(){
            System.out.println("Piston = "+pistonNum +" in "+ type + " engine " + horsePower + " Horse Power");
        }
    }
}


public class nonStaticInnerClass {
    public static void main(String[] args) {
        Engine o = new Engine();
        Engine.piston p1 = o.new piston(1);
        Engine.piston p2 = o.new piston(2);
        p1.work();
        p2.work();
    }
}
