package pl.sda.first;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "RandomJson",
        urlPatterns = {"/getRandomNumber", "/randomJson"})
public class RandomJson extends HttpServlet {

    private static final String PARAMETR_NAME = "giveRandomNumbers";
    private static final String EXPECTED_VALUE = "true";

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {
        String giveRandomNumbers = request.getParameter(PARAMETR_NAME);
        if (EXPECTED_VALUE.equals(giveRandomNumbers)) {
            //TODO
        } else {
            System.out.printf("Hello");//print hello on web
        }

        PrintWriter writer = response.getWriter();
        response.setContentType("application/json");
        Random random = new Random();
        writer.println(random.nextInt());
    }
}