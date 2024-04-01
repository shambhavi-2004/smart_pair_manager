import Controller.Controller;
import Model.Model;
import View.view;

import java.io.IOException;

public class main1 {
    public static void main(String[] args) throws IOException {
        view view = new view();
        Model model = new Model();
        Controller controller = new Controller(model, view);

    }
}
