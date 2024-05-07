import HighwayLight.HighwayController;

public class HighwayControlRunner {
    public static void main(String[] args) {
        HighwayController controller = new HighwayController(1,1);

        System.out.println(controller.getLampState());

    }
}
