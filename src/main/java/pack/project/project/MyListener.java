package pack.project.project;


//import model.Fruit;
import pack.project.model.Fruit;

import java.io.IOException;
import java.net.URISyntaxException;

public interface MyListener {
    public void onClickListener(Fruit fruit) throws URISyntaxException, IOException;

}

