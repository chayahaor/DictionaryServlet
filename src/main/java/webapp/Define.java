package webapp;

import com.google.gson.Gson;
import dictionary.ScrabbleDictionary;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Define extends HttpServlet {
    private final ScrabbleDictionary dictionary;
    Gson gson = new Gson();

    public Define() {
        dictionary = new ScrabbleDictionary();
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException {
        String word = request.getParameter("word");
        String definition = dictionary.getDefinition(word);
        if(definition == null){
            definition =  "Invalid word";
        }

        response.setContentType("text/json");
        response.getWriter().println(gson.toJson(definition));
    }
}